package com.ef.cim.objectmodel;

import lombok.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


@AllArgsConstructor
public class BooleanDatatype extends ConversationData<Boolean>{
    public BooleanDatatype() {
        super();
        this.setType("BOOLEAN");
    }
    @Valid
    @NotNull(message = "Boolean value cannot be null")
    private Boolean value;


    @Override
    public Boolean getValue() {
        return value;
    }

    @Override
    public void setValue(Boolean value) {
        this.value=value;
    }
}
