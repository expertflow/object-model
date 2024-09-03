package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.io.Serializable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * A {@code Channel} object represents a specific channel (e.g whatsapp, facebook)
 */
public class Channel implements Serializable {
    private String id;
    @NotBlank
    private String name;
    // Class ServiceIdentifier Empty | not in object model yet
    @NotBlank(message = "serviceIdentifier can not be blank")
    private String serviceIdentifier;
    @NotNull
    private boolean defaultOutbound;
    private Tenant tenant;
    @Valid
    private ChannelConfig channelConfig;
    private ChannelConnector channelConnector;
    private ChannelType channelType;

    /**
     * Default Constructor, Sets an immutable Unique Identifying Number for the channel Initializes all the instance
     * member objects except the Strings
     */
    public Channel() {
        this.id = Utils.getObjectId();
        this.tenant = new Tenant();
        this.channelConfig = new ChannelConfig();
        this.channelConnector = new ChannelConnector();
        this.channelType = new ChannelType();
        this.defaultOutbound = false;
    }

    /**
     * parameterized constructor.
     * @param name channel name
     * @param serviceIdentifier channel serviceIdentifier
     * @param channelConfig channelConfig
     * @param channelConnector channelConnector
     * @param tenant tenant
     * @param channelType channelType
     */
    public Channel(String name, String serviceIdentifier, ChannelConfig channelConfig,
                   ChannelConnector channelConnector, Tenant tenant, ChannelType channelType) {
        this.id = Utils.getObjectId();
        this.name = name;
        this.serviceIdentifier = serviceIdentifier;
        this.channelConfig = channelConfig;
        this.channelConnector = channelConnector;
        this.tenant = tenant;
        this.channelType = channelType;
    }

    /**
     * Returns the Unique identifier of the channel
     *
     * @return {@code UUID}
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set's id field of Chanel as UUID
     *
     * @param id UUID object
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the name of the channel
     *
     * @return {@code String}
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the channel
     *
     * @param name, object of type {@code String}
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the service identifier of the channel
     *
     * @return {@code ServiceIdentifier}
     */
    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * Sets the service identifier of the channel
     *
     * @param serviceIdentifier, object of type {@code ServiceIdentifier}
     */
    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * Returns the configurations of the channel
     *
     * @return {@code ChannelConfig}
     */
    public ChannelConfig getChannelConfig() {
        return this.channelConfig;
    }

    /**
     * Sets the configurations of the channel
     *
     * @param channelConfig, object of type {@code ChannelConfig}
     */
    public void setChannelConfig(ChannelConfig channelConfig) {
        this.channelConfig = channelConfig;
    }

    public ChannelConnector getChannelConnector() {
        return channelConnector;
    }

    public void setChannelConnector(ChannelConnector channelConnector) {
        this.channelConnector = channelConnector;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public boolean isDefaultOutbound() {
        return defaultOutbound;
    }

    public void setDefaultOutbound(boolean defaultOutbound) {
        this.defaultOutbound = defaultOutbound;
    }

    /***
     * String Representation of Channel
     * @return String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Channel{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", serviceIdentifier='").append(serviceIdentifier).append('\'');
        sb.append(", defaultOutbound=").append(defaultOutbound);
        sb.append(", tenant=").append(tenant);
        sb.append(", channelConfig=").append(channelConfig);
        sb.append(", channelConnector=").append(channelConnector);
        sb.append(", channelType=").append(channelType);
        sb.append('}');
        return sb.toString();
    }
}