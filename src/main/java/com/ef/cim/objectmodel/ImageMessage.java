package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;

public class ImageMessage extends MultimediaMessage {
    public ImageMessage(@JsonProperty("caption") String caption,
                        @JsonProperty("attachment") @Valid Attachment attachment) {
        super(MessageType.IMAGE, caption, attachment);
    }

    @Override
    public String toString() {
        return "ImageMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}