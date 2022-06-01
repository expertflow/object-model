package com.ef.cim.objectmodel;

import java.util.List;
import java.util.UUID;

public class ConversationEvents {

    private final UUID id;
    private UUID conversationId;
    private List<CimEvent> cimEvents;

    // Getters
    public ConversationEvents(UUID id) { this.id = id; }

    public UUID getId() { return id; }

    public UUID getConversationId() { return conversationId; }

    public List<CimEvent> getCimEvents() { return cimEvents; }

    // Setters

    public void setConversationId(UUID conversationId) { this.conversationId = conversationId; }

    public void setCimEvents(List<CimEvent> cimEvents) { this.cimEvents = cimEvents; }
}