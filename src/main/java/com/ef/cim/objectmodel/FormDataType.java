package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FormDataType extends ConversationData<FormData> {

    @NotNull(message = "FormData object value cannot be null")
    private FormData value;

    @Override
    public FormData getValue() {
        return value;
    }

    @Override
    public void setValue(FormData value) {
        this.value=value;

    }
}
