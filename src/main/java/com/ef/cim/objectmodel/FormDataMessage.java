package com.ef.cim.objectmodel;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FormDataMessage extends MessageBody {
    @Valid
    private FormData formData;
}

