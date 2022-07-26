package com.ef.cim.objectmodel;

import java.io.Serializable;

public class IdentifiedCustomer implements Serializable {
    private Customer associatedCustomer;
    private String lastAssignedAgent;

    public Customer getAssociatedCustomer() {
        return associatedCustomer;
    }

    public void setAssociatedCustomer(Customer associatedCustomer) {
        this.associatedCustomer = associatedCustomer;
    }

    public String getLastAssignedAgent() {
        return lastAssignedAgent;
    }

    public void setLastAssignedAgent(String lastAssignedAgent) {
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
