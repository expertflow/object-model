package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.Objects;

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
public class AgentSla implements Serializable {
    private Integer totalDuration;
    private String action;
    private String startTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgentSla agentSla = (AgentSla) o;
        return Objects.equals(totalDuration, agentSla.totalDuration) && Objects.equals(action, agentSla.action)
                && Objects.equals(startTime, agentSla.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalDuration, action, startTime);
    }
}
