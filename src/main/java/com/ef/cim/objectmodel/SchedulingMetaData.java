package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;
import static org.springframework.data.mongodb.core.index.IndexDirection.ASCENDING;

public class SchedulingMetaData implements Serializable {

    @Indexed(direction = ASCENDING, name = "scheduledDatetime_1")
    @NotNull(message = "scheduledDatetime is mandatory.")
    private Timestamp scheduledDatetime;
    @JsonProperty("additionalData")
    private Map<String, Object> additionalData;

    public SchedulingMetaData(){

    }
    @JsonCreator
    public SchedulingMetaData(@JsonProperty("scheduledDatetime") Timestamp scheduledDatetime, @JsonProperty("additionalData") Map<String, Object> additionalData) {
        this.scheduledDatetime = scheduledDatetime;
        this.additionalData = additionalData;
    }

    public Timestamp getScheduledDatetime() {
        return scheduledDatetime;
    }

    public void setScheduledDatetime(Timestamp scheduledDatetime) {
        this.scheduledDatetime = scheduledDatetime;
    }

    @JsonAnySetter
    public void setAdditionalData(Map<String, Object> additionalData) {
        this.additionalData = additionalData;
    }

    @JsonAnySetter
    public void setAdditionalData(String key, Object value) {
        this.additionalData.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalData() {
        return additionalData;
    }

    @Override
    public String toString() {
        return "SchedulingMetaData{" +
                "scheduledDatetime=" + scheduledDatetime +
                ", additionalData=" + additionalData +
                '}';
    }
}