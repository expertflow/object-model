package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;

public class CarouselElement {
    private String text;
    private String url;
    private List<Button> buttons;
    private DefaultAction defaultAction;
    private JsonNode additionalCarouselElementDetails;

    /**
     * Constructor, Initialize all the instance member objects except Strings Initialize all the List objects to empty
     * lists Requires image url to initialize the image property of type {@code ImageButton}
     */
    public CarouselElement() {
        this.buttons = new ArrayList<>();
    }

    public CarouselElement(String text, String url, List<Button> buttons,
                           DefaultAction defaultAction, JsonNode additionalCarouselElementDetails) {
        this.text = text;
        this.url = url;
        this.buttons = buttons;
        this.defaultAction = defaultAction;
        this.additionalCarouselElementDetails = additionalCarouselElementDetails;
    }

    /**
     * Returns the title of the carousal element
     *
     * @return {@code String}
     */
    public String getText() {
        return this.text;
    }

    /**
     * Sets the title of the carousal element
     *
     * @param text, object of type {@code String}
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Returns the action button list of the carousal element
     *
     * @return {@code List<Button>}
     */
    public List<Button> getButtons() {
        return this.buttons;
    }

    /**
     * Sets the action button list of the carousal element
     *
     * @param buttons, object of type {@code List<Button>}
     */
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    /**
     * Returns the default action button of the carousal element
     *
     * @return {@code Button}
     */
    public DefaultAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * Sets the default action button of the carousal element
     *
     * @param defaultAction, object of type {@code Button}
     */
    public void setDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * Adds a button to the list of action buttons
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
     * Takes a {@code Button} object as input and removes it from the list of action buttons
     *
     * @param button, object of type {@code Button}
     */
    public void removeButton(Button button) {
        if (this.buttons != null) {
            this.buttons.remove(button);
        }
    }

    /**
     * Takes an index as input, and removes the object on that index in the action buttons list
     *
     * @param index, of type {@code int}
     */
    public void removeButton(int index) {
        if (this.buttons != null) {
            this.buttons.remove(index);
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public JsonNode getAdditionalCarouselElementDetails() {
        return additionalCarouselElementDetails;
    }

    public void setAdditionalCarouselElementDetails(JsonNode additionalCarouselElementDetails) {
        this.additionalCarouselElementDetails = additionalCarouselElementDetails;
    }

    @Override
    public String toString() {
        return "CarouselElement{" +
                "text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", buttons=" + buttons +
                ", defaultAction=" + defaultAction +
                ", additionalCarouselElementDetails=" + additionalCarouselElementDetails +
                '}';
    }
}