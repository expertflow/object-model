package com.ef.cim.objectmodel;

import java.io.Serializable;
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
    private String name;
    private String status;
    private MemberType memberType;
    private String memberId;
    private String roomId;
}
