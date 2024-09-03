package com.ef.cim.objectmodel;

import jakarta.validation.constraints.NotBlank;

public class Attachment {
    @NotBlank
    private String mediaUrl;    // Actual url of the media file that can be used to retrieve or store it.
                                // E.g: www.media.com?filename=123_abc.png
    private String thumbnail;
    private String mimeType;
    private long size;
    private String mediaLabel;  //  Label of the media that should be shown in case its required.
                                //  E.g: abc.png
    private String mediaName;   // Actual name of media file that can be used to retrieve or store it.
                                //  E.g: 123_abc.png

    public Attachment() {
    }

    // Getters
    public String getMediaUrl() {
        return this.mediaUrl;
    }

    // Setters
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getMediaLabel() {
        return mediaLabel;
    }
    public void setMediaLabel(String mediaLabel) {
        this.mediaLabel = mediaLabel;
    }

    public String getMediaName() {
        return mediaName;
    }
    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "mediaUrl='" + mediaUrl + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", mediaLabel='" + mediaLabel + '\'' +
                ", mediaName='" + mediaName + '\'' +
                ", size=" + size +
                '}';
    }
}