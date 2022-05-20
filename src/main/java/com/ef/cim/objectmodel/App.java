package com.ef.cim.objectmodel;

import java.util.UUID;

// TODO: Overall, follow javadoc comment conventions.

/**
 * An {@code App} object represents a specific topic participant, that carry's information regarding.
 * external apps
 */
public class App implements Participant {
    private final UUID id;
    private String displayName;

    /**
     * Default Constructor Gives a unique identifying number to an {@code App} object.
     */
    public App() {
        this.id = UUID.randomUUID();
    }

    /**
     * Getter: returns the unique identifier for the object.
     *
     * @return {@code java.util.UUID}
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter: returns the display name property of the object.
     *
     * @return {@code String}
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Setter: to set the display name property of the object
     *
     * @param displayName, of type {@code String}
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "App{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
