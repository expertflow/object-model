package com.ef.cim.objectmodel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
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

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof AgentParticipant agentParticipant)) return false;
        return Objects.equals(getId(), agentParticipant.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
