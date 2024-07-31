package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.ConversationTypeEnum;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;


@NoArgsConstructor
@AllArgsConstructor
public class IntegerDatatype extends ConversationData<Integer> {

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
