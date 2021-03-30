package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public class RoutingPolicy implements Serializable {
    PolicyType policy;
    private UUID queueID;

    // Constructor
    public RoutingPolicy() {
        this.queueID = UUID.randomUUID();
    }





    // Getters
    public UUID getQueueID() {
        return this.queueID;
    }

    public PolicyType getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyType policy) {
        this.policy = policy;
    }

    public void setQueueID(UUID queueID) { this.queueID = queueID; }

    /***
     * String Representation of RoutingPolicy
     * @return String
     */
    @Override
    public String toString() {
        return "RoutingPolicy{" +
                "queueID=" + queueID +
                ", policy=" + policy +
                '}';
    }
}
