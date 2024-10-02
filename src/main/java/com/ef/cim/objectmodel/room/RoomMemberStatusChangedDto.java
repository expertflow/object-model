package com.ef.cim.objectmodel.room;

import com.ef.cim.objectmodel.ChannelSession;
import com.ef.cim.objectmodel.room.RoomMember;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * AgentPresenceUpdateEvent DTO.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoomMemberStatusChangedDto {
    /**
     * The Member.
     */
    private RoomMember member;
    /**
     * The Channel session list.
     */
    private List<ChannelSession> channelSessions;
    /**
     * The State change time.
     */
    private Timestamp statusChangeTime;
    /**
     * The Agent.
     */
    private Map<String, Object> metadata = new HashMap<>();

    /**
     * Instantiates a new Room member status changed dto.
     *
     * @param member   the member
     * @param sessions the sessions
     */
    public RoomMemberStatusChangedDto(RoomMember member, List<ChannelSession> sessions) {
        this.member = member;
        this.statusChangeTime = new Timestamp(System.currentTimeMillis());
        this.channelSessions = sessions;
    }

    public void putMetadata(String key, Object value) {
        this.metadata.put(key, value);
    }

    public void removeMetadata(String key) {
        this.metadata.remove(key);
    }

    public Object getMetadata(String key) {
        return metadata.get(key);
    }
}
