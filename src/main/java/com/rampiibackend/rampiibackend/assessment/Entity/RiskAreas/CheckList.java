package com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.ActionPlan;
import com.rampiibackend.rampiibackend.assessment.Entity.Users.User;

import javax.persistence.*;

@Entity
@Table(name="checklist")
@JsonIdentityInfo(scope = CheckList.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CheckList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_name",unique = true)
    private String id_name;

    @Column(name ="completed", nullable = true)
    private boolean completed;

    @MapsId
    @JoinColumn(name = "checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private InputData inputData;

    @MapsId
    @JoinColumn(name ="checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Posture posture;

    @MapsId
    @JoinColumn(name ="checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private RepetitiveWork repetitiveWork;

    @MapsId
    @JoinColumn(name = "checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private LiftingWork liftingWork;

    @MapsId
    @JoinColumn(name = "checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private PushingAndPulling pushingAndPulling;

    @MapsId
    @JoinColumn(name ="checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private InfluencingFactors influencingFactors;

    @MapsId
    @JoinColumn(name = "checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private PhysicallyStrenuousWork physicallyStrenuousWork;

    @MapsId
    @JoinColumn(name = "checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private PhysicalDiscomfort physicalDiscomfort;

    @MapsId
    @JoinColumn(name ="checklist_fk")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private OtherComment otherComment;


    @JoinColumn(name ="userChecklists")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH, optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;


    public CheckList(String id_name, boolean completed,
                     InputData inputData, Posture posture, RepetitiveWork repetitiveWork,
                     LiftingWork liftingWork, PushingAndPulling pushingAndPulling, InfluencingFactors influencingFactors,
                     PhysicallyStrenuousWork physicallyStrenuousWork, PhysicalDiscomfort physicalDiscomfort, OtherComment otherComment, User user) {
        this.id_name = id_name;
        this.completed = completed;
        this.inputData = inputData;
        this.posture = posture;
        this.repetitiveWork = repetitiveWork;
        this.liftingWork = liftingWork;
        this.pushingAndPulling = pushingAndPulling;
        this.influencingFactors = influencingFactors;
        this.physicallyStrenuousWork = physicallyStrenuousWork;
        this.physicalDiscomfort = physicalDiscomfort;
        this.otherComment = otherComment;
        this.user = user;
    }

    public CheckList() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getId_name() {
        return id_name;
    }

    public void setId_name(String id_name) {
        this.id_name = id_name;
    }

    public InputData getInputData() {
        return inputData;
    }

    public void setInputData(InputData inputData) {
        this.inputData = inputData;
    }

    public Posture getPosture() {
        return posture;
    }

    public void setPosture(Posture posture) {
        this.posture = posture;
    }

    public RepetitiveWork getRepetitiveWork() {
        return repetitiveWork;
    }

    public void setRepetitiveWork(RepetitiveWork repetitiveWork) {
        this.repetitiveWork = repetitiveWork;
    }

    public LiftingWork getLiftingWork() {
        return liftingWork;
    }

    public void setLiftingWork(LiftingWork liftingWork) {
        this.liftingWork = liftingWork;
    }

    public PushingAndPulling getPushingAndPulling() {
        return pushingAndPulling;
    }

    public void setPushingAndPulling(PushingAndPulling pushingAndPulling) {
        this.pushingAndPulling = pushingAndPulling;
    }

    public InfluencingFactors getInfluencingFactors() {
        return influencingFactors;
    }

    public void setInfluencingFactors(InfluencingFactors influencingFactors) {
        this.influencingFactors = influencingFactors;
    }

    public PhysicallyStrenuousWork getPhysicallyStrenuousWork() {
        return physicallyStrenuousWork;
    }

    public void setPhysicallyStrenuousWork(PhysicallyStrenuousWork physicallyStrenuousWork) {
        this.physicallyStrenuousWork = physicallyStrenuousWork;
    }

    public PhysicalDiscomfort getPhysicalDiscomfort() {
        return physicalDiscomfort;
    }

    public void setPhysicalDiscomfort(PhysicalDiscomfort physicalDiscomfort) {
        this.physicalDiscomfort = physicalDiscomfort;
    }

    public OtherComment getOtherComment() {
        return otherComment;
    }

    public void setOtherComment(OtherComment otherComment) {
        this.otherComment = otherComment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CheckList{" +
                "id=" + id +
                ", id_name='" + id_name + '\'' +
                ", completed=" + completed +
                ", inputData=" + inputData +
                ", posture=" + posture +
                ", repetitiveWork=" + repetitiveWork +
                ", liftingWork=" + liftingWork +
                ", pushingAndPulling=" + pushingAndPulling +
                ", influencingFactors=" + influencingFactors +
                ", physicallyStrenuousWork=" + physicallyStrenuousWork +
                ", physicalDiscomfort=" + physicalDiscomfort +
                ", otherComment=" + otherComment +
                '}';
    }
}
