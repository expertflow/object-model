package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class Button implements Serializable {
    @NotBlank(message = "button title is mandatory")
    private String title;
    @NotBlank(message = "button payload is mandatory")
    private String payload;
    @NotBlank(message = "button type is mandatory")
    private String type;
    private JsonNode additionalButtonDetails;

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
    public String getType() {
        return this.type;
    }

    /**
     * Sets the action type of the button
     *
     * @param type object of type {@code String}
     */
    public void setType(String type) {
        this.type = type;
    }

    public JsonNode getAdditionalButtonDetails() {
        return additionalButtonDetails;
    }

    public void setAdditionalButtonDetails(JsonNode additionalButtonDetails) {
        this.additionalButtonDetails = additionalButtonDetails;
    }

    /**
     * Converts the {@code Button} object to string.
     *
     * @return {@code String}
     */
    @Override
    public String toString() {
        return "Button{" +
                "title='" + title + '\'' +
                ", payload='" + payload + '\'' +
                ", type='" + type + '\'' +
                ", additionalButtonDetails=" + additionalButtonDetails +
                '}';
    }
}