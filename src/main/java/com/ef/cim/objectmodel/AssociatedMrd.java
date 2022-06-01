package com.ef.cim.objectmodel;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AssociatedMrd {
    @NotNull
    private String mrdId;
    private int maxAgentTasks;
}