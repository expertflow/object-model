package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
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
    public String getDisplayName() {
        return name + ":" + id;
    }
}
