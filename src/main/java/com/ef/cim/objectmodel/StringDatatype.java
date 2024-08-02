package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.IOException;

@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("STRING")
public class StringDatatype extends ConversationData<String>{
    @NotNull(message = "value cannot be null")
    @NotBlank(message = "value cannot be blank")
    @JsonDeserialize(using = ValueDeserializer.class)
    private String value;


    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value=value;
    }

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
