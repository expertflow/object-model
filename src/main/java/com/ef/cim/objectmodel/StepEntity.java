package com.ef.cim.objectmodel;

import com.ef.cim.objectmodel.common.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Step entity.
 */
@Getter
@Setter
@ToString
public class StepEntity {
    /**
     * The ID.
     */
    private String id;
    /**
     * The Expressions.
     */
    private List<ExpressionEntity> expressions;
    /**
     * The Timeout.
     */
    @Min(value = 0, message = "Negative integers not allowed for timeout value")
    private int timeout;

    /**
     * Instantiates a new Step entity.
     */
    public StepEntity() {
        this.id = Utils.getObjectId();
        this.expressions = new ArrayList<>();
    }

    /**
     * Contains expression boolean.
     *
     * @param expressionEntity the expression entity
     * @return the boolean
     */
    public boolean containsExpression(ExpressionEntity expressionEntity) {
        return this.expressions.contains(expressionEntity);
    }

    /**
     * Add expression boolean.
     *
     * @param expressionEntity the expression entity
     * @return the boolean
     */
    public boolean addExpression(ExpressionEntity expressionEntity) {
        return this.expressions.add(expressionEntity);
    }

    /**
     * Remove expression boolean.
     *
     * @param expressionEntity the expression entity
     * @return the boolean
     */
    public boolean removeExpression(ExpressionEntity expressionEntity) {
        return this.expressions.remove(expressionEntity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StepEntity that = (StepEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
