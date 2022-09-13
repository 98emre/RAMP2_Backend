package com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.PostureActions.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PostureActions {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    private Long id;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions11;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom11;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date11;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate11;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate11;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions12;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom12;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date12;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate12;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate12;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions13;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom13;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date13;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate13;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate13;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions14;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom14;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date14;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate14;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate14;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions15;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom15;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date15;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate15;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate15;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions16;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom16;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date16;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate16;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate16;

    @Size(max = SIZE, message = "SIZE  IS Max")
    private String plannedActions17;


    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom17;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date17;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate17;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate17;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String plannedActions18;

    @Size(max = SIZE, message = "SIZE IS Max")
    private String byWhom18;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String date18;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String readyDate18;

    @Size(max = SIZE_DATE, message = "SIZE DATE IS Max")
    private String followUpDate18;

    @JsonIgnore
    private ActionPlan actionPlan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlannedActions11() {
        return plannedActions11;
    }

    public void setPlannedActions11(String plannedActions11) {
        this.plannedActions11 = plannedActions11;
    }

    public String getByWhom11() {
        return byWhom11;
    }

    public void setByWhom11(String byWhom11) {
        this.byWhom11 = byWhom11;
    }

    public String getDate11() {
        return date11;
    }

    public void setDate11(String date11) {
        this.date11 = date11;
    }

    public String getReadyDate11() {
        return readyDate11;
    }

    public void setReadyDate11(String readyDate11) {
        this.readyDate11 = readyDate11;
    }

    public String getFollowUpDate11() {
        return followUpDate11;
    }

    public void setFollowUpDate11(String followUpDate11) {
        this.followUpDate11 = followUpDate11;
    }

    public String getPlannedActions12() {
        return plannedActions12;
    }

    public void setPlannedActions12(String plannedActions12) {
        this.plannedActions12 = plannedActions12;
    }

    public String getByWhom12() {
        return byWhom12;
    }

    public void setByWhom12(String byWhom12) {
        this.byWhom12 = byWhom12;
    }

    public String getDate12() {
        return date12;
    }

    public void setDate12(String date12) {
        this.date12 = date12;
    }

    public String getReadyDate12() {
        return readyDate12;
    }

    public void setReadyDate12(String readyDate12) {
        this.readyDate12 = readyDate12;
    }

    public String getFollowUpDate12() {
        return followUpDate12;
    }

    public void setFollowUpDate12(String followUpDate12) {
        this.followUpDate12 = followUpDate12;
    }

    public String getPlannedActions13() {
        return plannedActions13;
    }

    public void setPlannedActions13(String plannedActions13) {
        this.plannedActions13 = plannedActions13;
    }

    public String getByWhom13() {
        return byWhom13;
    }

    public void setByWhom13(String byWhom13) {
        this.byWhom13 = byWhom13;
    }

    public String getDate13() {
        return date13;
    }

    public void setDate13(String date13) {
        this.date13 = date13;
    }

    public String getReadyDate13() {
        return readyDate13;
    }

    public void setReadyDate13(String readyDate13) {
        this.readyDate13 = readyDate13;
    }

    public String getFollowUpDate13() {
        return followUpDate13;
    }

    public void setFollowUpDate13(String followUpDate13) {
        this.followUpDate13 = followUpDate13;
    }

    public String getPlannedActions14() {
        return plannedActions14;
    }

    public void setPlannedActions14(String plannedActions14) {
        this.plannedActions14 = plannedActions14;
    }

    public String getByWhom14() {
        return byWhom14;
    }

    public void setByWhom14(String byWhom14) {
        this.byWhom14 = byWhom14;
    }

    public String getDate14() {
        return date14;
    }

    public void setDate14(String date14) {
        this.date14 = date14;
    }

    public String getReadyDate14() {
        return readyDate14;
    }

    public void setReadyDate14(String readyDate14) {
        this.readyDate14 = readyDate14;
    }

    public String getFollowUpDate14() {
        return followUpDate14;
    }

    public void setFollowUpDate14(String followUpDate14) {
        this.followUpDate14 = followUpDate14;
    }

    public String getPlannedActions15() {
        return plannedActions15;
    }

    public void setPlannedActions15(String plannedActions15) {
        this.plannedActions15 = plannedActions15;
    }

    public String getByWhom15() {
        return byWhom15;
    }

    public void setByWhom15(String byWhom15) {
        this.byWhom15 = byWhom15;
    }

    public String getDate15() {
        return date15;
    }

    public void setDate15(String date15) {
        this.date15 = date15;
    }

    public String getReadyDate15() {
        return readyDate15;
    }

    public void setReadyDate15(String readyDate15) {
        this.readyDate15 = readyDate15;
    }

    public String getFollowUpDate15() {
        return followUpDate15;
    }

    public void setFollowUpDate15(String followUpDate15) {
        this.followUpDate15 = followUpDate15;
    }

    public String getPlannedActions16() {
        return plannedActions16;
    }

    public void setPlannedActions16(String plannedActions16) {
        this.plannedActions16 = plannedActions16;
    }

    public String getByWhom16() {
        return byWhom16;
    }

    public void setByWhom16(String byWhom16) {
        this.byWhom16 = byWhom16;
    }

    public String getDate16() {
        return date16;
    }

    public void setDate16(String date16) {
        this.date16 = date16;
    }

    public String getReadyDate16() {
        return readyDate16;
    }

    public void setReadyDate16(String readyDate16) {
        this.readyDate16 = readyDate16;
    }

    public String getFollowUpDate16() {
        return followUpDate16;
    }

    public void setFollowUpDate16(String followUpDate16) {
        this.followUpDate16 = followUpDate16;
    }

    public String getPlannedActions17() {
        return plannedActions17;
    }

    public void setPlannedActions17(String plannedActions17) {
        this.plannedActions17 = plannedActions17;
    }

    public String getByWhom17() {
        return byWhom17;
    }

    public void setByWhom17(String byWhom17) {
        this.byWhom17 = byWhom17;
    }

    public String getDate17() {
        return date17;
    }

    public void setDate17(String date17) {
        this.date17 = date17;
    }

    public String getReadyDate17() {
        return readyDate17;
    }

    public void setReadyDate17(String readyDate17) {
        this.readyDate17 = readyDate17;
    }

    public String getFollowUpDate17() {
        return followUpDate17;
    }

    public void setFollowUpDate17(String followUpDate17) {
        this.followUpDate17 = followUpDate17;
    }

    public String getPlannedActions18() {
        return plannedActions18;
    }

    public void setPlannedActions18(String plannedActions18) {
        this.plannedActions18 = plannedActions18;
    }

    public String getByWhom18() {
        return byWhom18;
    }

    public void setByWhom18(String byWhom18) {
        this.byWhom18 = byWhom18;
    }

    public String getDate18() {
        return date18;
    }

    public void setDate18(String date18) {
        this.date18 = date18;
    }

    public String getReadyDate18() {
        return readyDate18;
    }

    public void setReadyDate18(String readyDate18) {
        this.readyDate18 = readyDate18;
    }

    public String getFollowUpDate18() {
        return followUpDate18;
    }

    public void setFollowUpDate18(String followUpDate18) {
        this.followUpDate18 = followUpDate18;
    }

    public ActionPlan getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(ActionPlan actionPlan) {
        this.actionPlan = actionPlan;
    }

    @Override
    public String toString() {
        return "PostureAction{" +
                "id=" + id +
                ", plannedActions11='" + plannedActions11 + '\'' +
                ", byWhom11='" + byWhom11 + '\'' +
                ", date11='" + date11 + '\'' +
                ", readyDate11='" + readyDate11 + '\'' +
                ", followUpDate11='" + followUpDate11 + '\'' +
                ", plannedActions12='" + plannedActions12 + '\'' +
                ", byWhom12='" + byWhom12 + '\'' +
                ", date12='" + date12 + '\'' +
                ", readyDate12='" + readyDate12 + '\'' +
                ", followUpDate12='" + followUpDate12 + '\'' +
                ", plannedActions13='" + plannedActions13 + '\'' +
                ", byWhom13='" + byWhom13 + '\'' +
                ", date13='" + date13 + '\'' +
                ", readyDate13='" + readyDate13 + '\'' +
                ", followUpDate13='" + followUpDate13 + '\'' +
                ", plannedActions14='" + plannedActions14 + '\'' +
                ", byWhom14='" + byWhom14 + '\'' +
                ", date14='" + date14 + '\'' +
                ", readyDate14='" + readyDate14 + '\'' +
                ", followUpDate14='" + followUpDate14 + '\'' +
                ", plannedActions15='" + plannedActions15 + '\'' +
                ", byWhom15='" + byWhom15 + '\'' +
                ", date15='" + date15 + '\'' +
                ", readyDate15='" + readyDate15 + '\'' +
                ", followUpDate15='" + followUpDate15 + '\'' +
                ", plannedActions16='" + plannedActions16 + '\'' +
                ", byWhom16='" + byWhom16 + '\'' +
                ", date16='" + date16 + '\'' +
                ", readyDate16='" + readyDate16 + '\'' +
                ", followUpDate16='" + followUpDate16 + '\'' +
                ", plannedActions17='" + plannedActions17 + '\'' +
                ", byWhom17='" + byWhom17 + '\'' +
                ", date17='" + date17 + '\'' +
                ", readyDate17='" + readyDate17 + '\'' +
                ", followUpDate17='" + followUpDate17 + '\'' +
                ", plannedActions18='" + plannedActions18 + '\'' +
                ", byWhom18='" + byWhom18 + '\'' +
                ", date18='" + date18 + '\'' +
                ", readyDate18='" + readyDate18 + '\'' +
                ", followUpDate18='" + followUpDate18 + '\'' +
                '}';
    }
}
