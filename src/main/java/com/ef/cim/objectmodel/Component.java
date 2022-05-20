package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;

public class Component {
    private ComponentType type;
    private JsonNode additionalComponentDetails;
    private List<Parameter> parameters;

    public Component() {
    }

    public Component(ComponentType type, JsonNode additionalComponentDetails,
                     List<Parameter> parameters) {
        this.type = type;
        this.additionalComponentDetails = additionalComponentDetails;
        this.parameters = parameters;
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }

    public JsonNode getAdditionalComponentDetails() {
        return additionalComponentDetails;
    }

    public void setAdditionalComponentDetails(JsonNode additionalComponentDetails) {
        this.additionalComponentDetails = additionalComponentDetails;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "Component{" +
                "type=" + type +
                ", additionalComponentDetails=" + additionalComponentDetails +
                ", parameters=" + parameters +
                '}';
    }
}