package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ButtonMessage extends StructuredMessage {
    @Valid
    private List<Button> buttons = new ArrayList<>();
    private ButtonMessageType buttonMessageType;

    /**
     * Default Constructor Initializes an empty buttons list.
     */
    public ButtonMessage(@JsonProperty("buttonMessageType") ButtonMessageType buttonMessageType) {
        super(MessageType.BUTTON);
        this.buttonMessageType = buttonMessageType;
    }

    public ButtonMessage(List<Button> buttons, ButtonMessageType buttonMessageType) {
        super(MessageType.BUTTON);
        this.buttons = buttons;
        this.buttonMessageType = buttonMessageType;
    }

    /**
     * Adds a {@code Button} object in the list of buttons
     *
     * @param button, object of type {@code Button}
     */
    public void addButton(Button button) {
        if (this.buttons == null) {
            this.buttons = new ArrayList<>();
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
}