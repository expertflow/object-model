package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

public class PreChatForm {
    private List<KeyValuePair> attributes;

    // Default Constructor
    public PreChatForm() {
        this.attributes = new ArrayList<KeyValuePair>();
    }

    // Getters
    public List<KeyValuePair> getAttributes() {
        return this.attributes;
    }

    // Setters
    public void setAttributes(List<KeyValuePair> keyValuePairs) {
        this.attributes = keyValuePairs;
    }

    public void addAttribute(KeyValuePair pair) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<KeyValuePair>();
        }
        this.attributes.add(pair);
    }

    public void removeAttribute(KeyValuePair pair) {
        if (this.attributes != null) {
            this.attributes.remove(pair);
        }
    }

    public void removeAttribute(int index) {
        if (this.attributes != null) {
            this.attributes.remove(index);
        }
    }

    @Override
    public String toString() {
        return "PreChatForm{" +
                "attributes=" + attributes +
                '}';
    }
}
