package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("INT")
public class IntegerDatatype extends ConversationData<Integer> {
    @Valid
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
