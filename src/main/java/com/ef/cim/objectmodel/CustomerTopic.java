package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerTopic implements Serializable {
    private final UUID id;
    private Customer customer;
    private List<TopicParticipant> participants;
    private TopicState state;
    private ChannelSession channelSession;
    private Timestamp creationTime;
    private TopicMetadata metadata;


    // Default Constructor
    public CustomerTopic() {
        this.id = UUID.randomUUID();
        this.participants = new ArrayList<>();
        this.metadata = new TopicMetadata();
    }

    public CustomerTopic(UUID topicId, TopicState state, ChannelSession channelSession) {
        this.id = topicId;
        this.customer = channelSession.getCustomer();
        this.state = state;
        this.channelSession = channelSession;
        this.creationTime = new Timestamp(System.currentTimeMillis());
        this.metadata = new TopicMetadata(channelSession);
        this.participants = new ArrayList<>();
    }

    // Getters
    public UUID getId() {
        return this.id;
    }

    public List<TopicParticipant> getParticipants() {
        return this.participants;
    }

    public TopicState getState() {
        return this.state;
    }

    // Setters
    public void setParticipants(List<TopicParticipant> participants) {
        this.participants = participants;
    }

    public void setState(TopicState topicState) {
        this.state = topicState;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addParticipant(TopicParticipant participant) {
        if (this.participants == null) {
            this.participants = new ArrayList<TopicParticipant>();
        }
        this.participants.add(participant);
    }

    public void removeParticipant(TopicParticipant participant) {
        if (this.participants != null) {
            this.participants.remove(participant);
        }
    }

    public void removeParticipant(int index) {
        if (this.participants != null) {
            this.participants.remove(index);
        }
    }

    public ChannelSession getChannelSession() {
        return channelSession;
    }

    public void setChannelSession(ChannelSession channelSession) {
        this.channelSession = channelSession;
    }


    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public TopicMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(TopicMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "CustomerTopic{" +
                "id=" + id +
                ", customer=" + customer +
                ", participants=" + participants +
                ", state=" + state +
                ", channelSession=" + channelSession +
                ", creationTime=" + creationTime +
                ", metadata=" + metadata +
                '}';
    }
}