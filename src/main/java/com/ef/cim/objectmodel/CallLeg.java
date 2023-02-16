package com.ef.cim.objectmodel;

import java.sql.Timestamp;
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
    private KeycloakUser agent;
    private Map<String, Object> dialog;
    private String startDirection;
    private String endDirection;
    private Timestamp startTime;
    private Timestamp endTime;
    private long duration;
}
