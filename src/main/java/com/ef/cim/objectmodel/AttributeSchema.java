package com.ef.cim.objectmodel;

import java.io.Serializable;

public class AttributeSchema implements Serializable {
    private AttributeType attributeType;
    private CategoryOptions categoryOptions;
    private Boolean isRequired;
    private String helpText;
    private String key;
    private String label;
    private ValueType valueType;

    public AttributeSchema() {
    }

    public AttributeType getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType;
    }

    public CategoryOptions getCategoryOptions() {
        return categoryOptions;
    }

    public void setCategoryOptions(CategoryOptions categoryOptions) {
        this.categoryOptions = categoryOptions;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean required) {
        isRequired = required;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    @Override
    public String toString() {
        return "AttributeSchema{" +
                "attributeType=" + attributeType +
                ", categoryOptions=" + categoryOptions +
                ", isRequired=" + isRequired +
                ", helpText='" + helpText + '\'' +
                ", key='" + key + '\'' +
                ", label='" + label + '\'' +
                ", valueType=" + valueType +
                '}';
    }
}