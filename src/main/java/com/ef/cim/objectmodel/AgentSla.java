package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Agent SLA type.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AgentSla {
    private Integer totalDuration;
    private String action;
    private String startTime;
}
