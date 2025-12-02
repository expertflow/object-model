package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.mongodb.core.index.Indexed;

public class FormData implements Serializable {

    @JsonSerialize(using = ToStringSerializer.class)
    @NotNull(message = "Form id cannot be null")
    @Indexed
    private String formId;
    @NotNull(message = "Type field of form cannot be null")
    @Indexed
    private String type;
    @NotNull(message = "Form title cannot be null")
    private String formTitle;
    private Boolean enableSections;
    private AttributeType attributeType;
    private Boolean enableWeightage;
    private Object formWeightage;
    private Map<String, Object> additionalDetail = new HashMap<>();
    private Sentiment sentiment;
    private Double formScore;
    private String submissionSource;
    private Review review;
    private Subject subject;
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

    public Map<String, Object> getAdditionalDetail() {
        return additionalDetail;
    }

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

    public AttributeType getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType;
    }

    public Double getFormScore() {
        return formScore;
    }

    public void setFormScore(Double formScore) {
        this.formScore = formScore;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getSubmissionSource() {
        return submissionSource;
    }

    public void setSubmissionSource(String submissionSource) {
        this.submissionSource = submissionSource;
    }
}