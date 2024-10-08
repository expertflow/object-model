package com.ef.cim.objectmodel.task;

import com.ef.cim.objectmodel.ChannelSession;
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
    private ChannelSession requestSession;
    /**
     * The Channel sessions.
     */
    private List<ChannelSession> channelSessions = new ArrayList<>();
    /**
     * The Enqueue time.
     */
    private long enqueueTime;
    /**
     * The Answer time.
     */
    private long answerTime;

    /**
     * Instantiates a new Task media.
     *
     * @param mrdId           the mrd id
     * @param taskId          the task id
     * @param queue           the queue
     * @param type            the type
     * @param priority        the priority
     * @param state           the state
     * @param requestSession  the request session
     * @param channelSessions the channel sessions
     */
    public TaskMedia(String mrdId, String taskId, TaskQueue queue, TaskType type, int priority, TaskMediaState state,
                     ChannelSession requestSession, List<ChannelSession> channelSessions) {
        this(UUID.randomUUID().toString(), mrdId, taskId, queue, type, priority, state, requestSession,
                channelSessions, System.currentTimeMillis(), 0L);
    }

    /**
     * Instance on reroute task media.
     *
     * @param taskId the task id
     * @param media  the media
     * @return the task media
     */
    public static TaskMedia instanceOnReRoute(String taskId, TaskMedia media) {
        TaskMediaState state = media.getState();
        int priority = media.getPriority();

        if (media.getState().equals(TaskMediaState.RESERVED)) {
            state = TaskMediaState.QUEUED;
            priority = 11;
        }

        return new TaskMedia(media.getMrdId(), taskId, media.getQueue(), media.getType(), priority,
                state, media.getRequestSession(), media.getChannelSessions());
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
     * @return the boolean
     */
    public boolean removeChannelSession(String channelSessionId) {
        ListIterator<ChannelSession> iter = this.channelSessions.listIterator();
        while (iter.hasNext()) {
            if (iter.next().getId().equals(channelSessionId)) {
                iter.remove();
                return true;
            }
        }
        return false;
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
