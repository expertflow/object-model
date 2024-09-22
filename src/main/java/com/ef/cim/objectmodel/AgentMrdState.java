package com.ef.cim.objectmodel;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The type Agent mrd state.
 */
@NoArgsConstructor
@ToString
public class AgentMrdState {
    /**
     * The Mrd.
     */
    private MediaRoutingDomain mrd;
    /**
     * The State.
     */
    private Enums.AgentMrdStateName state;
    /**
     * The previous state.
     */
    private Enums.AgentMrdStateName previousState;
    /**
     * The State change time.
     */
    private Timestamp stateChangeTime;
    /**
     * The Last ready state change time.
     */
    private Timestamp lastReadyStateChangeTime;

    /**
     * The maximum tasks this agent can accept against this MRD.
     */
    private int maxAgentTasks;

    /**
     * Parameterized Constructor.
     *
     * @param mrd   id the associated mrd
     * @param state agent's state for the associated mrd
     */
    public AgentMrdState(MediaRoutingDomain mrd, Enums.AgentMrdStateName state) {
        this.mrd = mrd;
        this.state = state;
        this.stateChangeTime = Timestamp.valueOf(LocalDateTime.now());

        LocalDateTime longTimeAgo = LocalDateTime.of(1990, 4, 2, 12, 1);
        this.lastReadyStateChangeTime = Timestamp.valueOf(longTimeAgo);
        this.maxAgentTasks = mrd.getMaxRequests();
    }

    /**
     * Gets mrd.
     *
     * @return the mrd
     */
    public MediaRoutingDomain getMrd() {
        return mrd;
    }

    /**
     * Sets mrd.
     *
     * @param mrd the mrd
     */
    public void setMrd(MediaRoutingDomain mrd) {
        this.mrd = mrd;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public Enums.AgentMrdStateName getState() {
        return state;
    }

    /**
     * Sets the state and the state change time to current time. If state is READY, it sets the
     * last-ready-state-change-time to current time.
     *
     * @param state state to set.
     */
    public void setState(Enums.AgentMrdStateName state) {
        this.state = state;
        this.stateChangeTime = Timestamp.valueOf(LocalDateTime.now());
        if (this.state.equals(Enums.AgentMrdStateName.READY)) {
            this.lastReadyStateChangeTime = this.stateChangeTime;
        }
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
     * Gets last ready state change time.
     *
     * @return the last ready state change time
     */
    public Timestamp getLastReadyStateChangeTime() {
        return lastReadyStateChangeTime;
    }

    /**
     * Sets last ready state change time.
     *
     * @param lastReadyStateChangeTime the last ready state change time
     */
    public void setLastReadyStateChangeTime(Timestamp lastReadyStateChangeTime) {
        this.lastReadyStateChangeTime = lastReadyStateChangeTime;
    }

    /**
     * Gets the previous state of agent MRD.
     *
     * @return the previous state object.
     */
    public Enums.AgentMrdStateName getPreviousState() {
        return previousState;
    }

    /**
     * Sets the previous state of agent MRD.
     *
     * @param previousState the state that needs to be set.
     */
    public void setPreviousState(Enums.AgentMrdStateName previousState) {
        this.previousState = previousState;
    }

    public int getMaxAgentTasks() {
        return maxAgentTasks;
    }

    public void setMaxAgentTasks(int maxAgentTasks) {
        this.maxAgentTasks = maxAgentTasks;
    }
}