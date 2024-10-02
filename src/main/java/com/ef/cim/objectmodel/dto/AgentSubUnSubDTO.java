package com.ef.cim.objectmodel.dto;

import com.ef.cim.objectmodel.ConversationParticipant;
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
public class AgentSubUnSubDTO implements Serializable {
    private ConversationParticipant agentParticipant;
    private String reason;
}