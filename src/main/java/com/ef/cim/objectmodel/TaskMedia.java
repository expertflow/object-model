package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.ChannelSession;
import com.ef.cim.objectmodel.TaskQueue;
import com.ef.cim.objectmodel.TaskType;
import com.ef.cim.objectmodel.enums.TaskMediaState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Task media.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskMediaDto {
    /**
     * The ID.
     */
    private String id;
    /**
     * The Mrd id.
     */
    private String mrdId;
    /**
     * The Queue.
     */
    private TaskQueue queue;
    /**
     * The Type.
     */
    private TaskType type;
    /**
     * The Priority.
     */
    private int priority;
    /**
     * The State.
     */
    private TaskMediaState state;
    /**
     * The Requested session.
     */
    private ChannelSession requestedSession;
    /**
     * The Channel sessions.
     */
    private List<ChannelSession> channelSessions = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskMediaDto that = (TaskMediaDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
