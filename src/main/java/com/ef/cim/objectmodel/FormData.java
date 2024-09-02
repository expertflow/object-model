package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.*;
import org.bson.types.ObjectId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.constraints.NotNull;
public class FormData {

    @JsonSerialize(using = ToStringSerializer.class)
    @NotNull(message = "Form id cannot be null")
    private String formId;
    @NotNull(message = "Type field of form cannot be null")
    private String type;
    @NotNull(message = "Form title cannot be null")
    private String formTitle;
    @NotNull(message = "formType cannot be null")
    private String formType;
    @NotNull(message = "enableSections field cannot be null")
    private Boolean enableSections;
    @NotNull(message = "attributeType cannot be null")
    private InputAttributeType attributeType;
    @NotNull(message = "enableWeightage field cannot be null")
    private Boolean enableWeightage;
    @NotNull(message = "formWeightage field cannot be null")
    private Object formWeightage;
    private Map<String, Object> additionalDetail = new HashMap<>();
    private Sentiment sentiment;
    private List<Object> sections;

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public Boolean getEnableSections() {
        return enableSections;
    }

    public void setEnableSections(Boolean enableSections) {
        this.enableSections = enableSections;
    }

    public Boolean getEnableWeightage() {
        return enableWeightage;
    }

    public void setEnableWeightage(Boolean enableWeightage) {
        this.enableWeightage = enableWeightage;
    }

    public Object getFormWeightage() {
        return formWeightage;
    }

    public void setFormWeightage(Object formWeightage) {
        this.formWeightage = formWeightage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalDetail() {
        return additionalDetail;
    }

    @JsonAnySetter
    public void setAdditionalDetail(String key, Object value) {
        this.additionalDetail.put(key, value);
    }
    public Sentiment getSentiment() {
        return sentiment;
    }

    public void setSentiment(Sentiment sentiment) {
        this.sentiment = sentiment;
    }

    public List<Object> getSections() {
        return sections;
    }

    public void setSections(List<Object> sections) {
        this.sections = sections;
    }

    public InputAttributeType getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(InputAttributeType attributeType) {
        this.attributeType = attributeType;
    }


}
