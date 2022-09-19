package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BotParticipant implements Participant {
    private String id;
    private BotType type;
    private String name;
    private String uri;

    private String participantType;

    public BotParticipant() {
        this.id = Utils.getObjectId();
        this.participantType = "Bot";
    }

    public BotParticipant(String id, BotType type, String name, String uri) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.uri = uri;

        this.participantType = "Bot";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BotParticipant that = (BotParticipant) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @JsonIgnore
    @Override
    public String getDisplayName() {
        return name + ":" + id;
    }
}
