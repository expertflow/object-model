package com.ef.cim.objectmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class FormDataType extends ConversationData<List<FormData>> {
    @Valid
    @NotNull(message = "FormData object value cannot be null")
    @Size(min = 1, message = "FormData must contain at least one element")
    private List<FormData> value;

    @Override
    public List<FormData> getValue() {
        return value;
    }

    @Override
    public void setValue(List<FormData> value) {
        this.value = value;
    }
}
