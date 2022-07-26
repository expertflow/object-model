package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.io.Serializable;
import java.sql.Timestamp;

public class CimEvent implements Serializable {


    private String id;
    private CimEventName name;
    private CimEventType type;
    private Timestamp timestamp;

    private String conversationId;
    private Object data;

    public CimEvent() {

        this.id = Utils.getObjectId();
    }

    public CimEvent(Object data, CimEventName name, CimEventType type, String conversationId) {
        this.id = Utils.getObjectId();
        this.data = data;
        this.name = name;
        this.type = type;
        this.conversationId= conversationId;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getters
    public String getId() { return id; }


    public CimEventName getName() { return name; }

    public CimEventType getType() { return type; }

    public Timestamp getTimestamp() { return timestamp; }

    public Object getData() { return data; }

    // Setters
    public void setName(CimEventName name) { this.name = name; }

    public void setType(CimEventType type) { this.type = type; }

    public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }

    public void setData(Object data) { this.data = data; }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }
}