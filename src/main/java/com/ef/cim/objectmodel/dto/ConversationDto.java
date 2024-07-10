package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.AgentSla;
import com.ef.cim.objectmodel.ChannelSession;
import com.ef.cim.objectmodel.CimEvent;
import com.ef.cim.objectmodel.Conversation;
import com.ef.cim.objectmodel.ConversationParticipant;
import com.ef.cim.objectmodel.Customer;
import com.ef.cim.objectmodel.HoldTimerDetails;
import com.ef.cim.objectmodel.ParticipantType;
import com.ef.cim.objectmodel.TopicState;
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
    private AgentSla agentSla;
    private List<Customer> customerSuggestions = new ArrayList<>();
    private List<CimEvent> topicEvents;
    private HoldTimerDetails holdTimerDetails;
    private ExternalGadgetRequestedDto externalGadgetDetails;


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
        this.externalGadgetDetails = conversation.getExternalGadgetDetails();
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
