package com.ef.cim.objectmodel;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ConversationMonitor implements Participant {
    private UUID id;
    private String displayName;
    private String participantType;

    public ConversationMonitor() {
        this.id = UUID.randomUUID();
        this.displayName = "Conversation Monitor: " + this.id;
        this.participantType = "ConversationMonitor";
    }
}
