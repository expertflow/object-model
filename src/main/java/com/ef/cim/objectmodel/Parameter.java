package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;

public class Parameter {
    private ParameterType parameterType;
    private JsonNode additionalParameterDetails;

    public Parameter() {
    }

    public Parameter(ParameterType parameterType, JsonNode additionalParameterDetails) {
        this.parameterType = parameterType;
        this.additionalParameterDetails = additionalParameterDetails;
    }

    public ParameterType getParameterType() {
        return parameterType;
    }

    public void setParameterType(ParameterType parameterType) {
        this.parameterType = parameterType;
    }

    public JsonNode getAdditionalParameterDetails() {
        return additionalParameterDetails;
    }

    public void setAdditionalParameterDetails(JsonNode additionalParameterDetails) {
        this.additionalParameterDetails = additionalParameterDetails;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "parameterType=" + parameterType +
                ", additionalParameterDetails=" + additionalParameterDetails +
                '}';
    }
}