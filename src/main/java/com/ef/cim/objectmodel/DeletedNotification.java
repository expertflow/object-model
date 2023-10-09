package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;

public class DeletedNotification extends MessageBody {

    private String messageId;

    private Timestamp timestamp;

    public DeletedNotification(@JsonProperty("messageId") String messageId) {
        super(MessageType.DELETEDNOTIFICATION);
        this.messageId = messageId;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        String sb = "DeletedNotification{" + "messageId='" + messageId + '\'' +
                ", timestamp=" + timestamp +
                '}';
        return sb;
    }
}
