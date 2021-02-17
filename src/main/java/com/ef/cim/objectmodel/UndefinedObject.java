package com.ef.cim.objectmodel;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UndefinedObject implements Serializable {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    /***
     * String Representation of UndefinedObject
     * @return String
     */
    @Override
    public String toString() {
        return "UndefinedObject{" +
                "value='" + value + '\'' +
                '}';
    }
}
