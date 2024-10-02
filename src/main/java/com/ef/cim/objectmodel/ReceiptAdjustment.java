package com.ef.cim.objectmodel;

public class ReceiptAdjustment {
    private String name;
    private long amount;

    public ReceiptAdjustment() {
    }

    public ReceiptAdjustment(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ReceiptAdjustment{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}