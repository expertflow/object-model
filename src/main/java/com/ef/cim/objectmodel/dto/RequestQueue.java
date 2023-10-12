package com.ef.cim.objectmodel.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestQueue {
    /**
     * The Type.
     */
    @NotBlank
    private Type type;
    /**
     * The Value.
     */
    @NotBlank
    private String value;

    /**
     * The enum Type.
     */
    public enum Type {
        ID,
        NAME
    }
}
