package com.ef.cim.objectmodel;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;


@AllArgsConstructor
public class BooleanDatatype extends ConversationData<Boolean>{
    public BooleanDatatype() {
        super();
        this.setType("BOOLEAN");
    }
    @Valid
    @NotNull(message = "Boolean value cannot be null")
    @Indexed
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
