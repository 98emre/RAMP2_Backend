package com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.LiftingWorkActions.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class LiftingWorkActions {

    private final int SIZE = 65;
    private final int SIZE_DATE =10;

    private Long id;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions31;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom31;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date31;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate31;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate31;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions32;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom32;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date32;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate32;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate32;

    @JsonIgnore
    private ActionPlan actionPlan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlannedActions31() {
        return plannedActions31;
    }

    public void setPlannedActions31(String plannedActions31) {
        this.plannedActions31 = plannedActions31;
    }

    public String getByWhom31() {
        return byWhom31;
    }

    public void setByWhom31(String byWhom31) {
        this.byWhom31 = byWhom31;
    }

    public String getDate31() {
        return date31;
    }

    public void setDate31(String date31) {
        this.date31 = date31;
    }

    public String getReadyDate31() {
        return readyDate31;
    }

    public void setReadyDate31(String readyDate31) {
        this.readyDate31 = readyDate31;
    }

    public String getFollowUpDate31() {
        return followUpDate31;
    }

    public void setFollowUpDate31(String followUpDate31) {
        this.followUpDate31 = followUpDate31;
    }

    public String getPlannedActions32() {
        return plannedActions32;
    }

    public void setPlannedActions32(String plannedActions32) {
        this.plannedActions32 = plannedActions32;
    }

    public String getByWhom32() {
        return byWhom32;
    }

    public void setByWhom32(String byWhom32) {
        this.byWhom32 = byWhom32;
    }

    public String getDate32() {
        return date32;
    }

    public void setDate32(String date32) {
        this.date32 = date32;
    }

    public String getReadyDate32() {
        return readyDate32;
    }

    public void setReadyDate32(String readyDate32) {
        this.readyDate32 = readyDate32;
    }

    public String getFollowUpDate32() {
        return followUpDate32;
    }

    public void setFollowUpDate32(String followUpDate32) {
        this.followUpDate32 = followUpDate32;
    }

    public ActionPlan getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(ActionPlan actionPlan) {
        this.actionPlan = actionPlan;
    }

    @Override
    public String toString() {
        return "LiftingWorkActions{" +
                "id=" + id +
                ", plannedActions31='" + plannedActions31 + '\'' +
                ", byWhom31='" + byWhom31 + '\'' +
                ", date31='" + date31 + '\'' +
                ", readyDate31='" + readyDate31 + '\'' +
                ", followUpDate31='" + followUpDate31 + '\'' +
                ", plannedActions32='" + plannedActions32 + '\'' +
                ", byWhom32='" + byWhom32 + '\'' +
                ", date32='" + date32 + '\'' +
                ", readyDate32='" + readyDate32 + '\'' +
                ", followUpDate32='" + followUpDate32 + '\'' +
                '}';
    }
}
