package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CustomerWidgetConfig")
public class CustomerWidgetConfig {
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    @Id
    private String widgetIdentifier;
    private String theme;
    private String title;
    private String subTitle;
    private boolean enableFontResize;
    private boolean enableEmoji;
    private boolean enableFileTransfer;
    private boolean enableDynamicLink;
    private boolean enableDownloadTranscript;
    private int customerReconnectTime;
    private Language language;

    public CustomerWidgetConfig() {
        this.id = new ObjectId();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getWidgetIdentifier() {
        return widgetIdentifier;
    }

    public void setWidgetIdentifier(String widgetIdentifier) {
        this.widgetIdentifier = widgetIdentifier;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public boolean isEnableFontResize() {
        return enableFontResize;
    }

    public void setEnableFontResize(boolean enableFontResize) {
        this.enableFontResize = enableFontResize;
    }

    public boolean isEnableEmoji() {
        return enableEmoji;
    }

    public void setEnableEmoji(boolean enableEmoji) {
        this.enableEmoji = enableEmoji;
    }

    public boolean isEnableFileTransfer() {
        return enableFileTransfer;
    }

    public void setEnableFileTransfer(boolean enableFileTransfer) {
        this.enableFileTransfer = enableFileTransfer;
    }

    public boolean isEnableDynamicLink() {
        return enableDynamicLink;
    }

    public void setEnableDynamicLink(boolean enableDynamicLink) {
        this.enableDynamicLink = enableDynamicLink;
    }

    public boolean isEnableDownloadTranscript() {
        return enableDownloadTranscript;
    }

    public void setEnableDownloadTranscript(boolean enableDownloadTranscript) {
        this.enableDownloadTranscript = enableDownloadTranscript;
    }

    public int getCustomerReconnectTime() {
        return customerReconnectTime;
    }

    public void setCustomerReconnectTime(int customerReconnectTime) {
        this.customerReconnectTime = customerReconnectTime;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "CustomerWidgetConfig{" +
                "id=" + id +
                ", widgetIdentifier='" + widgetIdentifier + '\'' +
                ", theme=" + theme +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", enableFontResize=" + enableFontResize +
                ", enableEmoji=" + enableEmoji +
                ", enableFileTransfer=" + enableFileTransfer +
                ", enableDynamicLink=" + enableDynamicLink +
                ", enableDownloadTranscript=" + enableDownloadTranscript +
                ", customerReconnectTime=" + customerReconnectTime +
                ", language=" + language +
                '}';
    }
}