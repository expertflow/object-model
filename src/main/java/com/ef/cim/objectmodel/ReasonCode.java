package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Reason code.
 */
@Getter
@Setter
@ToString
public class ReasonCode {
    /**
     * The ID.
     */
    private final String id;
    /**
     * The Name.
     */
    private String name;
    /**
     * The Type.
     */
    private Enums.ReasonCodeType type;

    /**
     * Instantiates a new Reason code.
     */
    public ReasonCode() {
        this.id = Utils.getObjectId();
    }

    /**
     * Instantiates a new Reason code.
     *
     * @param name the name
     * @param type the type
     */
    public ReasonCode(String name, Enums.ReasonCodeType type) {
        this.id = Utils.getObjectId();
        this.name = name;
        this.type = type;
    }
}
