package com.ef.cim.objectmodel;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Agent state.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AgentState {
    /**
     * The Name.
     */
    @NotNull
    private Enums.AgentStateName name;
    /**
     * The Reason code.
     */
    private ReasonCode reasonCode;
}
