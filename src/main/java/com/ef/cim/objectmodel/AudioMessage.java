package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;

public class AudioMessage extends MultimediaMessage {
    //Default Constructor
    public AudioMessage(@JsonProperty("caption") String caption,
                        @JsonProperty("attachment") @Valid Attachment attachment) {
        super(MessageType.AUDIO, caption, attachment);
    }

    @Override
    public String toString() {
        return "AudioMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}