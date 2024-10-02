package com.ef.cim.objectmodel;

public class DefaultAction {
    private String type;
    private String url;

    // Default Constructor
    public DefaultAction() {
    }

    public DefaultAction(String type, String url) {
        this.type = type;
        this.url = url;
    }

    // Getters
    public String getType() {
        return this.type;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "DefaultAction{" +
                "type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}