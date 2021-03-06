package com.ef.cim.objectmodel;

public class CarousalButton extends Button {
    private int buttonHeight;

    // Default Constructor
    public CarousalButton() {
    }

    // Getters
    public int getButtonHeight() {
        return this.buttonHeight;
    }

    // Setters
    public void setButtonHeight(int buttonHeight) {
        this.buttonHeight = buttonHeight;
    }

    @Override
    public String toString() {
        return "CarousalButton{" +
                "title='" + title + '\'' +
                ", payload='" + payload + '\'' +
                ", actionType='" + actionType + '\'' +
                ", bgColor='" + bgColor + '\'' +
                ", index=" + index +
                ", buttonHeight=" + buttonHeight +
                '}';
    }
}
