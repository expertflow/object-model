package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;

public class FileMessage extends MultimediaMessage {
    //Constructor
    public FileMessage(@JsonProperty("caption") String caption,
                       @JsonProperty("attachment") @Valid Attachment attachment) {
        super(MessageType.FILE, caption, attachment);
    }

    @Override
    public String toString() {
        return "FileMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}