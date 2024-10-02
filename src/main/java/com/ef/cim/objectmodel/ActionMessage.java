package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.util.HashMap;
import java.util.Map;

public class ActionMessage implements ICimMessage {
    private final String id;
    private MessageHeader header;
    private String name;
    private Map<String, Object> data;

    public ActionMessage() {
        this.id = Utils.getObjectId();
        this.data = new HashMap<>();
    }

    public ActionMessage(String name) {
        this.id = Utils.getObjectId();
        this.name = name;
        this.data = new HashMap<>();
    }

    // Getters
    public String getName() {
        return this.name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public MessageHeader getHeader() {
        return this.header;
    }

    @Override
    public void setHeader(MessageHeader header) {
        this.header = header;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ActionMessage{" +
                "id=" + id +
                ", header=" + header +
                ", name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
