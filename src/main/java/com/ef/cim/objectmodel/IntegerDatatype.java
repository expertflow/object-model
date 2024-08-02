package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@AllArgsConstructor
public class IntegerDatatype extends ConversationData<Integer> {

    @NotNull(message = "Integer value cannot be null")
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
