package com.ef.cim.objectmodel;

import java.util.UUID;

public class ConversationMonitor implements Participant {
    private UUID id;
    private final String displayName;

    private final String participantType;

    // Default Constructor
    public ConversationMonitor() {
        this.id = UUID.randomUUID();
        this.displayName = "Conversation Monitor: " + this.id.toString();
        this.participantType = "ConversationMonitor";
    }

    public UUID getId() {
        return this.id;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParticipantType() {
        return participantType;
    }

    @Override
    public String toString() {
        return "TopicMonitor{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", participantType='" + participantType + '\'' +
                '}';
    }
}
