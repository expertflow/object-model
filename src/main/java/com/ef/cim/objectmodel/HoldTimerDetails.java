package com.ef.cim.objectmodel;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HoldTimerDetails implements Serializable {
    private Integer totalDuration;
    private String startTime;
}
