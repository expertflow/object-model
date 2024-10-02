package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;
import javax.validation.constraints.NotBlank;

public class Name {
    @NotBlank(message = "formattedName is mandatory")
    private String formattedName;
    private JsonNode additionalNameDetails;

    //Default Constructor
    public Name(String formattedName) {
        this.formattedName = formattedName;
    }

    //Parametrized Constructor
    public Name(String formattedName, JsonNode additionalNameDetails) {
        this.formattedName = formattedName;
        this.additionalNameDetails = additionalNameDetails;
    }

    public Name() {
    }

    public String getFormattedName() {
        return formattedName;
    }

    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }

    public JsonNode getAdditionalNameDetails() {
        return additionalNameDetails;
    }

    public void setAdditionalNameDetails(JsonNode additionalNameDetails) {
        this.additionalNameDetails = additionalNameDetails;
    }

    @Override
    public String toString() {
        return "Name{" +
                "formattedName='" + formattedName + '\'' +
                ", additionalDetails=" + additionalNameDetails +
                '}';
    }
}
