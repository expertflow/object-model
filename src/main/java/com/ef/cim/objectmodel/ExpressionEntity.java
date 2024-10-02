package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Expression entity.
 */
@Getter
@Setter
@ToString
public class ExpressionEntity {
    /**
     * The Terms.
     */
    private List<TermEntity> terms = new ArrayList<>();
    /**
     * The Pre expression condition.
     */
    private String preExpressionCondition;

    /**
     * Contains term boolean.
     *
     * @param termEntity the term entity
     * @return the boolean
     */
    public boolean containsTerm(TermEntity termEntity) {
        return this.terms.contains(termEntity);
    }

    /**
     * Add term boolean.
     *
     * @param termEntity the term entity
     * @return the boolean
     */
    public boolean addTerm(TermEntity termEntity) {
        return this.terms.add(termEntity);
    }

    /**
     * Remove term boolean.
     *
     * @param termEntity the term entity
     * @return the boolean
     */
    public boolean removeTerm(TermEntity termEntity) {
        return this.terms.remove(termEntity);
    }
}