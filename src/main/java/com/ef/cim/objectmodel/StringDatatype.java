package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.mongodb.core.index.Indexed;

@AllArgsConstructor
@JsonTypeName("STRING")
public class StringDatatype extends ConversationData<String>{

    public StringDatatype() {
        super();
        this.setType("STRING");
    }
    @NotNull(message = "value cannot be null")
    @NotBlank(message = "value cannot be blank")
    @JsonDeserialize(using = ValueDeserializer.class)
    @Valid
    @Indexed
    private String value;


    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value=value;
    }

    //Todo : Need to check if this can be done with default deserializer
    public static class ValueDeserializer extends tools.jackson.databind.ValueDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt) {
            if (p.isExpectedStartObjectToken() || p.isExpectedStartArrayToken()) {
                return p.readValueAsTree().toString();
            }
            return p.getValueAsString();
        }
    }
}
