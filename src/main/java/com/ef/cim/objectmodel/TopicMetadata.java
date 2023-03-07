package com.ef.cim.objectmodel;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TopicMetadata implements Serializable {
    private String botId;
    private ChannelSession lastUsedChannelSession;
    private AgentRequestStatus agentRequestStatus;

    public TopicMetadata(ChannelSession channelSession) {
        this.botId = channelSession.getChannel().getChannelConfig().getBotId();
        this.lastUsedChannelSession = channelSession;
    }
}
