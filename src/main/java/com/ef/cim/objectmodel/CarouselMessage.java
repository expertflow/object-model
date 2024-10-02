package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A {@code CarousalMessage} object represents the body of a message that is of CAROUSAL type
 */
public class CarouselMessage extends StructuredMessage {
    private CarouselMessageType carouselMessageType;
    private List<CarouselElement> elements;

    /**
     * Default Constructor, Sets the message type to CAROUSAL Initialize the list of carousal elements as an empty list
     */
    public CarouselMessage(@JsonProperty("carouselMessageType") CarouselMessageType carouselMessageType) {
        super(MessageType.CAROUSEL);
        this.elements = new ArrayList<>();
        this.carouselMessageType = carouselMessageType;
    }

    public CarouselMessage(@JsonProperty("carouselMessageType") CarouselMessageType carouselMessageType,
                           @JsonProperty("elements") List<CarouselElement> elements) {
        super(MessageType.CAROUSEL);
        this.carouselMessageType = carouselMessageType;
        this.elements = elements;
    }

    /**
     * Returns the list of carousal elements of the carousal message
     *
     * @return {@code List<CarousalElement>}
     */
    public List<CarouselElement> getElements() {
        return this.elements;
    }

    /**
     * Sets the list of carousal elements of the carousal message
     *
     * @param elements, object of type {@code List<CarousalElement>}
     */
    public void setElements(List<CarouselElement> elements) {
        this.elements = elements;
    }

    /**
     * Adds an element to the list of carousal elements
     *
     * @param element, object of type {@code CarousalElement}
     */
    public void addElement(CarouselElement element) {
        if (this.elements == null) {
            this.elements = new ArrayList<CarouselElement>();
        }
        this.elements.add(element);
    }

    /**
     * Takes a carousal element as input, and removes it from the list of carousal elements
     *
     * @param element, object of type {@code CarousalElement}
     */
    public void removeElement(CarouselElement element) {
        if (this.elements != null) {
            this.elements.remove(element);
        }
    }

    /**
     * Takes an index as input, and remove the object on that index in the list of carousal elements
     *
     * @param index, of type {@code int}
     */
    public void removeElement(int index) {
        if (this.elements != null) {
            this.elements.remove(index);
        }
    }

    public CarouselMessageType getCarouselMessageType() {
        return carouselMessageType;
    }

    public void setCarouselMessageType(CarouselMessageType carouselMessageType) {
        this.carouselMessageType = carouselMessageType;
    }

    @Override
    public String toString() {
        return "CarouselMessage{" +
                "carouselMessageType=" + carouselMessageType +
                ", elements=" + elements +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}