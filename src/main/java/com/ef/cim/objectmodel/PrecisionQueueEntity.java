package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Precision queue entity.
 */
@Getter
@Setter
@ToString
@Document(value = "precisionQueues")
public class PrecisionQueueEntity {
    /**
     * The ID.
     */
    @Id
    private String id;
    /**
     * The Name.
     */
    @NotNull
    @Size(min = 3, max = 50)
    private String name;
    /**
     * The Mrd.
     */
    @NotNull
    private MediaRoutingDomain mrd;
    /**
     * The Service level type.
     */
    @Min(1)
    private int serviceLevelType;
    /**
     * The Service level threshold.
     */
    @NotNull
    private int serviceLevelThreshold;
    /**
     * The Agent service level duration.
     */
    private Integer agentSlaDuration;
    /**
     * The Steps.
     */
    @NotNull
    private List<StepEntity> steps = new ArrayList<>();

    /**
     * Contains step boolean.
     *
     * @param stepEntity the step entity
     * @return the boolean
     */
    public boolean containsStep(StepEntity stepEntity) {
        return this.steps.contains(stepEntity);
    }

    /**
     * Contains step boolean.
     *
     * @param stepId the step id
     * @return the boolean
     */
    public boolean containsStep(String stepId) {
        for (StepEntity step : this.steps) {
            if (step.getId().equals(stepId)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Add step boolean.
     *
     * @param stepEntity the step entity
     */
    public void addStep(StepEntity stepEntity) {
        if (this.steps.size() >= 10) {
            throw new IllegalStateException("Only 10 steps are allowed on this queue");
        }
        if (stepEntity != null) {
            this.steps.add(stepEntity);
        }
    }

    /**
     * Delete step.
     *
     * @param stepEntity the step entity
     */
    public void deleteStep(StepEntity stepEntity) {
        this.steps.remove(stepEntity);
    }

    /**
     * Delete step by id.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean deleteStepById(String id) {
        int index = findStepIndex(id);
        if (index > -1) {
            this.steps.remove(index);
            return true;
        }
        return false;
    }

    /**
     * Find step index int.
     *
     * @param id the id
     * @return the int
     */
    private int findStepIndex(String id) {
        for (int i = 0; i < steps.size(); i++) {
            if (steps.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Update step.
     *
     * @param stepEntity the step entity
     */
    public void updateStep(StepEntity stepEntity) {
        for (int i = 0; i < this.steps.size(); i++) {
            if (this.steps.get(i).equals(stepEntity)) {
                this.steps.set(i, stepEntity);
                break;
            }
        }
    }

    /**
     * Remove step boolean.
     *
     * @param stepEntity the step entity
     * @return the boolean
     */
    public boolean removeStep(StepEntity stepEntity) {
        return this.steps.remove(stepEntity);
    }
}
