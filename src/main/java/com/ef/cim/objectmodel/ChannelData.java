package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.constraints.NotBlank;

/**
 * A {@code ChannelData} object represents the data available on different type of channels. For
 * example on web channel we have browser id, language e.t.c This is the <strong>parent</strong>
 * object for more specific channels' data objects. e.g. WebChannelData.
 */
public class ChannelData implements Serializable {
    @NotBlank(message = "channelCustomerIdentifier is mandatory")
    private String channelCustomerIdentifier;
    @NotBlank(message = "serviceIdentifier is mandatory")
    private String serviceIdentifier;
    private int requestPriority;
    private String customerFirstName;
    private String customerLastName;

    // This field should be List<KeyValuePair>. Changed it for initial integration
    // with Agent Manager
    private List<Attribute> additionalAttributes;

    public ChannelData() {
        this.additionalAttributes = new ArrayList<>();
    }

    public String getChannelCustomerIdentifier() {
        return channelCustomerIdentifier;
    }

    public void setChannelCustomerIdentifier(String channelCustomerIdentifier) {
        this.channelCustomerIdentifier = channelCustomerIdentifier;
    }

    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    public List<Attribute> getAdditionalAttributes() {
        return additionalAttributes;
    }

    public void setAdditionalAttributes(List<Attribute> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    public void addAdditionalAttribute(Attribute attribute) {
        this.additionalAttributes.add(attribute);
    }

    public void removeAdditionalAttribute(KeyValuePair keyValuePair) {
        this.additionalAttributes.remove(keyValuePair);
    }

    public void removeAdditionalAttribute(int index) {
        this.additionalAttributes.remove(index);
    }

    public int getRequestPriority() {
        return requestPriority;
    }

    public void setRequestPriority(int requestPriority) {
        this.requestPriority = requestPriority;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    /**
     * String Representation of ChannelData
     *
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelData{" +
                "channelCustomerIdentifier='" + channelCustomerIdentifier + '\'' +
                ", serviceIdentifier='" + serviceIdentifier + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", requestPriority=" + requestPriority +
                ", additionalAttributes=" + additionalAttributes +
                '}';
    }
}