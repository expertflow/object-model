package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;

public class VoiceMessage extends MessageBody {
    private String agentId;
    private JsonNode dialog;

    public VoiceMessage() {
        super(MessageType.VOICE);
    }


    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public JsonNode getDialog() {
        return dialog;
    }

    public void setDialog(JsonNode dialog) {
        this.dialog = dialog;
    }

    @Override
    public String toString() {
        return "VoiceMessage{" +
                "agentId='" + agentId + '\'' +
                ", dialog=" + dialog +
                '}';
    }
}
