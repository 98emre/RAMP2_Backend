package com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.PushingAndPullingActions.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PushingAndPullingActions {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    private Long id;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions41;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom41;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date41;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate41;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate41;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions42;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom42;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date42;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate42;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate42;

    @JsonIgnore
    private ActionPlan actionPlan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlannedActions41() {
        return plannedActions41;
    }

    public void setPlannedActions41(String plannedActions41) {
        this.plannedActions41 = plannedActions41;
    }

    public String getByWhom41() {
        return byWhom41;
    }

    public void setByWhom41(String byWhom41) {
        this.byWhom41 = byWhom41;
    }

    public String getDate41() {
        return date41;
    }

    public void setDate41(String date41) {
        this.date41 = date41;
    }

    public String getReadyDate41() {
        return readyDate41;
    }

    public void setReadyDate41(String readyDate41) {
        this.readyDate41 = readyDate41;
    }

    public String getFollowUpDate41() {
        return followUpDate41;
    }

    public void setFollowUpDate41(String followUpDate41) {
        this.followUpDate41 = followUpDate41;
    }

    public String getPlannedActions42() {
        return plannedActions42;
    }

    public void setPlannedActions42(String plannedActions42) {
        this.plannedActions42 = plannedActions42;
    }

    public String getByWhom42() {
        return byWhom42;
    }

    public void setByWhom42(String byWhom42) {
        this.byWhom42 = byWhom42;
    }

    public String getDate42() {
        return date42;
    }

    public void setDate42(String date42) {
        this.date42 = date42;
    }

    public String getReadyDate42() {
        return readyDate42;
    }

    public void setReadyDate42(String readyDate42) {
        this.readyDate42 = readyDate42;
    }

    public String getFollowUpDate42() {
        return followUpDate42;
    }

    public void setFollowUpDate42(String followUpDate42) {
        this.followUpDate42 = followUpDate42;
    }

    public ActionPlan getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(ActionPlan actionPlan) {
        this.actionPlan = actionPlan;
    }

    @Override
    public String toString() {
        return "PushingAndPullingActions{" +
                "id=" + id +
                ", plannedActions41='" + plannedActions41 + '\'' +
                ", byWhom41='" + byWhom41 + '\'' +
                ", date41='" + date41 + '\'' +
                ", readyDate41='" + readyDate41 + '\'' +
                ", followUpDate41='" + followUpDate41 + '\'' +
                ", plannedActions42='" + plannedActions42 + '\'' +
                ", byWhom42='" + byWhom42 + '\'' +
                ", date42='" + date42 + '\'' +
                ", readyDate42='" + readyDate42 + '\'' +
                ", followUpDate42='" + followUpDate42 + '\'' +
                '}';
    }
}
