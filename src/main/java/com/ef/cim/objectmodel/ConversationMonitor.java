package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ConversationMonitor implements Participant {
    private String id;
    private String displayName;
    private String participantType;

    public ConversationMonitor() {
        this.id = Utils.getObjectId();
        this.displayName = "Conversation Monitor: " + this.id;
        this.participantType = "ConversationMonitor";
    }
}
