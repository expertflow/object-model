package com.ef.cim.objectmodel;

import java.util.HashMap;
import java.util.Map;

public class NotificationMessage extends MessageBody {

    private NotificationType notificationType;
    private Map<String, Object> notificationData = new HashMap<>();

    public NotificationMessage() {
        super(MessageType.NOTIFICATION);
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public Map<String, Object> getNotificationData() {
        return notificationData;
    }

    public void setNotificationData(Map<String, Object> notificationData) {
        this.notificationData = notificationData;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotificationMessage{");
        sb.append("notificationType=").append(notificationType);
        sb.append(", notificationData=").append(notificationData);
        sb.append(", type=").append(type);
        sb.append(", markdownText='").append(markdownText).append('\'');
        sb.append('}');
        return sb.toString();
    }
}