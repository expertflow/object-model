package com.ef.cim.objectmodel;

import java.util.UUID;
import lombok.ToString;

/**
 * The type Reason code.
 */
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

    /**
     * Gets id.
     *
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public Enums.ReasonCodeType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(Enums.ReasonCodeType type) {
        this.type = type;
    }
}
