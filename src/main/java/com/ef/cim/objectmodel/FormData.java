package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.*;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FormData {
    @JsonSerialize(using = ToStringSerializer.class)
    @NotNull(message = "Form id cannot be null")
    private ObjectId formId;
    @NotNull(message = "Form type cannot be null")
    private String type;
    @NotNull(message = "Form title cannot be null")
    private String formTitle;
    @NotNull(message = "Form type cannot be null")
    private String formType;
    private Boolean enableSections;
    private Boolean enableWeightage;
    private Object formWeightage;
    private AdditionalDetail additionalDetail;
    private Sentiment sentiment;
    private List<Object> sections;
}
