package com.ef.cim.objectmodel;

import java.util.List;
import java.util.UUID;

public class TopicEvents {
    private final UUID id;
    private UUID topicId;
    private List<CimEvent> cimEvents;

    // Getters
    public TopicEvents(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public UUID getTopicId() {
        return topicId;
    }

    public List<CimEvent> getCimEvents() {
        return cimEvents;
    }

    // Setters

    public void setTopicId(UUID topicId) {
        this.topicId = topicId;
    }

    public void setCimEvents(List<CimEvent> cimEvents) {
        this.cimEvents = cimEvents;
    }

    @Override
    public String toString() {
        return "TopicEvents{" +
                "id=" + id +
                ", topicId=" + topicId +
                ", cimEvents=" + cimEvents +
                '}';
    }
}