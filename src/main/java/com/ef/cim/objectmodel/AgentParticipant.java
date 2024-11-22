package com.ef.cim.objectmodel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class AgentParticipant implements Serializable {
    @Indexed(name = "agentParticipant_id_1")
    private String id;
    private String firsName;
    private String lastName;
    @Indexed(name = "username_1")
    private String username;
    private String teamId;

    public AgentParticipant(String id, String firsName, String lastName, String username, String teamId) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.username = username;
        this.teamId = teamId;
    }
}
