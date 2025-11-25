package com.ef.cim.objectmodel;

import java.io.Serializable;

public class Review implements Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
