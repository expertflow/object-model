package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "forms")
public class Form implements Serializable {
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private String id;
    private String formTitle;
    private String formDescription;
    private List<AttributeSchema> attributes;

    public Form() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    public String getFormDescription() {
        return formDescription;
    }

    public void setFormDescription(String formDescription) {
        this.formDescription = formDescription;
    }

    public List<AttributeSchema> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeSchema> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", formTitle='" + formTitle + '\'' +
                ", formDescription='" + formDescription + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}