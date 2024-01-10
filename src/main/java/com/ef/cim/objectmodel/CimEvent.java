package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import com.ef.cim.objectmodel.room.RoomInfo;
import java.io.Serializable;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
@ToString
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
    private RoomInfo roomInfo;

    public CimEvent() {
        this.id = Utils.getObjectId();
    }

    public CimEvent(Object data, CimEventName name, CimEventType type, String conversationId, Sender eventEmitter,
                    ChannelSession channelSession, RoomInfo roomInfo) {
        this.id = Utils.getObjectId();
        this.data = data;
        this.name = name;
        this.type = type;
        this.conversationId = conversationId;
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.eventEmitter = eventEmitter;
        this.channelSession = channelSession;
        this.roomInfo = roomInfo;
    }
}