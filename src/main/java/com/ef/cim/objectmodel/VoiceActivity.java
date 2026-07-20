package com.ef.cim.objectmodel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class VoiceActivity {
    private Timestamp startTime;
    private Timestamp endTime;
    private long duration;
    private String recordingUrl;
    private List<MediaUrl> mediaUrls;
    private List<Object> wrapUps;
    private double holdTime;
    private List<CallLeg> callLegs = new ArrayList<>();
    private Map<String, Object> additionalDetails = new HashMap<>();
}
