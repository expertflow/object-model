package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.enums.ConversationTypeEnum;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FormDataType extends ConversationData<FormData> {

    private FormData value;

//    @Override
//    public FormData getValue() {
//        return value;
//    }
//
//    @Override
//    public void setValue(FormData value) {
//        this.value=value;
//
//    }
}
