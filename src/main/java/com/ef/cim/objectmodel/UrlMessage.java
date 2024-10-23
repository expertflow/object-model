package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;

public class UrlMessage extends StructuredMessage {
    @NotBlank
    private String mediaUrl;

    //default constructor
    public UrlMessage(@JsonProperty("mediaUrl") String mediaUrl) {
        super(MessageType.URL);
        this.mediaUrl = mediaUrl;
    }

    public UrlMessage() {
        super(MessageType.URL);
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Override
    public String toString() {
        return "UrlMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                ", mediaUrl='" + mediaUrl + '\'' +
                '}';
    }
}