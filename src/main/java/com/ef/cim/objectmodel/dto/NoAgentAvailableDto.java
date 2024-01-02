package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.task.TaskType;
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
public class NoAgentAvailableDto {
    private TaskType requestType;
}
