package com.ef.cim.objectmodel.task;

import com.ef.cim.objectmodel.Enums;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
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
 * The type Task dto.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Task implements Serializable {
    /**
     * The ID.
     */
    private String id;
    /**
     * The Conversation id.
     */
    private String conversationId;
    /**
     * The State.
     */
    private TaskState state;
    /**
     * The Assigned to.
     */
    private TaskAgent assignedTo;
    /**
     * The Agent request ttl timer id.
     */
    private String agentRequestTtlTimerId;
    /**
     * The Active media.
     */
    private List<TaskMedia> activeMedia = new ArrayList<>();

    /**
     * Add media.
     *
     * @param media the media
     */
    public void addMedia(TaskMedia media) {
        if (!this.mediaExists(media.getId())) {
            this.activeMedia.add(media);
        }
    }

    /**
     * Remove media.
     *
     * @param mediaId the media id
     */
    public void removeMedia(String mediaId) {
        ListIterator<TaskMedia> iter = this.activeMedia.listIterator();
        while (iter.hasNext()) {
            if (iter.next().getId().equals(mediaId)) {
                iter.remove();
                break;
            }
        }
    }

    /**
     * Media exists boolean.
     *
     * @param mediaId the media id
     * @return the boolean
     */
    public boolean mediaExists(String mediaId) {
        return this.activeMedia.stream()
                .anyMatch(m -> m.getId().equals(mediaId));
    }

    /**
     * Find media by task media.
     *
     * @param mediaId the media id
     * @return the task media
     */
    public TaskMedia findMediaBy(String mediaId) {
        return this.activeMedia.stream().filter(m -> m.getId().equals(mediaId)).findFirst().orElse(null);
    }

    /**
     * Find media by state task media.
     *
     * @param state the state
     * @return the task media
     */
    public TaskMedia findMediaByState(TaskMediaState state) {
        return this.activeMedia.stream()
                .filter(t -> state.equals(TaskMediaState.QUEUED)).findFirst().orElse(null);
    }

    /**
     * Find media by mrd id task media.
     *
     * @param mrdId the mrd id
     * @return the task media
     */
    public TaskMedia findMediaByMrdId(String mrdId) {
        return this.activeMedia.stream()
                .filter(m -> m.getMrdId().equals(mrdId))
                .findFirst()
                .orElse(null);
    }

    /**
     * Instance on reroute task.
     *
     * @param task the task
     * @return the task
     */
    public static Task instanceOnReroute(Task task) {
        List<TaskMedia> newMediaList = new ArrayList<>();

        for (TaskMedia media : task.getActiveMedia()) {
            newMediaList.add(TaskMedia.instanceOnReRoute(media));
        }

        String id = UUID.randomUUID().toString();
        TaskState state = new TaskState(Enums.TaskStateName.ACTIVE, null);
        return new Task(id, task.getConversationId(), state, null, task.getAgentRequestTtlTimerId(), newMediaList);
    }

    /**
     * Is removable boolean.
     *
     * @return the boolean
     */
    @JsonIgnore
    public boolean isRemovable() {
        for (TaskMedia media : this.activeMedia) {
            if (!media.getState().equals(TaskMediaState.AUTO_JOINED)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Is agent active boolean.
     *
     * @return the boolean
     */
    @JsonIgnore
    public boolean isAgentActive() {
        boolean hasActiveMedia = false;

        for (TaskMedia media : this.activeMedia) {
            if (media.getState().equals(TaskMediaState.ACTIVE)) {
                hasActiveMedia = true;
                break;
            }
        }

        return this.assignedTo != null && hasActiveMedia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task that = (Task) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}