package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AttributeData implements Serializable {
    private String id;
    private String label;
    private String valueType;
    private String skipType;
    private String attributeAttachment;
    private List<AnswerData> answer;

    public AttributeData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getSkipType() {
        return skipType;
    }

    public void setSkipType(String skipType) {
        this.skipType = skipType;
    }

    public String getAttributeAttachment() {
        return attributeAttachment;
    }

    public void setAttributeAttachment(String attributeAttachment) {
        this.attributeAttachment = attributeAttachment;
    }

    public List<AnswerData> getAnswer() {
        return answer;
    }

    public void setAnswer(List<AnswerData> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "AttributeData{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", valueType='" + valueType + '\'' +
                ", skipType='" + skipType + '\'' +
                ", attributeAttachment='" + attributeAttachment + '\'' +
                ", answer=" + answer +
                '}';
    }
}
