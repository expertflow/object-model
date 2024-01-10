package com.ef.cim.objectmodel.room;

import java.util.Objects;
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
public class RoomInfo {
    private String id;
    private RoomMode mode;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoomInfo roomInfo = (RoomInfo) o;
        return id.equals(roomInfo.id) && mode == roomInfo.mode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mode);
    }
}
