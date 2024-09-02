package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.IOException;

@AllArgsConstructor
@JsonTypeName("STRING")
public class StringDatatype extends ConversationData<String>{

    public StringDatatype() {
        super();
    }
    @NotNull(message = "value cannot be null")
    @NotBlank(message = "value cannot be blank")
    @JsonDeserialize(using = ValueDeserializer.class)
    @Valid
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
    public static class ValueDeserializer extends JsonDeserializer<String> {
        @Override
        public String deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            if (p.isExpectedStartObjectToken() || p.isExpectedStartArrayToken()) {
                return p.readValueAsTree().toString();
            }
            return p.getValueAsString();
        }
    }
}
