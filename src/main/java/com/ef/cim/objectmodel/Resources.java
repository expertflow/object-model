package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Resources implements Serializable {
    private List<Resource> Resources;

    @JsonProperty("Resources")
    public List<Resource> getResources() {
        return Resources;
    }

    @JsonProperty("Resources")
    public void setResources(List<Resource> Resources) {
        this.Resources = Resources;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "Resources=" + Resources +
                '}';
    }
}