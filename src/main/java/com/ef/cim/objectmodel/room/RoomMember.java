package com.ef.cim.objectmodel.room;

import com.ef.cim.objectmodel.AgentState;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoomMember implements Serializable {
    @NotNull(message = "Field 'id' can not null")
    private String id;
    @NotNull(message = "Field 'name' can not null")
    private String name;
    @NotNull(message = "Field 'type' can not null")
    private RoomMemberType type;
    private AgentState status;
    private String roomId;
    private Timestamp joinTime;
    @Indexed
    private int unreadCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoomMember that = (RoomMember) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public RoomMember(String id, String name, RoomMemberType type, AgentState status, String roomId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.roomId = roomId;
    }
}
