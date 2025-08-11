package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.ReactionType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReactionMessage extends MessageBody {
    private String messageId;
    private ReactionType reactionType;

    public ReactionMessage() {
        super(MessageType.REACTION);
    }

    public ReactionMessage(ReactionType reactionType, String messageId) {
        super(MessageType.REACTION);
        this.messageId = messageId;
        this.reactionType = reactionType;
    }
}
