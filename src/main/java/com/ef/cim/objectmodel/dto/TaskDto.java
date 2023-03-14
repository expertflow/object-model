package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.ChannelSession;
import com.ef.cim.objectmodel.MediaRoutingDomain;
import com.ef.cim.objectmodel.TaskAgent;
import com.ef.cim.objectmodel.TaskQueue;
import com.ef.cim.objectmodel.TaskState;
import com.ef.cim.objectmodel.TaskType;
import java.io.Serializable;
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
    private String id;
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
    private TaskQueue queue;
    /**
     * The Priority.
     */
    private int priority;
    /**
     * The State.
     */
    private TaskState state;
    /**
     * The Type.
     */
    private TaskType type;
    /**
     * The Assigned to.
     */
    private TaskAgent assignedTo;
    /**
     * The Enqueue time.
     */
    private Long enqueueTime;
    /**
     * The Answer time.
     */
    private Long answerTime;
    /**
     * The Handle time.
     */
    private Long handleTime;
}