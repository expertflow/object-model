package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.io.Serializable;
import java.util.List;

public class ChannelProviderInterface implements Serializable {
    private String id;
    private String name;
    private List<ChannelType> supportedChannelTypes;
    private String providerWebhook;
    private List<AttributeSchema> channelProviderConfigSchema;

    public ChannelProviderInterface() {
        this.id = Utils.getObjectId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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