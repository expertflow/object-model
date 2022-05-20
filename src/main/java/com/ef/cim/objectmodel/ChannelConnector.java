package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotBlank;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ChannelConnector")
public class ChannelConnector implements Serializable {
    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private ObjectId id;
    @NotBlank
    private String name;
    @DBRef
    private ChannelProviderInterface channelProviderInterface;
    private List<Attribute> channelProviderConfigs;
    private Tenant tenant;

    public ChannelConnector() {
        this.id = new ObjectId();
        this.channelProviderConfigs = new ArrayList<>();
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ChannelProviderInterface getChannelProviderInterface() {
        return channelProviderInterface;
    }

    public void setChannelProviderInterface(ChannelProviderInterface channelProviderInterface) {
        this.channelProviderInterface = channelProviderInterface;
    }

    public List<Attribute> getChannelProviderConfigs() {
        return channelProviderConfigs;
    }

    public void setChannelProviderConfigs(List<Attribute> channelProviderConfigs) {
        this.channelProviderConfigs = channelProviderConfigs;
    }

    /***
     * String Representation of ChannelConnector.
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelConnector{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", channelProviderInterface=" + channelProviderInterface +
                ", channelProviderConfigs=" + channelProviderConfigs +
                ", tenant=" + tenant +
                '}';
    }
}