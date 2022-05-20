package com.ef.cim.objectmodel;

import java.io.Serializable;

public class RoutingPolicy implements Serializable {
    private AgentSelectionPolicy agentSelectionPolicy;
    private boolean routeToLastAgent;
    private RoutingMode routingMode;
    private String routingObjectId;
    private int agentRequestTtl;

    public AgentSelectionPolicy getAgentSelectionPolicy() {
        return agentSelectionPolicy;
    }

    public void setAgentSelectionPolicy(AgentSelectionPolicy agentSelectionPolicy) {
        this.agentSelectionPolicy = agentSelectionPolicy;
    }

    public boolean isRouteToLastAgent() {
        return routeToLastAgent;
    }

    public void setRouteToLastAgent(boolean routeToLastAgent) {
        this.routeToLastAgent = routeToLastAgent;
    }

    public int getAgentRequestTtl() {
        return agentRequestTtl;
    }

    public void setAgentRequestTtl(int agentRequestTtl) {
        this.agentRequestTtl = agentRequestTtl;
    }

    public RoutingMode getRoutingMode() {
        return routingMode;
    }

    public void setRoutingMode(RoutingMode routingMode) {
        this.routingMode = routingMode;
    }

    public String getRoutingObjectId() {
        return routingObjectId;
    }

    public void setRoutingObjectId(String routingObjectId) {
        this.routingObjectId = routingObjectId;
    }

    @Override
    public String toString() {
        return "RoutingPolicy{" + "agentSelectionPolicy=" + agentSelectionPolicy + ", routeToLastAgent=" +
                routeToLastAgent + ", routingMode=" + routingMode + ", routingObjectId=" + routingObjectId +
                ", agentRequestTtl=" + agentRequestTtl + '}';
    }
}
