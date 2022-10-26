package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "participantType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ConversationMonitor.class, name = "ConversationMonitor"),
        @JsonSubTypes.Type(value = ChannelSession.class, name = "ChannelSession"),
        @JsonSubTypes.Type(value = CCUser.class, name = "CCUser"),
        @JsonSubTypes.Type(value = BotParticipant.class, name = "Bot")
})
public interface Participant extends Serializable {
    String getId();

    String getDisplayName();
}