package com.ef.cim.objectmodel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
@ToString
public class AgentParticipant {
    @Indexed(unique = true)
    private String id;
    private String firsName;
    private String lastName;
    @Indexed(name = "userName_1")
    private String userName;
    private String teamId;

    public AgentParticipant(String id, String firsName, String lastName, String userName, String teamId) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.userName = userName;
        this.teamId = teamId;
    }
}
