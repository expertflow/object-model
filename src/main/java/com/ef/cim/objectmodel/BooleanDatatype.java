package com.ef.cim.objectmodel;

import lombok.*;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@AllArgsConstructor
public class BooleanDatatype extends ConversationData<Boolean>{
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
