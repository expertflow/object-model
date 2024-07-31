package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.ConversationTypeEnum;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.validation.Valid;


@NoArgsConstructor
@AllArgsConstructor
public class BooleanDatatype extends ConversationData<Boolean>{

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
