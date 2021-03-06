package com.ef.cim.objectmodel;

import java.io.Serializable;

public class Button implements Serializable {
    protected String title;
    protected String payload;
    protected String actionType;
    protected String bgColor;
    protected int index;

    /**
     * Returns the title of the button
     *
     * @return {@code String}
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the title of the button
     *
     * @param title object of type {@code String}
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the payload of the button
     *
     * @return {@code String}
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * Sets the payload of the button
     *
     * @param payload object of type {@code String}
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Returns the action type of the button
     *
     * @return {@code String}
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * Sets the action type of the button
     *
     * @param actionType object of type {@code String}
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * Returns the bgColor of the button
     *
     * @return {@code String}
     */
    public String getBgColor() {
        return this.bgColor;
    }

    /**
     * Sets the bgColor of the button
     *
     * @param bgColor object of type {@code String}
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    /**
     * Returns the index of the button
     *
     * @return {@code int}
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * Sets the index of the button
     *
     * @param index of type {@code int}
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Converts the {@code Button} object to string
     *
     * @return {@code String}
     */
    @Override
    public String toString() {
        return "Button{"
                + "title='"
                + title
                + '\''
                + ", payload='"
                + payload
                + '\''
                + ", actionType='"
                + actionType
                + '\''
                + ", bgColor='"
                + bgColor
                + '\''
                + ", index='"
                + index
                + '\''
                + '}';
    }
}
