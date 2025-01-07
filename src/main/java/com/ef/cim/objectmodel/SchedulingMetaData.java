package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchedulingMetaData {
    private Timestamp scheduledDatetime;
    private String webhookId;
    private String agent;
    private String queue;
    private String ivr;
    private String gatewayId;
    private String campaignId;
    private String campaignContactId;
    private String campaignType;
    private String startTime;
    private String endTime;
    private String priority;
    private DialingMode dialingMode; // PREDICTIVE, PREVIEW, or PROGRESSIVE
    private String routingMode; // AGENT or QUEUE
    private String resourceId;
    private String queueName;
    private ChannelTypeDTO channelType;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ChannelTypeDTO {
        private String name;
        private String channelLogo;
    }

    public enum DialingMode {
        PREDICTIVE,
        PREVIEW,
        PROGRESSIVE
    }

    public enum RoutingMode {
        AGENT,
        QUEUE
    }
}