package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.constraints.NotBlank;

public class ChannelConnector implements Serializable {

    private String id;
    @NotBlank
    private String name;
    private ChannelProviderInterface channelProviderInterface;
    private List<Attribute> channelProviderConfigs;
    private Tenant tenant;

    public ChannelConnector() {
        this.id = Utils.getObjectId();
        this.channelProviderConfigs = new ArrayList<>();
    }

    public String getId() {
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

    public void setId(String id) {
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