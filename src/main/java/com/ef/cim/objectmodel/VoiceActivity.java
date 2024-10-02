package com.ef.cim.objectmodel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
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
public class VoiceActivity {
    private Timestamp startTime;
    private Timestamp endTime;
    private long duration;
    private String recordingUrl;
    private List<Object> wrapUps;
    private double holdTime;
    private List<CallLeg> callLegs = new ArrayList<>();
}
