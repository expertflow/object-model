package com.ef.cim.objectmodel;

import java.io.Serializable;

public class TopicMetadata implements Serializable {
    private String botId;
    private ChannelSession lastUsedChannelSession;

    public TopicMetadata() {

    }

    public TopicMetadata(ChannelSession channelSession) {
        this.botId = channelSession.getChannel().getChannelConfig().getBotId();
        this.lastUsedChannelSession = channelSession;
    }

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public ChannelSession getLastUsedChannelSession() {
        return lastUsedChannelSession;
    }

    public void setLastUsedChannelSession(ChannelSession lastUsedChannelSession) {
        this.lastUsedChannelSession = lastUsedChannelSession;
    }

    @Override
    public String toString() {
        return "TopicMetadata{" +
                "botId='" + botId + '\'' +
                ", lastUsedChannelSession=" + lastUsedChannelSession +
                '}';
    }
}
