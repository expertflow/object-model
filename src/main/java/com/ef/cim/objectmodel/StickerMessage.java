package com.ef.cim.objectmodel;

public class StickerMessage extends StructuredMessage {

    private String mediaUrl;
    private String stickerId;

    //default Constructor
    public StickerMessage() {
        super(MessageType.STICKER);
    }

    public StickerMessage(String mediaUrl, String stickerId) {
        super(MessageType.STICKER);
        this.mediaUrl = mediaUrl;
        this.stickerId = stickerId;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getStickerId() {
        return stickerId;
    }

    public void setStickerId(String stickerId) {
        this.stickerId = stickerId;
    }

    @Override
    public String toString() {
        return "StickerMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
                ", stickerId='" + stickerId + '\'' +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
