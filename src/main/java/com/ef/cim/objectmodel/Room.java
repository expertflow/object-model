package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Room implements Serializable {
    private String id;
    private String name;
    private String description;
    private List<RoomMember> members;
    private RoomType type;
    private String roomLabel;
    private List<ChannelSession> channelSessionList;
    private Boolean isDeleted;
    private String createdBy;
    private Timestamp createdOn;
    private String updatedBy;
    private Timestamp updatedOn;

    public Room(String id, String name, String description, List<RoomMember> members, RoomType type,
                String roomLabel, Boolean isDeleted, String createdBy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.members = members;
        this.type = type;
        this.roomLabel = roomLabel;
        this.channelSessionList = new ArrayList<>();
        this.isDeleted = isDeleted;
        this.createdBy = createdBy;
        this.createdOn = new Timestamp(System.currentTimeMillis());;
    }
}
