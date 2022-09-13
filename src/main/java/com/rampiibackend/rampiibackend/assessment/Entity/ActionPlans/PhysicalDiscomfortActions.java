package com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Entity
@Table(name="physicaldiscomfortactions")
@JsonIdentityInfo(scope = PhysicalDiscomfortActions.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PhysicalDiscomfortActions {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "plannedactions71", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions71;

    @Column(name = "bywhom71", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom71;

    @Column(name = "date71", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE Is Max")
    private String date71;

    @Column(name = "readydate71", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE Is Max")
    private String readyDate71;

    @Column(name = "followupdate71", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE Is Max")
    private String followUpDate71;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "physicalDiscomfortActions")
    @JsonIgnore
    private ActionPlan actionPlan;
    public PhysicalDiscomfortActions(String plannedActions71, String byWhom71, String date71, String readyDate71, String followUpDate71) {
        this.plannedActions71 = plannedActions71;
        this.byWhom71 = byWhom71;
        this.date71 = date71;
        this.readyDate71 = readyDate71;
        this.followUpDate71 = followUpDate71;
    }

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
