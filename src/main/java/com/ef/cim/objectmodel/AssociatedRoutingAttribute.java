package com.ef.cim.objectmodel;

import javax.validation.constraints.NotNull;

public class AssociatedRoutingAttribute {
    @NotNull
    private RoutingAttribute routingAttribute;
    private int value;

    public RoutingAttribute getRoutingAttribute() {
        return routingAttribute;
    }

    public void setRoutingAttribute(RoutingAttribute routingAttribute) {
        this.routingAttribute = routingAttribute;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AssociatedRoutingAttribute{"
                + "routingAttribute=" + routingAttribute
                + ", value='" + value + '\''
                + '}';
    }
}
