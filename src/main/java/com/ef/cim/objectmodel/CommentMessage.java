package com.ef.cim.objectmodel;


import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

public class CommentMessage extends MessageBody{

    @NotNull(message = "postId is mandatory")
    private String postId;
    private Attachment attachment;
    @NotNull(message = "itemType is mandatory")
    private ItemType itemType;

    // Constructor
    public CommentMessage(@JsonProperty("type") MessageType type){
        super(MessageType.COMMENT);
    }

    // Getters
    public String getPostId() {
        return postId;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public ItemType getItemType() {
        return itemType;
    }

    // Setters
    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "CommentMessage{" +
                "postId='" + postId + '\'' +
                ", attachment=" + attachment +
                ", itemType=" + itemType +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                '}';
    }
}
