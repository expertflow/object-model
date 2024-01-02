package com.ef.cim.objectmodel.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class TaskStateChangedDto {
    private Task task;
    private boolean taskStateChanged;
    private List<String> mediaStateChanges = new ArrayList<>();

    public TaskStateChangedDto(Task task, boolean taskStateChanged, String... mediaStateChanges) {
        this.task = task;
        this.taskStateChanged = taskStateChanged;
        this.mediaStateChanges = Arrays.asList(mediaStateChanges);
    }
}
