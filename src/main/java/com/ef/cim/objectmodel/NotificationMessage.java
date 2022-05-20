package com.ef.cim.objectmodel;

public class NotificationMessage extends MessageBody {
    private NotificationType notificationType;

    public NotificationMessage() {
        super(MessageType.NOTIFICATION);
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    @Override
    public String toString() {
        return "NotificationMessage{" + "type=" + type + ", markdownText='" + markdownText + '\'' +
                ", notificationType=" + notificationType + '}';
    }
}