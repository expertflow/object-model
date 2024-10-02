package com.ef.cim.objectmodel;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * Customer Sla type
 * */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerSla implements Serializable {
    private Integer totalDuration;
    private String action;
    private String startTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerSla customerSla = (CustomerSla) o;
        return Objects.equals(totalDuration, customerSla.totalDuration) && Objects.equals(action, customerSla.action)
                && Objects.equals(startTime, customerSla.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalDuration, action, startTime);
    }
}
