package com.ef.cim.objectmodel.task;

import com.ef.cim.objectmodel.Enums;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Task state.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TaskState implements Serializable {
    /**
     * The Name.
     */
    @NotNull
    private Enums.TaskStateName name;
    /**
     * The Reason code.
     */
    private Enums.TaskStateReasonCode reasonCode;
}