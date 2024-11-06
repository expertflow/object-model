package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;

public class VideoMessage extends MultimediaMessage {
    // Constructor
    public VideoMessage(@JsonProperty("caption") String caption,
                        @JsonProperty("attachment") @Valid Attachment attachment) {
        super(MessageType.VIDEO, caption, attachment);
    }

    @Override
    public String toString() {
        return "VideoMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}