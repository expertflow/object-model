package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Conversation dto.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConversationDto {
    private String id;
    private Customer customer;
    private ChannelSession channelSession;
    private Map<String, String> conversationData = new HashMap<>();
    private TopicState state;
    private List<ConversationParticipant> participants;
    private List<AgentParticipant> agentParticipants;
    private AgentSla agentSla;
    private Long durationInSeconds;
    private List<Customer> customerSuggestions = new ArrayList<>();
    private List<CimEvent> topicEvents;
    private HoldTimerDetails holdTimerDetails;
    private AgentHandRaise agentHandRaise;
    private List<Gadget> externalGadgets;
    private List<WrapUp> wrapUps;


    /**
     * Instantiates a new Conversation dto.
     *
     * @param conversation       the conversation
     * @param conversationEvents the conversation events
     */
    public ConversationDto(Conversation conversation, List<CimEvent> conversationEvents) {
        this.id = conversation.getId();
        this.customer = conversation.getCustomer();
        this.channelSession = conversation.getChannelSession();
        this.conversationData = conversation.getConversationData();
        this.state = conversation.getState();
        this.participants = conversation.getParticipants();
        this.setCustomerSuggestionsFrom(conversation);
        this.agentSla = conversation.getAgentSla();
        this.topicEvents = conversationEvents;
        this.holdTimerDetails = conversation.getHoldTimerDetails();
        this.agentHandRaise = conversation.getAgentHandRaise();
        this.externalGadgets = conversation.getExternalGadgets();
        this.agentParticipants = conversation.getAgentParticipants();
        this.wrapUps = conversation.getWrapUps();
        this.durationInSeconds = conversation.getDurationInSeconds();
    }

    private void setCustomerSuggestionsFrom(Conversation conversation) {
        for (ConversationParticipant conversationParticipant : conversation.getParticipants()) {
            if (conversationParticipant.getType().equals(ParticipantType.CUSTOMER)) {
                ChannelSession session = (ChannelSession) conversationParticipant.getParticipant();
                this.customerSuggestions = session.getCustomerSuggestions();
                break;
            }
        }
    }
}
