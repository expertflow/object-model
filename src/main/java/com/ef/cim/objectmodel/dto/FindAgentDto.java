package com.ef.cim.objectmodel.dto;


import com.ef.cim.objectmodel.task.TaskType;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Map;
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
public class FindAgentDto {
    private RequestQueue queue;
    private TaskType requestType;
    @JsonAnySetter
    private Map<String, Object> additionalDetails;
}

