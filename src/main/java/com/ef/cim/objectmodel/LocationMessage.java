package com.ef.cim.objectmodel;

public class LocationMessage extends StructuredMessage {

    private Location location;

    // Default Constructor
    public LocationMessage() {
        super(MessageType.LOCATION);
    }

    public LocationMessage(Location location) {
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
