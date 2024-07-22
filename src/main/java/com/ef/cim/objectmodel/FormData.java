package com.ef.cim.objectmodel;

import java.util.List;

import javax.validation.constraints.NotNull;

public class FormData {
    @NotNull(message = "Form id cannot be null")
    private String formId;
    @NotNull(message = "Form type cannot be null")
    private String type;
    @NotNull(message = "Form title cannot be null")
    private String formTitle;
    @NotNull(message = "Form type cannot be null")
    private String formType;
    private String markdownText;
    private List<AttributeData> attributes;

    public FormData() {
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarkdownText() {
        return markdownText;
    }

    public void setMarkdownText(String markdownText) {
        this.markdownText = markdownText;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
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

    public List<AttributeData> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeData> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "FormDataBody{" +
                "type='" + type + '\'' +
                ", markdownText='" + markdownText + '\'' +
                ", formId='" + formId + '\'' +
                ", formTitle='" + formTitle + '\'' +
                ", formType='" + formType + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
