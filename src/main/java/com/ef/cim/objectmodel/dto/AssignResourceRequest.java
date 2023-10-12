package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.ChannelSession;
import com.ef.cim.objectmodel.Enums;
import com.ef.cim.objectmodel.task.TaskType;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    @NotBlank
    private List<ChannelSession> channelSessions;
    /**
     * Information regarding the type of the Task.
     */
    private TaskType type = new TaskType(Enums.TaskTypeDirection.INBOUND, Enums.TaskTypeMode.QUEUE, null);
    /**
     * The Priority.
     */
    private int priority = 1;
    /**
     * The Offer to agent.
     */
    private boolean offerToAgent = true;

    public void setPriority(int priority) {
        this.priority = priority > 10 ? 10 : Math.max(priority, 1);
    }
}
