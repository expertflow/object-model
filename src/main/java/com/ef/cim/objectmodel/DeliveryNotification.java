package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class DeliveryNotification extends MessageBody {
    private final UUID messageID;
    private DeliveryStatus status;
    private int reasonCode;

    // Constructor 1
    public DeliveryNotification(@JsonProperty("status") DeliveryStatus status) {
        super(MessageType.DELIVERYNOTIFICATION);
        this.messageID = UUID.randomUUID();
        this.status = status;
    }

    // Getters
    public UUID getMessageID() {
        return this.messageID;
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
                "messageID=" + messageID +
                ", status=" + status +
                ", reasonCode=" + reasonCode +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                '}';
    }
}