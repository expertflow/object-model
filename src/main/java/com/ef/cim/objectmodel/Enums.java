package com.ef.cim.objectmodel;

/**
 * Contains all the enums used in the project.
 */
public class Enums {
    public enum TaskType {
        CONSULT,
        CONSULT_TRANSFER,
        CONSULT_CONFERENCE,
        INBOUND,
        OUTBOUND
    }

    /**
     * Names of a Task State.
     */
    public enum TaskStateName {
        STARTED,
        /**
         * Queued task state name.
         */
        QUEUED,
        /**
         * Reserved task state name.
         */
        RESERVED,
        /**
         * Active task state name.
         */
        ACTIVE,
        /**
         * Paused task state name.
         */
        PAUSED,
        /**
         * Wrap up task state name.
         */
        WRAP_UP,
        /**
         * Closed task state name.
         */
        CLOSED
    }

    /**
     * Reason codes of a Task state.
     */
    public enum TaskStateReasonCode {
        /**
         * Rona task state reason code.
         */
        RONA,
        /**
         * Done task state reason code.
         */
        DONE,
        /**
         * Response timeout task state reason code.
         */
        RESPONSE_TIMEOUT,
        /**
         * No agent available task state reason code.
         */
        NO_AGENT_AVAILABLE,
        /**
         * Reroute task state reason code.
         */
        REROUTE,
        /**
         * Cancelled task state reason code.
         */
        CANCELLED,
        /**
         * Agent logout task state reason code.
         */
        AGENT_LOGOUT,
        /**
         * Transferred task state reason code.
         */
        TRANSFERRED
    }

    /**
     * Names of internal events (fired internally).
     */
    public enum EventName {
        /**
         * New task event name.
         */
        NEW_TASK,
        /**
         * Task removed event name.
         */
        TASK_REMOVED,
        /**
         * Agent state event name.
         */
        AGENT_STATE,
        /**
         * Agent mrd state event name.
         */
        AGENT_MRD_STATE,
        /**
         * Ewt request event name.
         */
        EWT_REQUEST_EVENT,
        /**
         * Step timeout event name.
         */
        STEP_TIMEOUT,
        /**
         * Task state event name.
         */
        TASK_STATE,
        /**
         * Conference event name.
         */
        CONFERENCE,
        /**
         * Task accepted event name.
         */
        TASK_ACCEPTED
    }

    /**
     * Names of the AgentState of an agent.
     */
    public enum AgentStateName {
        /**
         * Login agent state name.
         */
        LOGIN,
        /**
         * Not ready agent state name.
         */
        NOT_READY,
        /**
         * Ready agent state name.
         */
        READY,
        /**
         * Logout agent state name.
         */
        LOGOUT
    }

    /**
     * Types of Reason code in an AgentState ReasonCode Object.
     */
    public enum ReasonCodeType {
        /**
         * Not ready reason code type.
         */
        NOT_READY,
        /**
         * Logout reason code type.
         */
        LOGOUT
    }

    /**
     * Names of Agent-Mrd state.
     */
    public enum AgentMrdStateName {
        /**
         * Logout agent mrd state name.
         */
        LOGOUT,
        /**
         * Login agent mrd state name.
         */
        LOGIN,
        /**
         * Not ready agent mrd state name.
         */
        NOT_READY,
        /**
         * Pending not ready agent mrd state name.
         */
        PENDING_NOT_READY,
        /**
         * Ready agent mrd state name.
         */
        READY,
        /**
         * Interrupted agent mrd state name.
         */
        INTERRUPTED,
        /**
         * Active agent mrd state name.
         */
        ACTIVE,
        /**
         * Busy agent mrd state name.
         */
        BUSY,
        /**
         * Unknown agent mrd state name.
         */
        UNKNOWN
    }

    /**
     * Names of events published on the JMS topic.
     */
    public enum JmsEventName {
        /**
         * Task state changed jms event name.
         */
        TASK_STATE_CHANGED,
        /**
         * Agent state changed jms event name.
         */
        AGENT_STATE_CHANGED,
        /**
         * Agent state unchanged jms event name.
         */
        AGENT_STATE_UNCHANGED
    }
}
