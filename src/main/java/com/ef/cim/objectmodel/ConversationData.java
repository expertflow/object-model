package com.ef.cim.objectmodel;
import com.ef.cim.objectmodel.enums.ConversationTypeEnum;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true, defaultImpl = StringDatatype.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BooleanDatatype.class, name = "BOOLEAN"),
        @JsonSubTypes.Type(value = IntegerDatatype.class, name = "INT"),
        @JsonSubTypes.Type(value = FormDataType.class, name = "FORM_DATA"),
        @JsonSubTypes.Type(value = StringDatatype.class, name = "STRING"),
        @JsonSubTypes.Type(value = StringListDatatype.class, name = "STRING_LIST"),
        @JsonSubTypes.Type(value = UrlDatatype.class, name = "URL")
})
public class ConversationData {

    private String key;
    @JsonProperty("type")
    private ConversationTypeEnum type;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ConversationTypeEnum getType() {
        return type;
    }

    public void setType(ConversationTypeEnum type) {
        this.type = type;
    }
}