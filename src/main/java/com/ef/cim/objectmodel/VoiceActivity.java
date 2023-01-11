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
    private String firstAgent;
    private Timestamp startTime;
    private long duration;
    private List<CallLeg> callLegs = new ArrayList<>();
}
