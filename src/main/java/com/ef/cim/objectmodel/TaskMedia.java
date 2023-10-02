package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.TaskMediaState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
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
public class TaskMedia {
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
    /**
     * The Marked for deletion.
     */
    private boolean markedForDeletion;

    public static TaskMedia instanceOnReRoute(TaskMedia media) {
        String id = UUID.randomUUID().toString();
        TaskMediaState state;
        int priority;

        if (media.getState().equals(TaskMediaState.RESERVED)) {
            state = TaskMediaState.QUEUED;
            priority = 11;
        } else {
            state = TaskMediaState.AUTO_JOINED;
            priority = media.getPriority();
        }

        return new TaskMedia(id, media.getMrdId(), media.getQueue(), media.getType(), priority, state,
                media.getRequestedSession(), media.getChannelSessions(), false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskMedia that = (TaskMedia) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
