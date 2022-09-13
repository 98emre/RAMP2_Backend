package com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Entity
@Table(name="liftingworkactions")
@JsonIdentityInfo(scope = LiftingWorkActions.class, generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class LiftingWorkActions {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "plannedactions31", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Size Is Max")
    private String plannedActions31;

    @Column(name = "bywhom31", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Size Is Max")
    private String byWhom31;

    @Column(name = "date31", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "Size Is Max")
    private String date31;

    @Column(name = "readydate31", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "Size Is Max")
    private String readyDate31;

    @Column(name = "followupdate31", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "Size Is Max")
    private String followUpDate31;

    @Column(name = "plannedactions32", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Size Is Max")
    private String plannedActions32;

    @Column(name = "bywhom32", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Size Is Max")
    private String byWhom32;

    @Column(name = "date32", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "Size Is Max")
    private String date32;

    @Column(name = "readydate32", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "Size Is Max")
    private String readyDate32;

    @Column(name = "followupdate32", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "Size Is Max")
    private String followUpDate32;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "liftingWorkActions")
    @JsonIgnore
    private ActionPlan actionPlan;

    public LiftingWorkActions(String plannedActions31, String byWhom31, String date31, String readyDate31, String followUpDate31,
                              String plannedActions32, String byWhom32, String date32, String readyDate32, String followUpDate32) {
        this.plannedActions31 = plannedActions31;
        this.byWhom31 = byWhom31;
        this.date31 = date31;
        this.readyDate31 = readyDate31;
        this.followUpDate31 = followUpDate31;
        this.plannedActions32 = plannedActions32;
        this.byWhom32 = byWhom32;
        this.date32 = date32;
        this.readyDate32 = readyDate32;
        this.followUpDate32 = followUpDate32;
    }

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
