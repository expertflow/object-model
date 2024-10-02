package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.HashMap;
import java.util.Map;

public class VoiceMessage extends MessageBody {

    private String callId;
    private String leg;
    private String reasonCode;

    private Map<String, Object> additionalDetail = new HashMap<>();


    public VoiceMessage() {
        super(MessageType.VOICE);
    }

    @JsonAnySetter
    public void setAdditionalDetail(String key, Object value) {
        additionalDetail.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalDetail() {
        return additionalDetail;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VoiceMessage{");
        sb.append("callId=").append(callId);
        sb.append(", reasonCode='").append(reasonCode).append('\'');
        sb.append(", leg='").append(leg).append('\'');
        sb.append(", type=").append(type);
        sb.append(", markdownText='").append(markdownText).append('\'');
        sb.append(", additionalDetail=").append(additionalDetail);
        sb.append('}');
        return sb.toString();
    }
}
