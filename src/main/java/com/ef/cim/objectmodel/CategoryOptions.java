package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

public class CategoryOptions {
    private Boolean isMultipleChoice;
    private List<Category> categories;

    public CategoryOptions() {
        categories = new ArrayList<>();
    }

    public Boolean getIsMultipleChoice() {
        return isMultipleChoice;
    }

    public void setIsMultipleChoice(Boolean multipleChoice) {
        isMultipleChoice = multipleChoice;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "CategoryOptions{" +
                "isMultipleChoice=" + isMultipleChoice +
                ", categories=" + categories +
                '}';
    }
}