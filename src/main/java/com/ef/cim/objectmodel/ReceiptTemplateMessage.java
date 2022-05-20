package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ReceiptTemplateMessage extends StructuredMessage {
    private final String templateType;
    private Boolean sharable;
    private String recipientName;
    private String merchantName;
    private String orderNumber;
    private String currency;
    private String paymentMethode;
    private String timestamp;
    private List<ReceiptElement> elements;
    private Address address;
    private ReceiptSummary summary;
    private List<ReceiptAdjustment> adjustments;

    public ReceiptTemplateMessage() {
        super(MessageType.RECEIPT);
        this.templateType = "receipt";
    }

    public ReceiptTemplateMessage(@JsonProperty("sharable") Boolean sharable,
                                  @JsonProperty("recipientName") String recipientName,
                                  @JsonProperty("merchantName") String merchantName,
                                  @JsonProperty("orderNumber") String orderNumber,
                                  @JsonProperty("currency") String currency,
                                  @JsonProperty("paymentMethode") String paymentMethode,
                                  @JsonProperty("timestamp") String timestamp,
                                  @JsonProperty("elements") List<ReceiptElement> elements,
                                  @JsonProperty("address") Address address,
                                  @JsonProperty("summary") ReceiptSummary summary,
                                  @JsonProperty("adjustments") List<ReceiptAdjustment> adjustments) {
        super(MessageType.RECEIPT);
        this.templateType = "receipt";
        this.sharable = sharable;
        this.recipientName = recipientName;
        this.merchantName = merchantName;
        this.orderNumber = orderNumber;
        this.currency = currency;
        this.paymentMethode = paymentMethode;
        this.timestamp = timestamp;
        this.elements = elements;
        this.address = address;
        this.summary = summary;
        this.adjustments = adjustments;
    }

    public String getTemplateType() {
        return templateType;
    }

    public Boolean getSharable() {
        return sharable;
    }

    public void setSharable(Boolean sharable) {
        this.sharable = sharable;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentMethode() {
        return paymentMethode;
    }

    public void setPaymentMethode(String paymentMethode) {
        this.paymentMethode = paymentMethode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<ReceiptElement> getElements() {
        return elements;
    }

    public void setElements(List<ReceiptElement> elements) {
        this.elements = elements;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ReceiptSummary getSummary() {
        return summary;
    }

    public void setSummary(ReceiptSummary summary) {
        this.summary = summary;
    }

    public List<ReceiptAdjustment> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<ReceiptAdjustment> adjustments) {
        this.adjustments = adjustments;
    }

    @Override
    public String toString() {
        return "ReceiptTemplateMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", templateType='" + templateType + '\'' +
                ", sharable=" + sharable +
                ", recipientName='" + recipientName + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", currency='" + currency + '\'' +
                ", paymentMethode='" + paymentMethode + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", elements=" + elements +
                ", address=" + address +
                ", summary=" + summary +
                ", adjustments=" + adjustments +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}