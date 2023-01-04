package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;

public class VoiceMessage extends MessageBody {

    private KeycloakUser agent;
    private JsonNode dialog;
    private String reasonCode;
    private String leg;
    private Customer customer;

    public VoiceMessage() {
        super(MessageType.VOICE);
    }


    public KeycloakUser getAgent() {
        return agent;
    }

    public void setAgent(KeycloakUser agent) {
        this.agent = agent;
    }

    public JsonNode getDialog() {
        return dialog;
    }

    public void setDialog(JsonNode dialog) {
        this.dialog = dialog;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VoiceMessage{");
        sb.append("agent=").append(agent);
        sb.append(", dialog=").append(dialog);
        sb.append(", reasonCode='").append(reasonCode).append('\'');
        sb.append(", leg='").append(leg).append('\'');
        sb.append(", customer=").append(customer);
        sb.append(", type=").append(type);
        sb.append(", markdownText='").append(markdownText).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
