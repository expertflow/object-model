package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import com.ef.cim.objectmodel.dto.ExternalGadgetRequestedDto;
import com.ef.cim.objectmodel.room.RoomInfo;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Conversation implements Serializable {
    private final String id;
    private Customer customer;
    private List<ConversationParticipant> participants;
    private TopicState state;
    private Direction conversationDirection;
    private ChannelSession channelSession;
    private Timestamp creationTime;
    private Timestamp endTime;
    private Map<String, String> conversationData = new HashMap<>();
    private TopicMetadata metadata;
    private RoomInfo roomInfo;
    private AgentSla agentSla = new AgentSla();
    private int cachedAgentSlaDuration;
    private HoldTimerDetails holdTimerDetails = new HoldTimerDetails();
    private ExternalGadgetRequestedDto externalGadgetDetails;

    public Conversation() {
        this.id = Utils.getObjectId();
        this.participants = new ArrayList<>();
        this.metadata = new TopicMetadata();
    }

    public Conversation(String topicId, TopicState state, ChannelSession channelSession, RoomInfo roomInfo) {
        this.id = topicId;
        this.customer = channelSession.getCustomer();
        this.state = state;
        this.channelSession = channelSession;
        this.conversationDirection = channelSession.getChannelSessionDirection();
        this.creationTime = new Timestamp(System.currentTimeMillis());
        this.metadata = new TopicMetadata(channelSession);
        this.participants = new ArrayList<>();
        this.roomInfo = roomInfo;
    }

    public Conversation(ChannelSession channelSession) {
        this(channelSession.getConversationId(), TopicState.CREATED, channelSession, channelSession.getRoomInfo());
    }

    public void addParticipant(ConversationParticipant participant) {
        if (this.participants == null) {
            this.participants = new ArrayList<>();
        }
        this.participants.add(participant);
    }

    public void removeParticipant(ConversationParticipant participant) {
        if (this.participants != null) {
            this.participants.remove(participant);
        }
    }

    public void removeParticipant(int index) {
        if (this.participants != null) {
            this.participants.remove(index);
        }
    }
}