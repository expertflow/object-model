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
 * AdvisorSubscriberEvent DTO.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdvisorSubscriberEventDto {
    private RoomMember roomMember;
    private List<ChannelSession> channelSessions = new ArrayList<>();
}
