package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class CustomMessage extends MessageBody {

    private JsonNode jsonNode;

    public CustomMessage() {
        super(MessageType.CUSTOM);
    }

    public JsonNode getJsonNode() {
        return jsonNode;
    }

    public void setJsonNode(JsonNode jsonNode) {
        this.jsonNode = jsonNode;
    }

    @Override
    public String toString() {
        return "CustomMessage{" +
                "jsonNode=" + jsonNode +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                '}';
    }
}