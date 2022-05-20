package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public class IdentifiedCustomer implements Serializable {
    private Customer associatedCustomer;
    private UUID lastAssignedAgent;

    public Customer getAssociatedCustomer() {
        return associatedCustomer;
    }

    public void setAssociatedCustomer(Customer associatedCustomer) {
        this.associatedCustomer = associatedCustomer;
    }

    public UUID getLastAssignedAgent() {
        return lastAssignedAgent;
    }

    public void setLastAssignedAgent(UUID lastAssignedAgent) {
        this.lastAssignedAgent = lastAssignedAgent;
    }

    /***
     * String Representation of IdentifiedCustomer
     * @return String
     */
    @Override
    public String toString() {
        return "IdentifiedCustomer{" +
                ", associatedCustomer=" + associatedCustomer +
                ", lastAssignedAgent=" + lastAssignedAgent +
                '}';
    }
}
