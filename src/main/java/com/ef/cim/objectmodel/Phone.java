package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;

public class Phone {
    private String phone;
    private JsonNode additionalPhoneDetails;

    //Default Constructor
    public Phone() {
    }

    //Parameterized Constructor

    public Phone(String phone, JsonNode additionalPhoneDetails) {
        this.phone = phone;
        this.additionalPhoneDetails = additionalPhoneDetails;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public JsonNode getAdditionalPhoneDetails() {
        return additionalPhoneDetails;
    }

    public void setAdditionalPhoneDetails(JsonNode additionalPhoneDetails) {
        this.additionalPhoneDetails = additionalPhoneDetails;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                ", type='" + additionalPhoneDetails + '\'' +
                '}';
    }
}
