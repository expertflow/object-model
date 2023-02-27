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
    private String form;
    private WebRtcConfigurations webRtc;

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

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public WebRtcConfigurations getWebRtc() {
        return webRtc;
    }

    public void setWebRtc(WebRtcConfigurations webRtc) {
        this.webRtc = webRtc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerWidgetConfig{");
        sb.append("id=").append(id);
        sb.append(", widgetIdentifier='").append(widgetIdentifier).append('\'');
        sb.append(", theme='").append(theme).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", subTitle='").append(subTitle).append('\'');
        sb.append(", enableFontResize=").append(enableFontResize);
        sb.append(", enableEmoji=").append(enableEmoji);
        sb.append(", enableFileTransfer=").append(enableFileTransfer);
        sb.append(", enableDynamicLink=").append(enableDynamicLink);
        sb.append(", enableDownloadTranscript=").append(enableDownloadTranscript);
        sb.append(", customerReconnectTime=").append(customerReconnectTime);
        sb.append(", language=").append(language);
        sb.append(", form='").append(form).append('\'');
        sb.append(", webRtc=").append(webRtc);
        sb.append('}');
        return sb.toString();
    }
}