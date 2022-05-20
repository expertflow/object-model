package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;

public class LocationMessage extends StructuredMessage {
    @Valid
    private Location location;

    // Default Constructor
    public LocationMessage() {
        super(MessageType.LOCATION);
    }

    public LocationMessage(@JsonProperty("location") Location location) {
        super(MessageType.LOCATION);
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LocationMessage{" +
                "location=" + location +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}