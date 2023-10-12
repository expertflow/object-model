package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.TaskMediaState;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
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
     * The Task id.
     */
    private String taskId;
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

    /**
     * Instance on reroute task media.
     *
     * @param media the media
     * @return the task media
     */
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

        return new TaskMedia(id, media.getMrdId(), media.getTaskId(), media.getQueue(), media.getType(), priority,
                state, media.getRequestedSession(), media.getChannelSessions(), false);
    }

    /**
     * Channel session exists boolean.
     *
     * @param channelSessionId the channel session id
     * @return the boolean
     */
    public boolean channelSessionExists(String channelSessionId) {
        return this.channelSessions.stream()
                .anyMatch(c -> c.getId().equals(channelSessionId));
    }

    /**
     * Add channel session.
     *
     * @param channelSession the channel session
     */
    public void addChannelSession(ChannelSession channelSession) {
        if (!channelSessionExists(channelSession.getId())) {
            this.channelSessions.add(channelSession);
        }
    }

    /**
     * Remove channel session.
     *
     * @param channelSessionId the channel session id
     */
    public void removeChannelSession(String channelSessionId) {
        ListIterator<ChannelSession> iter = this.channelSessions.listIterator();
        while (iter.hasNext()) {
            if (iter.next().getId().equals(channelSessionId)) {
                iter.remove();
                break;
            }
        }
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
