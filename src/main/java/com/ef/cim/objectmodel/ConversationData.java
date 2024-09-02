package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = StringDatatype.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BooleanDatatype.class, name = "BOOLEAN"),
        @JsonSubTypes.Type(value = IntegerDatatype.class, name = "INT"),
        @JsonSubTypes.Type(value = FormDataType.class, name = "FORM_DATA"),
        @JsonSubTypes.Type(value = StringDatatype.class, name = "STRING"),
        @JsonSubTypes.Type(value = StringListDatatype.class, name = "STRING_LIST"),
        @JsonSubTypes.Type(value = UrlDatatype.class, name = "URL")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public abstract class ConversationData<T> {
    private String key;

    @Valid
    @JsonProperty("type")
    private String type;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public abstract T getValue();
    public abstract void setValue(T value);

}
