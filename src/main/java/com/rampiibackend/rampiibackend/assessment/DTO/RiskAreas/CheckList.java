package com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans.ActionPlan;
import com.rampiibackend.rampiibackend.assessment.DTO.User.User;
import lombok.Data;

@Data
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CheckList {

    private Long id;
    private String id_name;

    private boolean completed;
    private InputData inputData;
    private Posture posture;
    private RepetitiveWork repetitiveWork;
    private LiftingWork liftingWork;
    private PushingAndPulling pushingAndPulling;
    private InfluencingFactors influencingFactors;
    private PhysicallyStrenuousWork physicallyStrenuousWork;
    private PhysicalDiscomfort physicalDiscomfort;
    private OtherComment otherComment;
    private User user;

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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
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
                ", user=" + user +
                '}';
    }
}
