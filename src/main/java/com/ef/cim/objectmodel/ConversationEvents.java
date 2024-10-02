package com.ef.cim.objectmodel;

import java.util.List;

public class ConversationEvents {

    private final String id;
    private String conversationId;
    private List<CimEvent> cimEvents;

    // Getters
    public ConversationEvents(String id) { this.id = id; }

    public String getId() { return id; }

    public String getConversationId() { return conversationId; }

    public List<CimEvent> getCimEvents() { return cimEvents; }

    // Setters

    public void setConversationId(String conversationId) { this.conversationId = conversationId; }

    public void setCimEvents(List<CimEvent> cimEvents) { this.cimEvents = cimEvents; }
}