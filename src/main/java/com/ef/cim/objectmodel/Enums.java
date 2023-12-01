package com.ef.cim.objectmodel;

/**
 * Contains all the enums used in the project.
 */
public class Enums {
    /**
     * The enum Task type direction.
     */
    public enum TaskTypeDirection {
        /**
         * Consult task type direction.
         */
        CONSULT,
        /**
         * Consult transfer task type direction.
         */
        CONSULT_TRANSFER,
        /**
         * Consult conference task type direction.
         */
        CONSULT_CONFERENCE,
        /**
         * Direct transfer task type direction.
         */
        DIRECT_TRANSFER,
        /**
         * Direct conference task type direction.
         */
        DIRECT_CONFERENCE,
        /**
         * Inbound task type direction.
         */
        INBOUND,
        /**
         * Outbound task type direction.
         */
        OUTBOUND
    }

    /**
     * The enum Task type mode.
     */
    public enum TaskTypeMode {
        /**
         * Agent task type mode.
         */
        AGENT,
        /**
         * Queue task type mode.
         */
        QUEUE
    }

    /**
     * Names of a Task State.
     */
    public enum TaskStateName {
        /**
         * Active task state name.
         */
        ACTIVE,
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
        TRANSFERRED,
        /**
         * Force closed task state reason code.
         */
        FORCE_CLOSED,
        /**
         * Wrap up applied task state reason code.
         */
        WRAP_UP_APPLIED,
        /**
         * Wrap up not applied task state reason code.
         */
        WRAP_UP_NOT_APPLIED,
        /**
         * Wrap up expired task state reason code.
         */
        WRAP_UP_EXPIRED
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

    /**
     * Names of Sender of CimMessage or CimEvent
     */
    public enum SenderType {
        /**
         * Agent sender type.
         */
        AGENT,
        /**
         * Bot sender type.
         */
        BOT,
        /**
         * Customer sender type.
         */
        CUSTOMER,
        /**
         * App sender type.
         */
        APP,
        /**
         * Connector sender type.
         */
        CONNECTOR,
        /**
         * System sender type.
         */
        SYSTEM
    }
}
