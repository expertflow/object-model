package com.ef.cim.objectmodel;

import java.sql.Timestamp;
import java.util.HashMap;
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
public class CallLeg {
    private Sender sender;
    private String startDirection;
    private String endDirection;
    private long duration;
    private Timestamp startTime;
    private Timestamp endTime;
    private Map<String, Object> additionalDetail = new HashMap<>();
}
