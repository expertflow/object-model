package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.io.Serializable;
import java.sql.Timestamp;
import org.springframework.data.mongodb.core.index.Indexed;

public class CimEvent implements Serializable {
    private String id;
    @Indexed
    private CimEventName name;
    private CimEventType type;
    private Timestamp timestamp;
    private String conversationId;
    private Sender eventEmitter;
    private ChannelSession channelSession;
    private Object data;
    private String roomId;

    public CimEvent() {
        this.id = Utils.getObjectId();
    }

    public CimEvent(Object data, CimEventName name, CimEventType type, String conversationId, Sender eventEmitter,
            ChannelSession channelSession, String roomId) {
        this.id = Utils.getObjectId();
        this.data = data;
        this.name = name;
        this.type = type;
        this.conversationId = conversationId;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.eventEmitter = eventEmitter;
        this.channelSession = channelSession;
        this.roomId = roomId;
    }
    public CimEvent(Object data, CimEventName name, CimEventType type, String conversationId, Sender eventEmitter,
                    ChannelSession channelSession) {
        this.id = Utils.getObjectId();
        this.data = data;
        this.name = name;
        this.type = type;
        this.conversationId = conversationId;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.eventEmitter = eventEmitter;
        this.channelSession = channelSession;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getters
    public String getId() {
        return id;
    }


    public CimEventName getName() {
        return name;
    }

    public CimEventType getType() {
        return type;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public Object getData() {
        return data;
    }

    // Setters
    public void setName(CimEventName name) {
        this.name = name;
    }

    public void setType(CimEventType type) {
        this.type = type;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Sender getEventEmitter() {
        return eventEmitter;
    }

    public void setEventEmitter(Sender eventEmitter) {
        this.eventEmitter = eventEmitter;
    }

    public ChannelSession getChannelSession() {
        return channelSession;
    }

    public void setChannelSession(ChannelSession channelSession) {
        this.channelSession = channelSession;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}