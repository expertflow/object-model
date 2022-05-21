package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class ConversationParticipant implements Serializable {
    private final UUID id;
    private ParticipantType type;
    private ParticipantRole role;
    private Participant participant;
    private Timestamp joiningTime;
    private String token;
    private UUID conversationId;
    private boolean isActive;
    private UserCredentials userCredentials; // Class UserCredentials Empty | not in object model
    private ConversationParticipantState state;
    private Timestamp stateChangedOn;

    // Constructor
    public ConversationParticipant(@JsonProperty("type") ParticipantType type,
                            @JsonProperty("role") ParticipantRole role,
                            @JsonProperty("participant") Participant participant) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.role = role;
        this.participant = participant;
        this.isActive = true;

        // TODO: review/discuss if initialization time is indeed the join time?
        this.joiningTime = new Timestamp(System.currentTimeMillis());
//    this.topic = new CustomerTopic();
        this.userCredentials = new UserCredentials();
    }

    // Getters
    public UUID getId() {
        return this.id;
    }

    public ParticipantType getType() {
        return this.type;
    }

    public void setType(ParticipantType type) {
        this.type = type;
    }

    public ParticipantRole getRole() {
        return this.role;
    }

    public void setRole(ParticipantRole role) {
        this.role = role;
    }

    public Participant getParticipant() {
        return this.participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Timestamp getJoiningTime() {
        return this.joiningTime;
    }

    public boolean getIsActive() { return this.isActive; }

    public ConversationParticipantState getState() { return this.state; }

    public Timestamp getStateChangedOn() { return this.stateChangedOn; }


    // Setters

    public void setJoiningTime(Timestamp joiningTime) {
        this.joiningTime = joiningTime;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserCredentials getUserCredentials() {
        return this.userCredentials;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public void setIsActive(boolean active) {
        this.isActive = active;
    }

    public void setState(ConversationParticipantState conversationParticipantState) { this.state =
            conversationParticipantState; }

    public void setStateChangedOn(Timestamp timestamp) { this.stateChangedOn = timestamp; }


    /***
     * String Representation of Conversation
     * @return String
     */
    @Override
    public String toString() {
        return "ConversationParticipant{" +
                "id=" + id +
                ", type=" + type +
                ", role=" + role +
                ", participant=" + participant +
                ", joiningTime=" + joiningTime +
                ", token='" + token + '\'' +
                ", conversationId=" + conversationId +
                ", isActive=" + isActive +
                ", userCredentials=" + userCredentials +
                ", state=" + state +
                ", stateChangedOn=" + stateChangedOn +
                '}';
    }
}
