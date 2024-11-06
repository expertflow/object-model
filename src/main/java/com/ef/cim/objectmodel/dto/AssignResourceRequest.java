package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.ChannelSession;
import com.ef.cim.objectmodel.Enums;
import com.ef.cim.objectmodel.task.TaskType;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Assign resource request.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AssignResourceRequest {
    /**
     * Requested queue to direct the request to. If this queue is null or not found, then the default queue
     * in the channel-session will be used.
     */
    @Valid
    private RequestQueue queue;
    /**
     * Contains the channel configurations, routing-policy, default-queue, MRD e.t.c
     */
    @NotNull
    private ChannelSession requestSession;
    /**
     * The Channel sessions.
     */
    @NotEmpty
    private List<ChannelSession> channelSessions;
    /**
     * Information regarding the type of the Task.
     */
    private TaskType type;
    /**
     * The Priority.
     */
    private int priority = 1;
    /**
     * The Offer to agent.
     */
    private boolean offerToAgent = true;
    /**
     * The Cc user.
     */
    private String lastAssignedAgentId;

    /**
     * Sets priority.
     *
     * @param priority the priority
     */
    public void setPriority(int priority) {
        this.priority = priority > 10 ? 10 : Math.max(priority, 1);
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(TaskType type) {
        if (type == null) {
            this.type = new TaskType(Enums.TaskTypeDirection.INBOUND, Enums.TaskTypeMode.QUEUE, null);
        } else {
            this.type = type;
        }
    }
}
