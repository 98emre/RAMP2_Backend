package com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.RepetitiveWorkActions.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class RepetitiveWorkActions {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    private Long id;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions21;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom21;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date21;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate21;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate21;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions22;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom22;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date22;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate22;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate22;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions23;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom23;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date23;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate23;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate23;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions24;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom24;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date24;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate24;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate24;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions25;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom25;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date25;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate25;


    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate25;


    @JsonIgnore
    private ActionPlan actionPlan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlannedActions21() {
        return plannedActions21;
    }

    public void setPlannedActions21(String plannedActions21) {
        this.plannedActions21 = plannedActions21;
    }

    public String getByWhom21() {
        return byWhom21;
    }

    public void setByWhom21(String byWhom21) {
        this.byWhom21 = byWhom21;
    }

    public String getDate21() {
        return date21;
    }

    public void setDate21(String date21) {
        this.date21 = date21;
    }

    public String getReadyDate21() {
        return readyDate21;
    }

    public void setReadyDate21(String readyDate21) {
        this.readyDate21 = readyDate21;
    }

    public String getFollowUpDate21() {
        return followUpDate21;
    }

    public void setFollowUpDate21(String followUpDate21) {
        this.followUpDate21 = followUpDate21;
    }

    public String getPlannedActions22() {
        return plannedActions22;
    }

    public void setPlannedActions22(String plannedActions22) {
        this.plannedActions22 = plannedActions22;
    }

    public String getByWhom22() {
        return byWhom22;
    }

    public void setByWhom22(String byWhom22) {
        this.byWhom22 = byWhom22;
    }

    public String getDate22() {
        return date22;
    }

    public void setDate22(String date22) {
        this.date22 = date22;
    }

    public String getReadyDate22() {
        return readyDate22;
    }

    public void setReadyDate22(String readyDate22) {
        this.readyDate22 = readyDate22;
    }

    public String getFollowUpDate22() {
        return followUpDate22;
    }

    public void setFollowUpDate22(String followUpDate22) {
        this.followUpDate22 = followUpDate22;
    }

    public String getPlannedActions23() {
        return plannedActions23;
    }

    public void setPlannedActions23(String plannedActions23) {
        this.plannedActions23 = plannedActions23;
    }

    public String getByWhom23() {
        return byWhom23;
    }

    public void setByWhom23(String byWhom23) {
        this.byWhom23 = byWhom23;
    }

    public String getDate23() {
        return date23;
    }

    public void setDate23(String date23) {
        this.date23 = date23;
    }

    public String getReadyDate23() {
        return readyDate23;
    }

    public void setReadyDate23(String readyDate23) {
        this.readyDate23 = readyDate23;
    }

    public String getFollowUpDate23() {
        return followUpDate23;
    }

    public void setFollowUpDate23(String followUpDate23) {
        this.followUpDate23 = followUpDate23;
    }

    public String getPlannedActions24() {
        return plannedActions24;
    }

    public void setPlannedActions24(String plannedActions24) {
        this.plannedActions24 = plannedActions24;
    }

    public String getByWhom24() {
        return byWhom24;
    }

    public void setByWhom24(String byWhom24) {
        this.byWhom24 = byWhom24;
    }

    public String getDate24() {
        return date24;
    }

    public void setDate24(String date24) {
        this.date24 = date24;
    }

    public String getReadyDate24() {
        return readyDate24;
    }

    public void setReadyDate24(String readyDate24) {
        this.readyDate24 = readyDate24;
    }

    public String getFollowUpDate24() {
        return followUpDate24;
    }

    public void setFollowUpDate24(String followUpDate24) {
        this.followUpDate24 = followUpDate24;
    }

    public String getPlannedActions25() {
        return plannedActions25;
    }

    public void setPlannedActions25(String plannedActions25) {
        this.plannedActions25 = plannedActions25;
    }

    public String getByWhom25() {
        return byWhom25;
    }

    public void setByWhom25(String byWhom25) {
        this.byWhom25 = byWhom25;
    }

    public String getDate25() {
        return date25;
    }

    public void setDate25(String date25) {
        this.date25 = date25;
    }

    public String getReadyDate25() {
        return readyDate25;
    }

    public void setReadyDate25(String readyDate25) {
        this.readyDate25 = readyDate25;
    }

    public String getFollowUpDate25() {
        return followUpDate25;
    }

    public void setFollowUpDate25(String followUpDate25) {
        this.followUpDate25 = followUpDate25;
    }

    public ActionPlan getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(ActionPlan actionPlan) {
        this.actionPlan = actionPlan;
    }

    @Override
    public String toString() {
        return "RepetitiveWorkActions{" +
                "id=" + id +
                ", plannedActions21='" + plannedActions21 + '\'' +
                ", byWhom21='" + byWhom21 + '\'' +
                ", date21='" + date21 + '\'' +
                ", readyDate21='" + readyDate21 + '\'' +
                ", followUpDate21='" + followUpDate21 + '\'' +
                ", plannedActions22='" + plannedActions22 + '\'' +
                ", byWhom22='" + byWhom22 + '\'' +
                ", date22='" + date22 + '\'' +
                ", readyDate22='" + readyDate22 + '\'' +
                ", followUpDate22='" + followUpDate22 + '\'' +
                ", plannedActions23='" + plannedActions23 + '\'' +
                ", byWhom23='" + byWhom23 + '\'' +
                ", date23='" + date23 + '\'' +
                ", readyDate23='" + readyDate23 + '\'' +
                ", followUpDate23='" + followUpDate23 + '\'' +
                ", plannedActions24='" + plannedActions24 + '\'' +
                ", byWhom24='" + byWhom24 + '\'' +
                ", date24='" + date24 + '\'' +
                ", readyDate24='" + readyDate24 + '\'' +
                ", followUpDate24='" + followUpDate24 + '\'' +
                ", plannedActions25='" + plannedActions25 + '\'' +
                ", byWhom25='" + byWhom25 + '\'' +
                ", date25='" + date25 + '\'' +
                ", readyDate25='" + readyDate25 + '\'' +
                ", followUpDate25='" + followUpDate25 + '\'' +
                ", actionPlan=" + actionPlan +
                '}';
    }
}
