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

//    public static RevokeResourceDto createForReservedTask(String taskId, String agentId, String conversationId) {
//        return new RevokeResourceDto(taskId, Enums.TaskStateName.RESERVED, Enums.TaskStateReasonCode.CANCELLED,
//                agentId, conversationId);
//    }
//
//    public static RevokeResourceDto createForActiveTask(String agentId, String conversationId,
//                                                        Enums.TaskStateReasonCode reason) {
//        return new RevokeResourceDto(null, Enums.TaskStateName.ACTIVE, reason, agentId, conversationId);
//    }
}