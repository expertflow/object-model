package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

public class MessageHeader implements Serializable {
    @Valid
    private Sender sender;
    @Valid
    private ChannelData channelData;
    private LanguageCode language; // Class LanguageCode Empty | not in object model
    private Timestamp timestamp;
    private MessageSecurity securityInfo; // Class MessageSecurity Empty | not in object model
    private List<String> stamps;
    private String intent;
    private Map<String, Object> entities;
    private String channelSessionId;
    private String conversationId;
    private Customer customer;
    private String replyToMessageId;
    private String providerMessageId;

    // Default Constructor
    public MessageHeader() {
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    // Getters
    public Sender getSender() {
        return this.sender;
    }

    // Setters
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public ChannelData getChannelData() {
        return this.channelData;
    }

    public void setChannelData(ChannelData channelData) {
        this.channelData = channelData;
    }

    public LanguageCode getLanguage() {
        return this.language;
    }

    public void setLanguage(LanguageCode language) {
        this.language = language;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public MessageSecurity getSecurityInfo() {
        return this.securityInfo;
    }

    public void setSecurityInfo(MessageSecurity securityInfo) {
        this.securityInfo = securityInfo;
    }

    public List<String> getStamps() {
        return this.stamps;
    }

    public void setStamps(List<String> stamps) {
        this.stamps = stamps;
    }

    public String getIntent() {
        return this.intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public Map<String, Object> getEntities() {
        return this.entities;
    }

    public void setEntities(Map<String, Object> entities) {
        this.entities = entities;
    }

    public String getChannelSessionId() {
        return this.channelSessionId;
    }

    public void setChannelSessionId(String channelSessionId) {
        this.channelSessionId = channelSessionId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public void addStamp(String stamp) {
        if (this.stamps == null) {
            this.stamps = new ArrayList<String>();
        }
        this.stamps.add(stamp);
    }

    public void removeStamp(String stamp) {
        if (this.stamps != null) {
            this.stamps.remove(stamp);
        }
    }

    public void removeStamp(int index) {
        if (this.stamps != null) {
            this.stamps.remove(index);
        }
    }

    public void addEntity(String entity) {
        if (this.stamps == null) {
            this.stamps = new ArrayList<String>();
        }
        this.stamps.add(entity);
    }

    public void removeEntity(String entity) {
        if (this.stamps != null) {
            this.stamps.remove(entity);
        }
    }

    public void removeEntity(int index) {
        if (this.stamps != null) {
            this.stamps.remove(index);
        }
    }

    public String getReplyToMessageId() {
        return replyToMessageId;
    }

    public void setReplyToMessageId(String replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    public String getProviderMessageId() {
        return providerMessageId;
    }

    public void setProviderMessageId(String providerMessageId) {
        this.providerMessageId = providerMessageId;
    }

    /***
     * String Representation of MessageHeader
     * @return String
     */
    @Override
    public String toString() {
        return "MessageHeader{" +
                "sender=" + sender +
                ", channelData=" + channelData +
                ", language=" + language +
                ", timestamp=" + timestamp +
                ", securityInfo=" + securityInfo +
                ", stamps=" + stamps +
                ", intent='" + intent + '\'' +
                ", entities=" + entities +
                ", channelSessionId=" + channelSessionId +
                ", replyToMessageId=" + replyToMessageId +
                ", providerMessageId='" + providerMessageId + '\'' +
                '}';
    }
}
