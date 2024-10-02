package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;

// TODO: Overall, follow javadoc comment conventions.

/**
 * An {@code App} object represents a specific topic participant, that carry's information regarding.
 * external apps
 */
public class App implements Participant {
    private final String id;
    private String displayName;

    /**
     * Default Constructor Gives a unique identifying number to an {@code App} object.
     */
    public App() {
        this.id = Utils.getObjectId();
        ;
    }

    /**
     * Getter: returns the unique identifier for the object.
     *
     * @return {@code java.util.UUID}
     */
    public String getId() {
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
