package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class StructuredMessage extends MessageBody {
    protected JsonNode additionalDetails;

    // Constructor --> Args: markdownText - from parent class
    public StructuredMessage(@JsonProperty("type") String type) {
        super(type);
    }

    public JsonNode getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(JsonNode additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    @Override
    public String toString() {
        return "StructuredMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
