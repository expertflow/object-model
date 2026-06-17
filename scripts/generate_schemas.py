#!/usr/bin/env python3
"""Generate JSON Schema Draft 2020-12 files from CX Object Model blueprint."""
import json
import os

BASE_ID = "https://github.com/expertflow/object-model/schemas/v1"
ROOT = os.path.join(os.path.dirname(__file__), "..", "schemas", "v1")

JSON_NODE = {"type": ["object", "array", "string", "number", "boolean", "null"]}
OPEN_OBJECT = {"type": "object", "additionalProperties": True}
MAP_OBJECT = {"type": "object", "additionalProperties": True}
OPAQUE = JSON_NODE


def sid(path: str) -> str:
    return f"{BASE_ID}/{path}"


def write(path: str, doc: dict) -> None:
    full = os.path.join(ROOT, path)
    os.makedirs(os.path.dirname(full), exist_ok=True)
    with open(full, "w", encoding="utf-8") as f:
        json.dump(doc, f, indent=2)
        f.write("\n")


def root(path: str, title: str, body: dict) -> dict:
    return {
        "$schema": "https://json-schema.org/draft/2020-12/schema",
        "$id": sid(path),
        "title": title,
        **body,
    }


def ref(r: str) -> dict:
    return {"$ref": r}


def obj(props: dict, required=None, additional=None) -> dict:
    s: dict = {"type": "object", "properties": props}
    if required:
        s["required"] = required
    if additional is not None:
        s["additionalProperties"] = additional
    return s


def arr(item) -> dict:
    return {"type": "array", "items": item}


def str_field(min_len=None) -> dict:
    s: dict = {"type": "string"}
    if min_len:
        s["minLength"] = min_len
    return s


def enum_doc(path: str, title: str, values: list) -> None:
    write(path, root(path, title, {"type": "string", "enum": values}))


def main() -> None:
    # --- Enums ---
    enums = {
        "enums/task-state-name.json": ("TaskStateName", ["ACTIVE", "WRAP_UP", "CLOSED"]),
        "enums/task-state-reason-code.json": (
            "TaskStateReasonCode",
            [
                "RONA", "DONE", "RESPONSE_TIMEOUT", "NO_AGENT_AVAILABLE", "REROUTE",
                "CANCELLED", "AGENT_LOGOUT", "TRANSFERRED", "FORCE_CLOSED",
                "WRAP_UP_APPLIED", "WRAP_UP_NOT_APPLIED", "WRAP_UP_EXPIRED",
                "EXTERNAL_CONSULT_TRANSFER", "EXTERNAL_DIRECT_TRANSFER",
                "EXTERNAL_CONSULT_CONFERENCE", "CONFERENCE_ENDED",
                "CONFERENCE_CUSTOMER_LEFT", "CALLBACK",
            ],
        ),
        "enums/task-type-direction.json": (
            "TaskTypeDirection",
            [
                "CONSULT", "CONSULT_TRANSFER", "CONSULT_CONFERENCE", "DIRECT_TRANSFER",
                "DIRECT_CONFERENCE", "INBOUND", "OUTBOUND", "SILENT_MONITOR", "BARGE_IN",
            ],
        ),
        "enums/task-type-mode.json": ("TaskTypeMode", ["AGENT", "QUEUE"]),
        "enums/task-media-state.json": (
            "TaskMediaState",
            ["STARTED", "QUEUED", "RESERVED", "ACTIVE", "CLOSED"],
        ),
        "enums/message-intent.json": (
            "MessageIntent",
            [
                "NONE", "REPLY_TO", "UPDATE", "START_CHAT", "END_CHAT", "CALL_LEG_STARTED",
                "CALL_LEG_ENDED", "AGENT_OUTBOUND", "START_VOICE", "END_VOICE",
                "NETWORK_DISCONNECT", "ASSIGN_RESOURCE_REQUESTED", "CANCEL_RESOURCE_REQUESTED",
                "IVR_AGGREGATED_ACTIVITY", "START_CONVERSATION", "CALL_HOLD", "CALL_RESUME",
                "VOICE_CALL_RECORDING", "WRAPUP", "MEDIA_RECORDING", "QM_ACTIVITY", "CALL_ALERTING",
            ],
        ),
        "enums/value-type.json": (
            "ValueType",
            [
                "Alphanum100", "AlphanumSpecial200", "String2000", "String50", "String100",
                "PositiveNumber", "IP", "Number", "PhoneNumber", "URL", "Boolean", "Email",
                "Password", "StringList", "WebChannelData",
            ],
        ),
        "enums/delivery-status.json": (
            "DeliveryStatus",
            ["DELIVERED", "READ", "CONNECTED", "FAILED"],
        ),
        "enums/notification-type.json": (
            "NotificationType",
            [
                "INFO", "SYSTEM_ERROR", "WARNING", "CHANNEL_SESSION_STARTED",
                "CHANNEL_SESSION_EXPIRED", "CHANNEL_SESSION_ENDED", "AGENT_SUBSCRIBED",
                "AGENT_UNSUBSCRIBED", "TASK_ENQUEUED", "NO_AGENT_AVAILABLE",
                "TYPING_STARTED", "TYPING_STOPPED", "AGENT_RESERVED",
                "PARTICIPANT_ROLE_CHANGED", "TASK_STATE_CHANGED",
                "CHANNEL_SESSION_DATA_UPDATED", "ADVISOR_SUBSCRIBED",
                "ROOM_MEMBER_STATUS_CHANGED",
            ],
        ),
        "enums/button-message-type.json": ("ButtonMessageType", ["BUTTON", "QUICK_REPLIES"]),
        "enums/carousel-message-type.json": (
            "CarouselMessageType",
            ["MEDIA", "GENERIC_RICH_MEDIA"],
        ),
        "enums/item-type.json": (
            "ItemType",
            ["VIDEO", "TEXT", "IMAGE", "LIKE", "UNLIKE", "DELETE", "HIDE", "PRIVATE_REPLY"],
        ),
        "enums/attribute-type.json": ("AttributeType", ["INPUT", "OPTIONS", "TEXTAREA"]),
        "enums/component-type.json": ("ComponentType", ["header", "body", "button"]),
        "enums/parameter-type.json": (
            "ParameterType",
            ["text", "currency", "date_time", "image", "document", "video", "payload"],
        ),
        "enums/channel-session-state-enum.json": (
            "ChannelSessionStateEnum",
            ["STARTED", "ENDED", "CLOSED"],
        ),
        "enums/direction.json": ("Direction", ["INBOUND", "OUTBOUND"]),
        "enums/room-mode.json": ("RoomMode", ["PRIVATE", "CONTACT_CENTER"]),
        "enums/channel-mode.json": ("ChannelMode", ["BOT", "AGENT", "HYBRID"]),
        "enums/routing-mode.json": ("RoutingMode", ["PUSH", "PULL", "EXTERNAL"]),
        "enums/routing-attribute-type.json": (
            "RoutingAttributeType",
            ["BOOLEAN", "PROFICIENCY_LEVEL"],
        ),
        "enums/agent-selection-policy.json": (
            "AgentSelectionPolicy",
            ["LEAST_SKILLED", "MOST_SKILLED", "LONGEST_AVAILABLE"],
        ),
        "enums/mrd-type-name.json": (
            "MrdTypeName",
            ["CHAT", "CX_VOICE", "CISCO_CC", "EMAIL"],
        ),
    }
    for path, (title, values) in enums.items():
        enum_doc(path, title, values)

    # --- Placeholders ---
    write("language-code.json", root("language-code.json", "LanguageCode", OPEN_OBJECT))
    write("message-security.json", root("message-security.json", "MessageSecurity", OPEN_OBJECT))
    write(
        "undefined-object.json",
        root("undefined-object.json", "UndefinedObject", obj({"value": {"type": "string"}})),
    )

    # --- Shared leaves ---
    write(
        "customer.json",
        root(
            "customer.json",
            "Customer",
            obj(
                {
                    "_id": {"type": "string"},
                    "firstName": {"type": "string"},
                    "phoneNumber": arr({"type": "string"}),
                    "isAnonymous": {"type": "boolean"},
                    "__v": {"type": "integer"},
                },
                additional=True,
            ),
        ),
    )
    write(
        "sender.json",
        root(
            "sender.json",
            "Sender",
            obj(
                {
                    "id": str_field(1),
                    "type": {"type": "string"},
                    "senderName": {"type": "string"},
                    "additionalDetail": MAP_OBJECT,
                },
                required=["id", "type"],
            ),
        ),
    )
    write(
        "attribute.json",
        root(
            "attribute.json",
            "Attribute",
            obj(
                {
                    "key": {"type": "string"},
                    "type": ref("enums/value-type.json"),
                    "value": OPAQUE,
                }
            ),
        ),
    )
    write(
        "channel-data.json",
        root(
            "channel-data.json",
            "ChannelData",
            obj(
                {
                    "channelCustomerIdentifier": str_field(1),
                    "serviceIdentifier": str_field(1),
                    "requestPriority": {"type": "integer"},
                    "customerFirstName": {"type": "string"},
                    "customerLastName": {"type": "string"},
                    "additionalAttributes": arr(ref("attribute.json")),
                },
                required=["channelCustomerIdentifier", "serviceIdentifier"],
            ),
        ),
    )
    write(
        "task-agent.json",
        root(
            "task-agent.json",
            "TaskAgent",
            obj({"id": {"type": "string"}, "name": {"type": "string"}}),
        ),
    )
    write(
        "task-queue.json",
        root(
            "task-queue.json",
            "TaskQueue",
            obj({"id": {"type": "string"}, "name": {"type": "string"}}),
        ),
    )
    write(
        "tenant.json",
        root(
            "tenant.json",
            "Tenant",
            obj({"id": {"type": "string"}, "name": {"type": "string"}}),
        ),
    )

    # --- Task subtree ---
    write(
        "task-state.json",
        root(
            "task-state.json",
            "TaskState",
            obj(
                {
                    "name": ref("enums/task-state-name.json"),
                    "reasonCode": ref("enums/task-state-reason-code.json"),
                },
                required=["name"],
            ),
        ),
    )
    write(
        "task-type.json",
        root(
            "task-type.json",
            "TaskType",
            obj(
                {
                    "direction": ref("enums/task-type-direction.json"),
                    "mode": ref("enums/task-type-mode.json"),
                    "metadata": MAP_OBJECT,
                }
            ),
        ),
    )

    # --- Channel subtree ---
    write(
        "room-info.json",
        root(
            "room-info.json",
            "RoomInfo",
            obj({"id": {"type": "string"}, "mode": ref("enums/room-mode.json")}),
        ),
    )
    write(
        "customer-sla.json",
        root(
            "customer-sla.json",
            "CustomerSla",
            obj(
                {
                    "totalDuration": {"type": "integer"},
                    "action": {"type": "string"},
                    "startTime": {"type": "string"},
                }
            ),
        ),
    )
    write(
        "routing-policy.json",
        root(
            "routing-policy.json",
            "RoutingPolicy",
            obj(
                {
                    "agentSelectionPolicy": ref("enums/agent-selection-policy.json"),
                    "routeToLastAgent": {"type": "boolean"},
                    "routingMode": ref("enums/routing-mode.json"),
                    "routingObjectId": {"type": "string"},
                    "agentRequestTtl": {"type": "integer"},
                }
            ),
        ),
    )
    write(
        "channel-session-state.json",
        root(
            "channel-session-state.json",
            "ChannelSessionState",
            obj(
                {
                    "name": ref("enums/channel-session-state-enum.json"),
                    "reasonCode": {"type": "string"},
                }
            ),
        ),
    )
    write(
        "channel-type.json",
        root(
            "channel-type.json",
            "ChannelType",
            obj(
                {
                    "id": {"type": "string"},
                    "name": str_field(1),
                    "channelLogo": {"type": "string"},
                    "isInteractive": {"type": "boolean"},
                    "mediaRoutingDomain": {"type": "string"},
                    "isDeleted": {"type": "boolean"},
                },
                required=["name"],
            ),
        ),
    )
    write(
        "category.json",
        root(
            "category.json",
            "Category",
            obj(
                {
                    "categoryName": {"type": "string"},
                    "values": arr({"type": "string"}),
                }
            ),
        ),
    )
    write(
        "category-options.json",
        root(
            "category-options.json",
            "CategoryOptions",
            obj(
                {
                    "isMultipleChoice": {"type": "boolean"},
                    "categories": arr(ref("category.json")),
                }
            ),
        ),
    )
    write(
        "attribute-schema.json",
        root(
            "attribute-schema.json",
            "AttributeSchema",
            obj(
                {
                    "attributeType": ref("enums/attribute-type.json"),
                    "categoryOptions": ref("category-options.json"),
                    "isRequired": {"type": "boolean"},
                    "helpText": {"type": "string"},
                    "key": {"type": "string"},
                    "label": {"type": "string"},
                    "valueType": ref("enums/value-type.json"),
                }
            ),
        ),
    )
    write(
        "channel-provider-interface.json",
        root(
            "channel-provider-interface.json",
            "ChannelProviderInterface",
            obj(
                {
                    "id": {"type": "string"},
                    "name": {"type": "string"},
                    "supportedChannelTypes": arr(ref("channel-type.json")),
                    "providerWebhook": {"type": "string"},
                    "channelProviderConfigSchema": arr(ref("attribute-schema.json")),
                }
            ),
        ),
    )
    write(
        "channel-config.json",
        root(
            "channel-config.json",
            "ChannelConfig",
            obj(
                {
                    "id": {"type": "string"},
                    "channelMode": ref("enums/channel-mode.json"),
                    "conversationBot": {"type": "string"},
                    "responseSla": {"type": "integer"},
                    "customerActivityTimeout": {"type": "integer"},
                    "customerSla": ref("customer-sla.json"),
                    "customerIdentificationCriteria": ref("undefined-object.json"),
                    "routingPolicy": ref("routing-policy.json"),
                    "botId": {"type": "string"},
                },
                required=[
                    "channelMode",
                    "responseSla",
                    "customerActivityTimeout",
                    "customerIdentificationCriteria",
                    "routingPolicy",
                    "botId",
                ],
            ),
        ),
    )
    write(
        "channel-connector.json",
        root(
            "channel-connector.json",
            "ChannelConnector",
            obj(
                {
                    "id": {"type": "string"},
                    "name": str_field(1),
                    "channelProviderInterface": ref("channel-provider-interface.json"),
                    "channelProviderConfigs": arr(ref("attribute.json")),
                    "tenant": ref("tenant.json"),
                },
                required=["name"],
            ),
        ),
    )
    write(
        "channel.json",
        root(
            "channel.json",
            "Channel",
            obj(
                {
                    "id": {"type": "string"},
                    "calendarId": {"type": "string"},
                    "name": str_field(1),
                    "serviceIdentifier": str_field(1),
                    "defaultOutbound": {"type": "boolean"},
                    "tenant": ref("tenant.json"),
                    "channelConfig": ref("channel-config.json"),
                    "channelConnector": ref("channel-connector.json"),
                    "channelType": ref("channel-type.json"),
                },
                required=["name", "serviceIdentifier", "defaultOutbound"],
            ),
        ),
    )
    write(
        "channel-session.json",
        root(
            "channel-session.json",
            "ChannelSession",
            obj(
                {
                    "id": {"type": "string"},
                    "participantType": {"type": "string"},
                    "channel": ref("channel.json"),
                    "customer": ref("customer.json"),
                    "customerSuggestions": arr(ref("customer.json")),
                    "channelData": ref("channel-data.json"),
                    "latestIntent": {"type": "string"},
                    "customerPresence": ref("undefined-object.json"),
                    "isActive": {"type": "boolean"},
                    "conversationId": {"type": "string"},
                    "roomInfo": ref("room-info.json"),
                    "state": ref("channel-session-state.json"),
                    "channelSessionDirection": ref("enums/direction.json"),
                },
                required=["isActive"],
            ),
        ),
    )
    write(
        "task-media.json",
        root(
            "task-media.json",
            "TaskMedia",
            obj(
                {
                    "id": {"type": "string"},
                    "mrdId": {"type": "string"},
                    "taskId": {"type": "string"},
                    "queue": ref("task-queue.json"),
                    "type": ref("task-type.json"),
                    "priority": {"type": "integer"},
                    "state": ref("enums/task-media-state.json"),
                    "requestSession": ref("channel-session.json"),
                    "channelSessions": arr(ref("channel-session.json")),
                    "enqueueTime": {"type": "integer"},
                    "answerTime": {"type": "integer"},
                }
            ),
        ),
    )
    write(
        "task.json",
        root(
            "task.json",
            "Task",
            obj(
                {
                    "id": {"type": "string"},
                    "conversationId": {"type": "string"},
                    "state": ref("task-state.json"),
                    "assignedTo": ref("task-agent.json"),
                    "agentRequestTtlTimerId": {"type": "string"},
                    "activeMedia": arr(ref("task-media.json")),
                }
            ),
        ),
    )

    # --- Nested message types ---
    write(
        "attachment.json",
        root(
            "attachment.json",
            "Attachment",
            obj(
                {
                    "mediaUrl": str_field(1),
                    "thumbnail": {"type": "string"},
                    "mimeType": {"type": "string"},
                    "size": {"type": "integer"},
                    "mediaLabel": {"type": "string"},
                    "mediaName": {"type": "string"},
                },
                required=["mediaUrl"],
            ),
        ),
    )
    write(
        "button.json",
        root(
            "button.json",
            "Button",
            obj(
                {
                    "title": str_field(1),
                    "payload": str_field(1),
                    "type": str_field(1),
                    "additionalButtonDetails": JSON_NODE,
                },
                required=["title", "payload", "type"],
            ),
        ),
    )
    write(
        "default-action.json",
        root(
            "default-action.json",
            "DefaultAction",
            obj({"type": {"type": "string"}, "url": {"type": "string"}}),
        ),
    )
    write(
        "carousel-element.json",
        root(
            "carousel-element.json",
            "CarouselElement",
            obj(
                {
                    "text": {"type": "string"},
                    "url": {"type": "string"},
                    "buttons": arr(ref("button.json")),
                    "defaultAction": ref("default-action.json"),
                    "additionalCarouselElementDetails": JSON_NODE,
                }
            ),
        ),
    )
    write(
        "location.json",
        root(
            "location.json",
            "Location",
            obj(
                {"latitude": {"type": "number"}, "longitude": {"type": "number"}},
                required=["latitude", "longitude"],
            ),
        ),
    )
    write(
        "name.json",
        root(
            "name.json",
            "Name",
            obj(
                {
                    "formattedName": str_field(1),
                    "additionalNameDetails": JSON_NODE,
                },
                required=["formattedName"],
            ),
        ),
    )
    write(
        "phone.json",
        root(
            "phone.json",
            "Phone",
            obj(
                {"phone": {"type": "string"}, "additionalPhoneDetails": JSON_NODE}
            ),
        ),
    )
    write(
        "contact.json",
        root(
            "contact.json",
            "Contact",
            obj(
                {
                    "name": ref("name.json"),
                    "phones": arr(ref("phone.json")),
                    "additionalContactDetails": JSON_NODE,
                }
            ),
        ),
    )
    write(
        "language.json",
        root(
            "language.json",
            "Language",
            obj(
                {"code": str_field(1), "policy": str_field(1)},
                required=["code", "policy"],
            ),
        ),
    )
    write(
        "parameter.json",
        root(
            "parameter.json",
            "Parameter",
            obj(
                {
                    "parameterType": ref("enums/parameter-type.json"),
                    "additionalParameterDetails": JSON_NODE,
                }
            ),
        ),
    )
    write(
        "component.json",
        root(
            "component.json",
            "Component",
            obj(
                {
                    "type": ref("enums/component-type.json"),
                    "additionalComponentDetails": JSON_NODE,
                    "parameters": arr(ref("parameter.json")),
                }
            ),
        ),
    )
    write(
        "receipt-element.json",
        root(
            "receipt-element.json",
            "ReceiptElement",
            obj(
                {
                    "title": {"type": "string"},
                    "subtitle": {"type": "string"},
                    "quantity": {"type": "integer"},
                    "price": {"type": "integer"},
                    "currency": {"type": "string"},
                    "imageUrl": {"type": "string"},
                }
            ),
        ),
    )
    write(
        "address.json",
        root(
            "address.json",
            "Address",
            obj(
                {
                    "street1": {"type": "string"},
                    "street2": {"type": "string"},
                    "city": {"type": "string"},
                    "postalCode": {"type": "string"},
                    "state": {"type": "string"},
                    "country": {"type": "string"},
                }
            ),
        ),
    )
    write(
        "receipt-summary.json",
        root(
            "receipt-summary.json",
            "ReceiptSummary",
            obj(
                {
                    "subtotal": {"type": "integer"},
                    "shippingCost": {"type": "integer"},
                    "totalTax": {"type": "integer"},
                    "totalCost": {"type": "integer"},
                }
            ),
        ),
    )
    write(
        "receipt-adjustment.json",
        root(
            "receipt-adjustment.json",
            "ReceiptAdjustment",
            obj({"name": {"type": "string"}, "amount": {"type": "integer"}}),
        ),
    )
    write(
        "sentiment.json",
        root(
            "sentiment.json",
            "Sentiment",
            obj({"result": {"type": "string"}, "color": {"type": "string"}}),
        ),
    )

    # --- Message body hierarchy ---
    write(
        "message-body-base.json",
        root(
            "message-body-base.json",
            "MessageBody",
            obj(
                {"type": {"type": "string"}, "markdownText": {"type": "string"}},
                required=["type"],
            ),
        ),
    )

    def body_subtype(path: str, title: str, const_type: str, extra_props: dict = None, extra_required=None, base_ref="message-body-base.json", additional=None):
        props = {"type": {"const": const_type}}
        if extra_props:
            props.update(extra_props)
        required = ["type"]
        if extra_required:
            required.extend(extra_required)
        write(
            path,
            root(
                path,
                title,
                {
                    "allOf": [
                        ref(base_ref),
                        obj(props, required=required, additional=additional),
                    ]
                },
            ),
        )

    write(
        "structured-message-body.json",
        root(
            "structured-message-body.json",
            "StructuredMessage",
            {
                "allOf": [
                    ref("message-body-base.json"),
                    obj({"additionalDetails": JSON_NODE}),
                ]
            },
        ),
    )

    write(
        "multimedia-message-body.json",
        root(
            "multimedia-message-body.json",
            "MultimediaMessage",
            {
                "allOf": [
                    ref("structured-message-body.json"),
                    obj(
                        {
                            "caption": {"type": "string"},
                            "attachment": ref("attachment.json"),
                        }
                    ),
                ]
            },
        ),
    )

    body_subtype("plain-message-body.json", "PlainMessageBody", "PLAIN")
    body_subtype(
        "delivery-notification-message-body.json",
        "DeliveryNotification",
        "DELIVERYNOTIFICATION",
        {
            "messageId": {"type": "string"},
            "status": ref("enums/delivery-status.json"),
            "reasonCode": {"type": "string"},
        },
    )
    body_subtype(
        "deleted-notification-message-body.json",
        "DeletedNotification",
        "DELETEDNOTIFICATION",
        {
            "messageId": {"type": "string"},
            "timestamp": {"type": "string", "format": "date-time"},
        },
    )
    body_subtype(
        "custom-message-body.json",
        "CustomMessage",
        "CUSTOM",
        {"jsonNode": JSON_NODE},
    )
    body_subtype(
        "structured-only-message-body.json",
        "StructuredMessageBody",
        "StructuredMessage",
        {"additionalDetails": JSON_NODE},
    )
    body_subtype(
        "notification-message-body.json",
        "NotificationMessage",
        "NOTIFICATION",
        {
            "notificationType": ref("enums/notification-type.json"),
            "notificationData": MAP_OBJECT,
        },
    )
    body_subtype(
        "multimedia-only-message-body.json",
        "MultimediaOnlyMessageBody",
        "MULTIMEDIA",
        {"caption": {"type": "string"}, "attachment": ref("attachment.json")},
        base_ref="structured-message-body.json",
    )

    for media_type, fname in [
        ("VIDEO", "video-message-body.json"),
        ("IMAGE", "image-message-body.json"),
        ("AUDIO", "audio-message-body.json"),
        ("FILE", "file-message-body.json"),
    ]:
        write(
            fname,
            root(
                fname,
                f"{media_type.title()}Message",
                {
                    "allOf": [
                        ref("multimedia-message-body.json"),
                        obj({"type": {"const": media_type}}, required=["type"]),
                    ]
                },
            ),
        )

    body_subtype(
        "url-message-body.json",
        "UrlMessage",
        "URL",
        {"mediaUrl": str_field(1), "additionalDetails": JSON_NODE},
        extra_required=["mediaUrl"],
        base_ref="structured-message-body.json",
    )
    body_subtype(
        "sticker-message-body.json",
        "StickerMessage",
        "STICKER",
        {
            "mediaUrl": {"type": "string"},
            "stickerId": {"type": "string"},
            "additionalDetails": JSON_NODE,
        },
        base_ref="structured-message-body.json",
    )
    body_subtype(
        "button-message-body.json",
        "ButtonMessage",
        "BUTTON",
        {
            "buttons": arr(ref("button.json")),
            "buttonMessageType": ref("enums/button-message-type.json"),
            "additionalDetails": JSON_NODE,
        },
        base_ref="structured-message-body.json",
    )
    body_subtype(
        "carousel-message-body.json",
        "CarouselMessage",
        "CAROUSEL",
        {
            "carouselMessageType": ref("enums/carousel-message-type.json"),
            "elements": arr(ref("carousel-element.json")),
            "additionalDetails": JSON_NODE,
        },
        base_ref="structured-message-body.json",
    )
    body_subtype(
        "location-message-body.json",
        "LocationMessage",
        "LOCATION",
        {"location": ref("location.json"), "additionalDetails": JSON_NODE},
        base_ref="structured-message-body.json",
    )
    body_subtype(
        "contact-message-body.json",
        "ContactMessage",
        "CONTACT",
        {"contacts": arr(ref("contact.json")), "additionalDetails": JSON_NODE},
        base_ref="structured-message-body.json",
    )
    body_subtype(
        "template-message-body.json",
        "TemplateMessage",
        "TEMPLATE",
        {
            "namespace": str_field(1),
            "name": str_field(1),
            "language": ref("language.json"),
            "components": arr(ref("component.json")),
            "additionalDetails": JSON_NODE,
        },
        extra_required=["namespace", "name"],
        base_ref="structured-message-body.json",
    )
    write(
        "receipt-template-message-body.json",
        root(
            "receipt-template-message-body.json",
            "ReceiptTemplateMessage",
            {
                "allOf": [
                    ref("structured-message-body.json"),
                    obj(
                        {
                            "type": {"const": "RECEIPT"},
                            "templateType": {"type": "string", "const": "receipt"},
                            "sharable": {"type": "boolean"},
                            "recipientName": {"type": "string"},
                            "merchantName": {"type": "string"},
                            "orderNumber": {"type": "string"},
                            "currency": {"type": "string"},
                            "paymentMethode": {"type": "string"},
                            "timestamp": {"type": "string"},
                            "elements": arr(ref("receipt-element.json")),
                            "address": ref("address.json"),
                            "summary": ref("receipt-summary.json"),
                            "adjustments": arr(ref("receipt-adjustment.json")),
                        },
                        required=["type"],
                    ),
                ]
            },
        ),
    )
    body_subtype(
        "wrap-up-message-body.json",
        "WrapUpMessage",
        "WRAPUP",
        {"note": {"type": "string"}, "wrapups": arr(OPAQUE)},
    )
    body_subtype(
        "voice-message-body.json",
        "VoiceMessage",
        "VOICE",
        {
            "callId": {"type": "string"},
            "leg": {"type": "string"},
            "reasonCode": {"type": "string"},
        },
        additional=True,
    )
    body_subtype(
        "action-message-body.json",
        "ActionMessageBody",
        "ACTION",
        {"name": {"type": "string"}, "data": MAP_OBJECT},
    )
    body_subtype(
        "comment-message-body.json",
        "CommentMessage",
        "COMMENT",
        {
            "postId": {"type": "string"},
            "itemType": ref("enums/item-type.json"),
            "attachment": ref("attachment.json"),
            "additionalData": MAP_OBJECT,
        },
        extra_required=["postId", "itemType"],
    )
    write(
        "email-message-body.json",
        root(
            "email-message-body.json",
            "EmailMessage",
            {
                "allOf": [
                    ref("message-body-base.json"),
                    obj(
                        {
                            "type": {"const": "EMAIL"},
                            "subject": {"type": "string"},
                            "from": {"type": "string"},
                            "replyTo": arr({"type": "string"}),
                            "receivingDate": {"type": "integer"},
                            "htmlBody": {"type": "string"},
                            "recipientsTo": arr({"type": "string"}),
                            "recipientsCc": arr({"type": "string"}),
                            "recipientsBcc": arr({"type": "string"}),
                            "emailThreads": arr({"type": "string"}),
                            "attachments": arr(ref("attachment.json")),
                            "additionalDetails": JSON_NODE,
                        },
                        required=["type"],
                    ),
                ]
            },
        ),
    )
    write(
        "form-data-message-body.json",
        root(
            "form-data-message-body.json",
            "FormData",
            {
                "allOf": [
                    ref("structured-message-body.json"),
                    obj(
                        {
                            "formId": {"type": "string"},
                            "type": {"type": "string"},
                            "formTitle": {"type": "string"},
                            "enableSections": {"type": "boolean"},
                            "attributeType": ref("enums/attribute-type.json"),
                            "enableWeightage": {"type": "boolean"},
                            "formWeightage": OPAQUE,
                            "formDescription": {"type": "string"},
                            "formScore": OPAQUE,
                            "additionalDetail": MAP_OBJECT,
                            "sentiment": ref("sentiment.json"),
                            "sections": arr(OPAQUE),
                        },
                        required=["formId", "type", "formTitle"],
                    ),
                ]
            },
        ),
    )
    write(
        "generic-message-body.json",
        root(
            "generic-message-body.json",
            "GenericMessage",
            {
                "allOf": [
                    ref("message-body-base.json"),
                    {"type": "object", "additionalProperties": True},
                ]
            },
        ),
    )

    body_refs = [
        "delivery-notification-message-body.json",
        "deleted-notification-message-body.json",
        "custom-message-body.json",
        "structured-only-message-body.json",
        "notification-message-body.json",
        "multimedia-only-message-body.json",
        "video-message-body.json",
        "image-message-body.json",
        "audio-message-body.json",
        "file-message-body.json",
        "contact-message-body.json",
        "location-message-body.json",
        "carousel-message-body.json",
        "button-message-body.json",
        "plain-message-body.json",
        "voice-message-body.json",
        "url-message-body.json",
        "sticker-message-body.json",
        "receipt-template-message-body.json",
        "wrap-up-message-body.json",
        "template-message-body.json",
        "action-message-body.json",
        "comment-message-body.json",
        "email-message-body.json",
        "form-data-message-body.json",
    ]

    write(
        "message-body.json",
        root(
            "message-body.json",
            "MessageBodyPolymorphic",
            {"oneOf": [ref(r) for r in body_refs]},
        ),
    )

    write(
        "message-header.json",
        root(
            "message-header.json",
            "MessageHeader",
            obj(
                {
                    "sender": ref("sender.json"),
                    "channelData": ref("channel-data.json"),
                    "language": ref("language-code.json"),
                    "timestamp": {"type": "string", "format": "date-time"},
                    "securityInfo": ref("message-security.json"),
                    "stamps": arr({"type": "string"}),
                    "intent": ref("enums/message-intent.json"),
                    "entities": MAP_OBJECT,
                    "channelSessionId": {"type": "string"},
                    "conversationId": {"type": "string"},
                    "customer": ref("customer.json"),
                    "originalMessageId": {"type": "string"},
                    "providerMessageId": {"type": "string"},
                    "schedulingMetaData": MAP_OBJECT,
                    "roomId": {"type": "string"},
                    "additionalData": MAP_OBJECT,
                }
            ),
        ),
    )

    write(
        "cim-message.json",
        root(
            "cim-message.json",
            "CimMessage",
            obj(
                {
                    "id": {"type": "string"},
                    "header": ref("message-header.json"),
                    "body": ref("message-body.json"),
                },
                required=["id"],
            ),
        ),
    )

    count = sum(len(files) for _, _, files in os.walk(ROOT))
    print(f"Generated {count} schema files under {ROOT}")


if __name__ == "__main__":
    main()
