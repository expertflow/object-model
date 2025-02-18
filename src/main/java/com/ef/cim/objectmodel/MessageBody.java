package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.io.Serializable;
import jakarta.validation.constraints.NotNull;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = GenericMessage.class, visible = true)
@JsonSubTypes({@Type(value = DeliveryNotification.class, name = "DELIVERYNOTIFICATION"),
        @Type(value = DeletedNotification.class, name = "DELETEDNOTIFICATION"),
        @Type(value = CustomMessage.class, name = "CUSTOM"),
        @Type(value = StructuredMessage.class, name = "StructuredMessage"),
        @Type(value = NotificationMessage.class, name = "NOTIFICATION"),
        @Type(value = MultimediaMessage.class, name = "MULTIMEDIA"),
        @Type(value = VideoMessage.class, name = "VIDEO"),
        @Type(value = ImageMessage.class, name = "IMAGE"),
        @Type(value = AudioMessage.class, name = "AUDIO"),
        @Type(value = FileMessage.class, name = "FILE"),
        @Type(value = ContactMessage.class, name = "CONTACT"),
        @Type(value = LocationMessage.class, name = "LOCATION"),
        @Type(value = CarouselMessage.class, name = "CAROUSEL"),
        @Type(value = ButtonMessage.class, name = "BUTTON"),
        @Type(value = MessageBody.class, name = "PLAIN"),
        @Type(value = VoiceMessage.class, name = "VOICE"),
        @Type(value = UrlMessage.class, name = "URL"),
        @Type(value = StickerMessage.class, name = "STICKER"),
        @Type(value = ReceiptTemplateMessage.class, name = "RECEIPT"),
        @Type(value = WrapUpMessage.class, name = "WRAPUP"),
        @Type(value = TemplateMessage.class, name = "TEMPLATE"),
        @Type(value = ActionMessageBody.class, name = "ACTION"),
        @Type(value = CommentMessage.class, name = "COMMENT"),
        @Type(value = EmailMessage.class, name = "EMAIL"),
        @Type(value = FormDataMessage.class, name = "FORMDATA")
})
public class MessageBody implements Serializable {
    @NotNull
    @JsonProperty("type")
    protected String type;
    protected String markdownText;

    public MessageBody() {
        this.type = MessageType.PLAIN;
    }

    /**
     * Default Constructor
     *
     * @param type value of MessageType
     */
    public MessageBody(@JsonProperty("type") String type) {
        this.type = type;
    }

    // Getters
    public String getType() {
        return this.type;
    }

    public String getMarkdownText() {
        return this.markdownText;
    }

    // Setters
    public void setMarkdownText(String markdownText) {
        this.markdownText = markdownText;
    }

    /***
     * String Representation of MessageBody
     * @return String
     */
    @Override
    public String toString() {
        return "MessageBody{" + "type=" + type + ", markdownText='" + markdownText + '\'' + '}';
    }
}
