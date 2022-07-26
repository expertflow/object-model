package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;

public class CustomerChannelManager implements Participant {
    private String id;
    private String displayName;

    // Default Constructor
    public CustomerChannelManager(String id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public CustomerChannelManager() {
        this.id = Utils.getObjectId();
    }

    // Getters
    public String getId() {
        return this.id;
    }

    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "CustomerChannelManager{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}