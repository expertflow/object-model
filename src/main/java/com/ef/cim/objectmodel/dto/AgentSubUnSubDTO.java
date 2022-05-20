package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.CCUser;
import com.ef.cim.objectmodel.ChannelSession;
import java.util.List;

public class AgentSubUnSubDTO {
    private CCUser ccUser;
    private List<ChannelSession> channelSessionList;

    public CCUser getCcUser() {
        return ccUser;
    }

    public void setCcUser(CCUser ccUser) {
        this.ccUser = ccUser;
    }

    public List<ChannelSession> getChannelSessionList() {
        return channelSessionList;
    }

    public void setChannelSessionList(List<ChannelSession> channelSessionList) {
        this.channelSessionList = channelSessionList;
    }

    @Override
    public String toString() {
        return "AgentSubUnSubDTO{" +
                "ccUser=" + ccUser +
                ", channelSessionList=" + channelSessionList +
                '}';
    }
}
