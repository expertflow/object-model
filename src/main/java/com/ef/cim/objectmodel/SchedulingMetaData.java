package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchedulingMetaData {
    private Timestamp scheduledDatetime;
    private String webhookId;
    private Map<String, Object> metadata;
}