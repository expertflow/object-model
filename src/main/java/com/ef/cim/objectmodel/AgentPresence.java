package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lombok.ToString;

/**
 * The type Agent presence.
 */
@ToString
public class AgentPresence implements Serializable {
    /**
     * The Agent.
     */
    private CCUser agent;
    /**
     * The State.
     */
    private AgentState state;
    /**
     * The State change time.
     */
    private Timestamp stateChangeTime;
    /**
     * The Agent mrd states.
     */
    private List<AgentMrdState> agentMrdStates;

    /**
     * Default constructor.
     */
    public AgentPresence() {
        this.agentMrdStates = new ArrayList<>();
    }

    /**
     * Parameterized Constructor.
     *
     * @param agent          agent object
     * @param state          state of the agent
     * @param agentMrdStates list of mrd states of the agent.
     */
    public AgentPresence(CCUser agent, AgentState state, List<AgentMrdState> agentMrdStates) {
        this.agent = agent;
        this.state = state;
        this.stateChangeTime = new Timestamp(System.currentTimeMillis());
        this.agentMrdStates = agentMrdStates;
    }

    /**
     * Gets agent.
     *
     * @return the agent
     */
    public CCUser getAgent() {
        return agent;
    }

    /**
     * Sets agent.
     *
     * @param agent the agent
     */
    public void setAgent(CCUser agent) {
        this.agent = agent;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public AgentState getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(AgentState state) {
        this.state = state;
        this.stateChangeTime = new Timestamp(System.currentTimeMillis());
    }

    /**
     * Gets state change time.
     *
     * @return the state change time
     */
    public Timestamp getStateChangeTime() {
        return stateChangeTime;
    }

    /**
     * Sets state change time.
     *
     * @param stateChangeTime the state change time
     */
    public void setStateChangeTime(Timestamp stateChangeTime) {
        this.stateChangeTime = stateChangeTime;
    }

    /**
     * Gets agent mrd states.
     *
     * @return the agent mrd states
     */
    public List<AgentMrdState> getAgentMrdStates() {
        return agentMrdStates;
    }

    /**
     * Sets agent mrd states.
     *
     * @param agentMrdStates the agent mrd states
     */
    public void setAgentMrdStates(List<AgentMrdState> agentMrdStates) {
        this.agentMrdStates = agentMrdStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentPresence that = (AgentPresence) o;
        return Objects.equals(agent, that.agent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agent);
    }
}
