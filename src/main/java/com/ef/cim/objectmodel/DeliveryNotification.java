package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryNotification extends MessageBody {
    private String messageId;
    private DeliveryStatus status;
    private String reasonCode;

    // Constructor 1
    public DeliveryNotification(@JsonProperty("messageId") String messageId, @JsonProperty("status") DeliveryStatus status) {
        super(MessageType.DELIVERYNOTIFICATION);
        this.messageId = messageId;
        this.status = status;
    }

    // Getters
    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public DeliveryStatus getStatus() {
        return this.status;
    }

    // Setters
    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @Override
    public String toString() {
        return "DeliveryNotification{" +
                "messageId=" + messageId +
                ", status=" + status +
                ", reasonCode=" + reasonCode +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                '}';
    }
}