package com.ef.cim.objectmodel;

public class ReceiptSummary {
    private long subtotal;
    private long shippingCost;
    private long totalTax;
    private long totalCost;

    public ReceiptSummary() {
    }

    public ReceiptSummary(long subtotal, long shippingCost, long totalTax, long totalCost) {
        this.subtotal = subtotal;
        this.shippingCost = shippingCost;
        this.totalTax = totalTax;
        this.totalCost = totalCost;
    }

    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    public long getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(long shippingCost) {
        this.shippingCost = shippingCost;
    }

    public long getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(long totalTax) {
        this.totalTax = totalTax;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "ReceiptSummary{" +
                "subtotal=" + subtotal +
                ", shippingCost=" + shippingCost +
                ", totalTax=" + totalTax +
                ", totalCost=" + totalCost +
                '}';
    }
}