package com.ef.cim.objectmodel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Term entity.
 */
@Getter
@Setter
@ToString
public class TermEntity {
    /**
     * The Routing attribute.
     */
    private RoutingAttribute routingAttribute;
    /**
     * The Relational operator.
     */
    private String relationalOperator;
    /**
     * The Value.
     */
    private int value;
    /**
     * The Pre term condition.
     */
    private String preTermCondition;
}
