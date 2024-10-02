package com.ef.cim.objectmodel;

import java.io.Serializable;

public class NLUIntent implements Serializable {
    private String name;
    private double confidence;

    public NLUIntent() {

    }

    public NLUIntent(String name, double confidence) {
        this.name = name;
        this.confidence = confidence;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConfidence() {
        return this.confidence;
    }

    public void setConfidence(double value) {
        this.confidence = value;
    }

    @Override
    public String toString() {
        return "NLUIntent{" +
                "name='" + name + '\'' +
                ", confidence=" + confidence +
                '}';
    }
}