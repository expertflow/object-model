package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.CCUser;
import com.ef.cim.objectmodel.task.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * An AgentReserved object used to publish AGENT_RESERVED event on the conversation topic.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AgentReservedDto {
    /**
     * The task dto.
     */
    private Task task;
    /**
     * The Cc user.
     */
    private CCUser ccUser;
}