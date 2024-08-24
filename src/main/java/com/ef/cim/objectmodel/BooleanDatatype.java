package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.validator.conversationdata.ValidBoolean;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@AllArgsConstructor
public class BooleanDatatype extends ConversationData<Boolean>{
    public BooleanDatatype() {
        super();
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
