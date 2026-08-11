package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.CampaignUnsubscribeReason;
import java.io.Serializable;
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
public class CampaignUnsubscribedDto implements Serializable {
    private String customerId;
    private String channelCustomerIdentifier;
    private String serviceIdentifier;
    private String channelType;
    private String sourceMessageId;
    private String keyword;
    private CampaignUnsubscribeReason reason;
    private String channelSessionId;
    private String conversationId;
    private long timestamp;
}
