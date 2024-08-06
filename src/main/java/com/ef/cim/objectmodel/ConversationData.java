package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "Type", defaultImpl = StringDatatype.class,  visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BooleanDatatype.class, name = "BOOLEAN"),
        @JsonSubTypes.Type(value = IntegerDatatype.class, name = "INT"),
        @JsonSubTypes.Type(value = FormDataType.class, name = "FORM_DATA"),
        @JsonSubTypes.Type(value = StringDatatype.class, name = "STRING"),
        @JsonSubTypes.Type(value = StringListDatatype.class, name = "STRING_LIST"),
        @JsonSubTypes.Type(value = UrlDatatype.class, name = "URL")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ConversationData<T> {
    private String key;
    @NotNull
    @Valid
    @JsonProperty("Type")
    private String Type;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }
    public abstract T getValue();
    public abstract void setValue(T value);

}
