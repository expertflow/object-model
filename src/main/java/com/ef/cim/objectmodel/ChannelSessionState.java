package com.ef.cim.objectmodel;

public class ChannelSessionState {

    private ChannelSessionStateEnum name;
    private ReasonCodeEnum reasonCode;

    public ChannelSessionState() {
    }

    public ChannelSessionState(ChannelSessionStateEnum name, ReasonCodeEnum reasonCode) {
        this.name = name;
        this.reasonCode = reasonCode;
    }

    public ChannelSessionStateEnum getName() {
        return name;
    }

    public void setName(ChannelSessionStateEnum name) {
        this.name = name;
    }

    public ReasonCodeEnum getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(ReasonCodeEnum reasonCode) {
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
