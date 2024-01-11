package com.ef.cim.objectmodel.room;

import com.ef.cim.objectmodel.AgentState;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.NotNull;
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
public class RoomMember implements Serializable {
    @NotNull(message = "Field 'id' can not null")
    private String id;
    @NotNull(message = "Field 'name' can not null")
    private String name;
    @NotNull(message = "Field 'type' can not null")
    private RoomMemberType type;
    private AgentState status;
    private String roomId;

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
}
