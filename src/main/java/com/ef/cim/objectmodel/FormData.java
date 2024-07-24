package com.ef.cim.objectmodel;

import lombok.*;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FormData {
    @NotNull(message = "Form id cannot be null")
    private String formId;
    @NotNull(message = "Form type cannot be null")
    private String type;
    @NotNull(message = "Form title cannot be null")
    private String formTitle;
    @NotNull(message = "Form type cannot be null")
    private String formType;
    private Boolean enableSections;
    private Boolean enableWeightage;
    private Object formWeightage;
    private Map<String, Object> sections;

}
