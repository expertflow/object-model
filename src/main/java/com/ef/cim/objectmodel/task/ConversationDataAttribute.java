package com.ef.cim.objectmodel.task;

import com.ef.cim.objectmodel.ValueType;
import com.ef.cim.objectmodel.enums.ConversationTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ConversationDataAttribute  implements Serializable {
    private String key;
    
    @NotNull
    @JsonProperty("type")
    private ConversationTypeEnum type;
    private String value;

    public ConversationDataAttribute() {
    }

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

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "key='" + key + '\'' +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
