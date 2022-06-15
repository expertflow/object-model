package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.ChannelSession;
import com.ef.cim.objectmodel.MediaRoutingDomain;
import com.ef.cim.objectmodel.TaskState;
import java.io.Serializable;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Task dto.
 */
@NoArgsConstructor
@ToString
@Getter
@Setter
public class TaskDto implements Serializable {
    /**
     * The ID.
     */
    private UUID id;
    /**
     * The Channel session.
     */
    private ChannelSession channelSession;
    /**
     * The Mrd.
     */
    private MediaRoutingDomain mrd;
    /**
     * The Queue.
     */
    private String queue;
    /**
     * The Priority.
     */
    private int priority;
    /**
     * The State.
     */
    private TaskState state;
    /**
     * The Assigned to.
     */
    private UUID assignedTo;
    /**
     * The Enqueue time.
     */
    private Long enqueueTime;
}