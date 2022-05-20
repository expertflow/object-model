package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

public class ButtonMessage extends StructuredMessage {
    @Valid
    private List<Button> buttons;
    private ButtonMessageType buttonMessageType;

    /**
     * Default Constructor Initializes an empty buttons list.
     */
    public ButtonMessage(@JsonProperty("buttonMessageType") ButtonMessageType buttonMessageType) {
        super(MessageType.BUTTON);
        buttons = new ArrayList<>();
        this.buttonMessageType = buttonMessageType;
    }

    public ButtonMessage(@JsonProperty("buttons") List<Button> buttons,
                         @JsonProperty("buttonMessageType") ButtonMessageType buttonMessageType) {
        super(MessageType.BUTTON);
        this.buttons = buttons;
        this.buttonMessageType = buttonMessageType;
    }

    /**
     * Returns the list of buttons
     *
     * @return {@code List<Button>}
     */
    public List<Button> getButtons() {
        return this.buttons;
    }

    /**
     * Sets the list of buttons
     *
     * @param buttons, object of type {@code List<Button>}
     */
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    /**
     * Adds a {@code Button} object in the list of buttons
     *
     * @param button, object of type {@code Button}
     */
    public void addButton(Button button) {
        if (this.buttons == null) {
            this.buttons = new ArrayList<Button>();
        }

        this.buttons.add(button);
    }

    /**
     * Removes a {@code Button} object from the list of buttons
     *
     * @param button, object of type {@code Button}
     */
    public void removeButton(Button button) {
        if (this.buttons != null) {
            this.buttons.remove(button);
        }
    }

    /**
     * Removes a {@code Button} object from the list of buttons
     *
     * @param index, of type {@code int}
     */
    public void removeButton(int index) {
        if (this.buttons != null) {
            this.buttons.remove(index);
        }
    }

    public ButtonMessageType getButtonMessageType() {
        return this.buttonMessageType;
    }


    public void setButtonMessageType(ButtonMessageType buttonMessageType) {
        this.buttonMessageType = buttonMessageType;
    }

    /**
     * Converts the {@code ButtonMessage} object to string.
     *
     * @return {@code String}
     */
    @Override
    public String toString() {
        return "ButtonMessage{" +
                "buttons=" + buttons +
                ", buttonMessageType=" + buttonMessageType +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}