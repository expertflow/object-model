package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.Enums;
import com.ef.cim.objectmodel.TaskAgent;
import com.ef.cim.objectmodel.TaskMedia;
import com.ef.cim.objectmodel.TaskState;
import com.ef.cim.objectmodel.enums.TaskMediaState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
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
 * The type Task dto.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskDto implements Serializable {
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
     * The Active media.
     */
    private List<TaskMedia> activeMedia = new ArrayList<>();

    public TaskMedia findMediaBy(String mediaId) {
        return this.activeMedia.stream().filter(m -> m.getId().equals(mediaId)).findFirst().orElse(null);
    }

    public TaskMedia findMediaByState(TaskMediaState state) {
        return this.activeMedia.stream()
                .filter(t -> state.equals(TaskMediaState.QUEUED)).findFirst().orElse(null);
    }

    public static TaskDto instanceOnReroute(TaskDto task) {
        List<TaskMedia> newMediaList = new ArrayList<>();

        for (TaskMedia media : task.getActiveMedia()) {
            newMediaList.add(TaskMedia.instanceOnReRoute(media));
        }

        String id = UUID.randomUUID().toString();
        TaskState state = new TaskState(Enums.TaskStateName.ACTIVE, null);
        return new TaskDto(id, task.getConversationId(), state, null, newMediaList);
    }

    @JsonIgnore
    public boolean isRemovable() {
        for (TaskMedia media : this.activeMedia) {
            if (!media.getState().equals(TaskMediaState.AUTO_JOINED)) {
                return false;
            }
        }

        return true;
    }

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
        TaskDto that = (TaskDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}