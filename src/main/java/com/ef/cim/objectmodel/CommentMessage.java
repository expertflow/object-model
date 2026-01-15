package com.ef.cim.objectmodel;

import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentMessage extends MessageBody{

    @NotNull(message = "postId is mandatory")
    private String postId;

    @NotNull(message = "itemType is mandatory")
    private ItemType itemType;

    private Attachment attachment;
    private List<Attribute> additionalAttributes = new ArrayList<>();

    public CommentMessage(){
        super(MessageType.COMMENT);
    }

    @Override
    public String toString() {
        return "CommentMessage{" +
                "postId='" + postId + '\'' +
                ", attachment=" + attachment +
                ", itemType=" + itemType +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalAttributes='" + additionalAttributes + '\'' +
                '}';
    }
}
