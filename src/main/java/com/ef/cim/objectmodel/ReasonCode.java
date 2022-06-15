package com.ef.cim.objectmodel;

import java.util.UUID;
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
    private final UUID id;
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
        this.id = UUID.randomUUID();
    }

    /**
     * Instantiates a new Reason code.
     *
     * @param name the name
     * @param type the type
     */
    public ReasonCode(String name, Enums.ReasonCodeType type) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.type = type;
    }
}
