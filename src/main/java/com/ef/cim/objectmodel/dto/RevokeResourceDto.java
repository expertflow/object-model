package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.Enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Revoke task object.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RevokeResourceDto {
    /**
     * The Task id.
     */
    private String taskId; // Optional
    /**
     * The Current task state.
     */
    private Enums.TaskStateName currentTaskState;
    /**
     * The Task close reason.
     */
    private Enums.TaskStateReasonCode taskCloseReason;
    /**
     * The Agent id.
     */
    private String agentId;
    /**
     * The Conversation id.
     */
    private String conversationId;
}