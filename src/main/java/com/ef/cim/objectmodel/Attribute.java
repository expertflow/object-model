package com.ef.cim.objectmodel;

import java.io.Serializable;

public class Attribute implements Serializable {
    private String key;
    private ValueType type;
    private Object value;

    public Attribute() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ValueType getType() {
        return type;
    }

    public void setType(ValueType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "key='" + key + '\'' +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
