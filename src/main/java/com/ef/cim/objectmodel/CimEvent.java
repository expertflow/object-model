package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class CimEvent implements Serializable {


    private UUID id;
    private CimEventName name;
    private CimEventType type;
    private Timestamp timestamp;

    private UUID conversationId;
    private Object data;

    public CimEvent() {

        this.id = UUID.randomUUID();
    }

    public CimEvent(Object data, CimEventName name, CimEventType type, UUID conversationId) {
        this.id = UUID.randomUUID();
        this.data = data;
        this.name = name;
        this.type = type;
        this.conversationId= conversationId;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public void setId(UUID id) {
        this.id = id;
    }

    // Getters
    public UUID getId() { return id; }


    public CimEventName getName() { return name; }

    public CimEventType getType() { return type; }

    public Timestamp getTimestamp() { return timestamp; }

    public Object getData() { return data; }

    // Setters
    public void setName(CimEventName name) { this.name = name; }

    public void setType(CimEventType type) { this.type = type; }

    public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }

    public void setData(Object data) { this.data = data; }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }
}
