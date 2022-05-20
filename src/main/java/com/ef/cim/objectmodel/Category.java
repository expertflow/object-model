package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private List<String> values;

    public Category() {
        values = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", values=" + values +
                '}';
    }
}