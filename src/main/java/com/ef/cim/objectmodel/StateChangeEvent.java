package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type State change event.
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class StateChangeEvent implements Serializable {
    /**
     * The Name.
     */
    private Enums.JmsEventName name;
    /**
     * The Data.
     */
    private Serializable data;
    /**
     * The Timestamp.
     */
    private Timestamp timestamp;
    /**
     * The Topic id.
     */
    private String topicId;

    /**
     * Parametrized Constructor.
     *
     * @param name    event name
     * @param data    event data
     * @param topicId the topic id
     */
    public StateChangeEvent(Enums.JmsEventName name, Serializable data, String topicId) {
        this.name = name;
        this.data = data;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.topicId = topicId;
    }
}
