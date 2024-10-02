package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public class FormData implements Serializable {
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId formId;
    private String filledBy;
    private Date createdOn;
    private List<Attribute> attributes;

    public FormData() {
        this.id = new ObjectId();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getFormId() {
        return formId;
    }

    public void setFormId(ObjectId formId) {
        this.formId = formId;
    }

    public String getFilledBy() {
        return filledBy;
    }

    public void setFilledBy(String filledBy) {
        this.filledBy = filledBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "FormData{" +
                "id=" + id +
                ", formId=" + formId +
                ", filledBy='" + filledBy + '\'' +
                ", createdOn=" + createdOn +
                ", attributes=" + attributes +
                '}';
    }
}