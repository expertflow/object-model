package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class IntegerDatatype extends ConversationData<Integer> {
    public IntegerDatatype() {
        super();
        this.setType("INT");
    }

    @Valid
    @NotNull(message = "Integer value cannot be null")
    @Min(value = 0, message = "Integer value must be non-negative")
    @Indexed
    private Integer value;

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value=value;

    }
}