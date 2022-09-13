package com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Entity
@Table(name="physicallystrenuousworkactions")
@JsonIdentityInfo(scope = PhysicallyStrenuousWorkActions.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PhysicallyStrenuousWorkActions {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "plannedactions61", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions61;

    @Column(name = "bywhom61", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom61;

    @Column(name = "date61", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE Is Max")
    private String date61;

    @Column(name = "readydate61", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE Is Max")
    private String readyDate61;

    @Column(name = "followupdate61", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE Is Max")
    private String followUpDate61;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "physicallyStrenuousWorkActions")
    @JsonIgnore
    private ActionPlan actionPlan;
    public PhysicallyStrenuousWorkActions(String plannedActions61, String byWhom61, String date61, String readyDate61, String followUpDate61) {
        this.plannedActions61 = plannedActions61;
        this.byWhom61 = byWhom61;
        this.date61 = date61;
        this.readyDate61 = readyDate61;
        this.followUpDate61 = followUpDate61;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlannedActions61() {
        return plannedActions61;
    }

    public void setPlannedActions61(String plannedActions61) {
        this.plannedActions61 = plannedActions61;
    }

    public String getByWhom61() {
        return byWhom61;
    }

    public void setByWhom61(String byWhom61) {
        this.byWhom61 = byWhom61;
    }

    public String getDate61() {
        return date61;
    }

    public void setDate61(String date61) {
        this.date61 = date61;
    }

    public String getReadyDate61() {
        return readyDate61;
    }

    public void setReadyDate61(String readyDate61) {
        this.readyDate61 = readyDate61;
    }

    public String getFollowUpDate61() {
        return followUpDate61;
    }

    public void setFollowUpDate61(String followUpDate61) {
        this.followUpDate61 = followUpDate61;
    }

    public ActionPlan getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(ActionPlan actionPlan) {
        this.actionPlan = actionPlan;
    }

    @Override
    public String toString() {
        return "PhysicallyStrenuousWorkActions{" +
                "id=" + id +
                ", plannedActions61='" + plannedActions61 + '\'' +
                ", byWhom61='" + byWhom61 + '\'' +
                ", date61='" + date61 + '\'' +
                ", readyDate61='" + readyDate61 + '\'' +
                ", followUpDate61='" + followUpDate61 + '\'' +
                '}';
    }
}
