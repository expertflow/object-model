package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("STRING")
public class StringDatatype extends ConversationData<String>{
    private String value;


    @Override
    public String getValue() {
        return value;
    }

    public void setObjectValue(JsonNode node) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Extract the "value" node from the payload
            JsonNode valueNode = node.get("value");
            if (valueNode != null) {
                // Convert the value node to a JSON string
                this.value = mapper.writeValueAsString(valueNode);
            } else {
                // If "value" node is not present, fallback to a string representation
                this.value = node.toString();
            }
        } catch (JsonProcessingException e) {
            this.value = node.toString(); // Fallback in case of an error
        }
    }

    @Override
    public void setValue(String value) {
        this.value=value;
    }
}
