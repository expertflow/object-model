package com.ef.cim.objectmodel.room;

import com.ef.cim.objectmodel.ChannelSession;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * The type Response body.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoomDto {
    private Room room;
    private List<ChannelSession> channelSessions = new ArrayList<>();

    /**
     * Instantiates a new Room entity.
     *
     * @param room the room
     */
    public RoomDto(Room room) {
        this.room = room;
        this.channelSessions = new ArrayList<>();
    }
}
