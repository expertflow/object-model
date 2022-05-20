package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.List;
import javax.validation.constraints.NotBlank;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class ChannelProviderInterface {
    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private ObjectId id;
    private String name;
    @DBRef
    private List<ChannelType> supportedChannelTypes;
    @NotBlank(message = "providerWebhook cannot be blank")
    private String providerWebhook;
    private List<AttributeSchema> channelProviderConfigSchema;

    public ChannelProviderInterface() {
        this.id = new ObjectId();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChannelType> getSupportedChannelTypes() {
        return supportedChannelTypes;
    }

    public void setSupportedChannelTypes(List<ChannelType> supportedChannelTypes) {
        this.supportedChannelTypes = supportedChannelTypes;
    }

    public String getProviderWebhook() {
        return providerWebhook;
    }

    public void setProviderWebhook(String providerWebhook) {
        this.providerWebhook = providerWebhook;
    }

    public List<AttributeSchema> getChannelProviderConfigSchema() {
        return channelProviderConfigSchema;
    }

    public void setChannelProviderConfigSchema(
            List<AttributeSchema> channelProviderConfigSchema) {
        this.channelProviderConfigSchema = channelProviderConfigSchema;
    }

    @Override
    public String toString() {
        return "ChannelProviderInterface{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", supportedChannelTypes=" + supportedChannelTypes +
                ", providerWebhook='" + providerWebhook + '\'' +
                ", channelProviderConfigSchema=" + channelProviderConfigSchema +
                '}';
    }
}