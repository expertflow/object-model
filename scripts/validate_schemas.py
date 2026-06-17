#!/usr/bin/env python3
"""Validate all JSON Schema files under schemas/v1/ (Draft 2020-12)."""
import json
import sys
from pathlib import Path

from jsonschema import Draft202012Validator
from referencing import Registry, Resource

ROOT = Path(__file__).resolve().parent.parent / "schemas" / "v1"


def load_registry() -> Registry:
    resources = []
    for f in sorted(ROOT.rglob("*.json")):
        data = json.loads(f.read_text(encoding="utf-8"))
        resources.append((data["$id"], data))
    return Registry().with_resources(
        (uri, Resource.from_contents(data)) for uri, data in resources
    )


def audit_refs() -> list[str]:
    errors = []
    for f in sorted(ROOT.rglob("*.json")):
        rel = f.relative_to(ROOT)

        def walk(obj):
            if isinstance(obj, dict):
                if "$ref" in obj and not obj["$ref"].startswith("http"):
                    target = (f.parent / obj["$ref"]).resolve()
                    if not target.exists():
                        errors.append(f"{rel}: broken $ref '{obj['$ref']}'")
                for v in obj.values():
                    walk(v)
            elif isinstance(obj, list):
                for item in obj:
                    walk(item)

        data = json.loads(f.read_text(encoding="utf-8"))
        expected_id = f"https://github.com/expertflow/object-model/schemas/v1/{rel.as_posix()}"
        if data.get("$id") != expected_id:
            errors.append(f"{rel}: $id mismatch")
        walk(data)
    return errors


def main() -> int:
    registry = load_registry()
    schema_errors = []
    count = 0
    for f in sorted(ROOT.rglob("*.json")):
        data = json.loads(f.read_text(encoding="utf-8"))
        count += 1
        try:
            Draft202012Validator.check_schema(data)
        except Exception as exc:
            schema_errors.append(f"{f.relative_to(ROOT)}: {exc}")

    ref_errors = audit_refs()
    if ref_errors:
        print("Reference audit failures:")
        for err in ref_errors:
            print(f"  {err}")
    if schema_errors:
        print("Schema syntax failures:")
        for err in schema_errors:
            print(f"  {err}")

    # Golden payload smoke tests
    payload_errors = []
    samples = [
        ("cim-message.json", {
            "id": "msg-001",
            "header": {
                "sender": {"id": "agent-1", "type": "AGENT"},
                "channelData": {
                    "channelCustomerIdentifier": "cust-1",
                    "serviceIdentifier": "svc-1",
                },
                "customer": {"firstName": "Jane", "isAnonymous": False, "__v": 0},
            },
            "body": {"type": "PLAIN", "markdownText": "Hello"},
        }),
        ("task.json", {
            "id": "t1",
            "conversationId": "c1",
            "state": {"name": "ACTIVE"},
            "activeMedia": [],
        }),
        ("customer.json", {"firstName": "John", "isAnonymous": True, "__v": 0}),
    ]
    for schema_file, payload in samples:
        schema = json.loads((ROOT / schema_file).read_text(encoding="utf-8"))
        validator = Draft202012Validator(schema, registry=registry)
        try:
            validator.validate(payload)
        except Exception as exc:
            payload_errors.append(f"{schema_file}: {exc}")

    if payload_errors:
        print("Payload validation failures:")
        for err in payload_errors:
            print(f"  {err}")

    print(f"Checked {count} schemas, {len(ref_errors)} ref errors, "
          f"{len(schema_errors)} syntax errors, {len(payload_errors)} payload errors")

    if ref_errors or schema_errors or payload_errors:
        return 1
    print("All schema checks passed.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
