package com.ef.cim.objectmodel;

import java.io.Serializable;

public class ChannelSessionState implements Serializable {

    private ChannelSessionStateEnum name;
    private String reasonCode;

    public ChannelSessionState() {
    }

    public ChannelSessionState(ChannelSessionStateEnum name, String reasonCode) {
        this.name = name;
        this.reasonCode = reasonCode;
    }

    public ChannelSessionStateEnum getName() {
        return name;
    }

    public void setName(ChannelSessionStateEnum name) {
        this.name = name;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChannelSessionState{");
        sb.append("name=").append(name);
        sb.append(", reasonCode=").append(reasonCode);
        sb.append('}');
        return sb.toString();
    }
}
