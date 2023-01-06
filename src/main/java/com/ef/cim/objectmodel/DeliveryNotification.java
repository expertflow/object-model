package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryNotification extends MessageBody {
    private final String messageId;
    private DeliveryStatus status;
    private int reasonCode;

    // Constructor 1
    public DeliveryNotification(String messageId, @JsonProperty("status") DeliveryStatus status) {
        super(MessageType.DELIVERYNOTIFICATION);
        this.messageId = messageId;
        this.status = status;
    }

    // Getters
    public String getMessageId() {
        return this.messageId;
    }

    public DeliveryStatus getStatus() {
        return this.status;
    }

    // Setters
    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public int getReasonCode() {
        return this.reasonCode;
    }

    public void setReasonCode(int reasonCode) {
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