package com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.PhysicalDiscomfortActions.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PhysicalDiscomfortActions {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    private Long id;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions71;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom71;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date71;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate71;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate71;

    @JsonIgnore
    private ActionPlan actionPlan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlannedActions71() {
        return plannedActions71;
    }

    public void setPlannedActions71(String plannedActions71) {
        this.plannedActions71 = plannedActions71;
    }

    public String getByWhom71() {
        return byWhom71;
    }

    public void setByWhom71(String byWhom71) {
        this.byWhom71 = byWhom71;
    }

    public String getDate71() {
        return date71;
    }

    public void setDate71(String date71) {
        this.date71 = date71;
    }

    public String getReadyDate71() {
        return readyDate71;
    }

    public void setReadyDate71(String readyDate71) {
        this.readyDate71 = readyDate71;
    }

    public String getFollowUpDate71() {
        return followUpDate71;
    }

    public void setFollowUpDate71(String followUpDate71) {
        this.followUpDate71 = followUpDate71;
    }

    public ActionPlan getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(ActionPlan actionPlan) {
        this.actionPlan = actionPlan;
    }

    @Override
    public String toString() {
        return "PhysicalDiscomfortActions{" +
                "id=" + id +
                ", plannedActions71='" + plannedActions71 + '\'' +
                ", byWhom71='" + byWhom71 + '\'' +
                ", date71='" + date71 + '\'' +
                ", readyDate71='" + readyDate71 + '\'' +
                ", followUpDate71='" + followUpDate71 + '\'' +
                '}';
    }
}
