package com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList;
import com.rampiibackend.rampiibackend.assessment.Entity.Users.User;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Entity
@Table(name="actionplan")
@JsonIdentityInfo(scope = ActionPlan.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class ActionPlan {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;
    private final int SIZE_NOTE = 200;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name = "id_name", unique = true)
    private String id_name;

    @Column(name = "orderby",nullable = true, length = SIZE)
    @Size(max = SIZE,message = "SIZE is Max")
    private String orderBy;

    @Column(name = "formedby",nullable = true, length = SIZE)
    @Size(max = SIZE,message = "SIZE is Max")
    private String formedBy;

    @Column(name = "date",nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE Date is Max")
    private String date;

    @Column(name = "note",nullable = true, length = SIZE_NOTE)
    @Size(max = SIZE_NOTE, message = "SIZE NOTE Is Max")
    private String note;

    @MapsId
    @JoinColumn(name = "actionplan_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private PostureActions postureActions;

    @MapsId
    @JoinColumn(name = "actionplan_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private RepetitiveWorkActions repetitiveWorkActions;

    @MapsId
    @JoinColumn(name = "actionplan_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private LiftingWorkActions liftingWorkActions;

    @MapsId
    @JoinColumn(name = "actionplan_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private PushingAndPullingActions pushingAndPullingActions;

    @MapsId
    @JoinColumn(name = "actionplan_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private InfluencingFactorsActions influencingFactorsActions;

    @MapsId
    @JoinColumn(name = "actionplan_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private PhysicallyStrenuousWorkActions physicallyStrenuousWorkActions;

    @MapsId
    @JoinColumn(name = "actionplan_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private PhysicalDiscomfortActions physicalDiscomfortActions;


    @JoinColumn(name = "checklist_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private CheckList checkList;

    @JoinColumn(name ="userActionplans")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

    public ActionPlan(
                      String id_name,
                      String orderBy, String formedBy, String date, String note,
                      PostureActions postureActions, RepetitiveWorkActions repetitiveWorkActions,
                      LiftingWorkActions liftingWorkActions, PushingAndPullingActions pushingAndPullingActions,
                      InfluencingFactorsActions influencingFactorsActions, PhysicallyStrenuousWorkActions
                      physicallyStrenuousWorkActions, PhysicalDiscomfortActions physicalDiscomfortActions, CheckList checkList, User user) {
        this.id_name = id_name;
        this.orderBy = orderBy;
        this.formedBy = formedBy;
        this.date = date;
        this.note = note;
        this.postureActions = postureActions;
        this.repetitiveWorkActions = repetitiveWorkActions;
        this.liftingWorkActions = liftingWorkActions;
        this.pushingAndPullingActions = pushingAndPullingActions;
        this.influencingFactorsActions = influencingFactorsActions;
        this.physicallyStrenuousWorkActions = physicallyStrenuousWorkActions;
        this.physicalDiscomfortActions = physicalDiscomfortActions;
        this.checkList = checkList;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_name() {
        return id_name;
    }

    public void setId_name(String id_name) {
        this.id_name = id_name;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getFormedBy() {
        return formedBy;
    }

    public void setFormedBy(String formedBy) {
        this.formedBy = formedBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public PostureActions getPostureActions() {
        return postureActions;
    }

    public void setPostureActions(PostureActions postureActions) {
        this.postureActions = postureActions;
    }

    public RepetitiveWorkActions getRepetitiveWorkActions() {
        return repetitiveWorkActions;
    }

    public void setRepetitiveWorkActions(RepetitiveWorkActions repetitiveWorkActions) {
        this.repetitiveWorkActions = repetitiveWorkActions;
    }

    public LiftingWorkActions getLiftingWorkActions() {
        return liftingWorkActions;
    }

    public void setLiftingWorkActions(LiftingWorkActions liftingWorkActions) {
        this.liftingWorkActions = liftingWorkActions;
    }

    public PushingAndPullingActions getPushingAndPullingActions() {
        return pushingAndPullingActions;
    }

    public void setPushingAndPullingActions(PushingAndPullingActions pushingAndPullingActions) {
        this.pushingAndPullingActions = pushingAndPullingActions;
    }

    public InfluencingFactorsActions getInfluencingFactorsActions() {
        return influencingFactorsActions;
    }

    public void setInfluencingFactorsActions(InfluencingFactorsActions influencingFactorsActions) {
        this.influencingFactorsActions = influencingFactorsActions;
    }

    public PhysicallyStrenuousWorkActions getPhysicallyStrenuousWorkActions() {
        return physicallyStrenuousWorkActions;
    }

    public void setPhysicallyStrenuousWorkActions(PhysicallyStrenuousWorkActions physicallyStrenuousWorkActions) {
        this.physicallyStrenuousWorkActions = physicallyStrenuousWorkActions;
    }

    public PhysicalDiscomfortActions getPhysicalDiscomfortActions() {
        return physicalDiscomfortActions;
    }

    public void setPhysicalDiscomfortActions(PhysicalDiscomfortActions physicalDiscomfortActions) {
        this.physicalDiscomfortActions = physicalDiscomfortActions;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ActionPlan{" +
                "id=" + id +
                ", id_name='" + id_name + '\'' +
                ", orderBy='" + orderBy + '\'' +
                ", formedBy='" + formedBy + '\'' +
                ", date='" + date + '\'' +
                ", note='" + note + '\'' +
                ", postureActions=" + postureActions +
                ", repetitiveWorkActions=" + repetitiveWorkActions +
                ", liftingWorkActions=" + liftingWorkActions +
                ", pushingAndPullingActions=" + pushingAndPullingActions +
                ", influencingFactorsActions=" + influencingFactorsActions +
                ", physicallyStrenuousWorkActions=" + physicallyStrenuousWorkActions +
                ", physicalDiscomfortActions=" + physicalDiscomfortActions +
                ", checkList=" + checkList +
                ", user=" + user +
                '}';
    }
}
