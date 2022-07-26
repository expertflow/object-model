package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A {@code Channel} object represents a specific channel (e.g whatsapp, facebook)
 */
@Document(collection = "Channel")
public class Channel implements Serializable {

    @Id
    private String id;
    @NotBlank
    private String name;
    // Class ServiceIdentifier Empty | not in object model yet
    @NotBlank(message = "serviceIdentifier can not be blank")
    @Indexed(unique = true)
    private String serviceIdentifier;
    private Tenant tenant;
    @Valid
    private ChannelConfig channelConfig;
    @DBRef
    private ChannelConnector channelConnector;
    @DBRef
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
    }

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
     * Set's Id field of Chanel as UUID
     *
     * @param id UUID object
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the type of the channel
     *
     * @return {@code ChannelType}
     */
    /** public ChannelType getType() {
     return this.type;
     }*/

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
     * Returns the tenant of the channel
     *
     * @return {@code Tenant}
     */
    /** public Tenant getTenant() {
     return this.tenant;
     }*/

    /**
     * Returns the service identifier of the channel
     *
     * @return {@code ServiceIdentifier}
     */
    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * Sets the type of the channel
     *
     * @param type, object of type {@code ChannelType}
     */
    /** public void setType(ChannelType type) {
     this.type = type;
     }*/

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
     * Sets the tenant of the channel
     *
     * @param tenant, object of type {@code Tenant}
     */
    /** public void setTenant(Tenant tenant) {
     this.tenant = tenant;
     }*/

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

    /***
     * String Representation of Channel
     * @return String
     */
    @Override
    public String toString() {
        return "Channel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serviceIdentifier='" + serviceIdentifier + '\'' +
                ", tenant=" + tenant +
                ", channelConfig=" + channelConfig +
                ", channelConnector=" + channelConnector +
                ", channelType=" + channelType +
                '}';
    }
}