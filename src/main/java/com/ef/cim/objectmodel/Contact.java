package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

public class Contact {
    @Valid
    private Name name;
    private List<Phone> phones;
    private JsonNode additionalContactDetails;

    public Contact() {
        phones = new ArrayList<>();
    }

    public Contact(Name name, List<Phone> phones, JsonNode additionalContactDetails) {
        this.name = name;
        this.phones = phones;
        this.additionalContactDetails = additionalContactDetails;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public JsonNode getAdditionalContactDetails() {
        return additionalContactDetails;
    }

    public void setAdditionalContactDetails(JsonNode additionalContactDetails) {
        this.additionalContactDetails = additionalContactDetails;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phones=" + phones +
                ", additionalContactDetails=" + additionalContactDetails +
                '}';
    }
}
