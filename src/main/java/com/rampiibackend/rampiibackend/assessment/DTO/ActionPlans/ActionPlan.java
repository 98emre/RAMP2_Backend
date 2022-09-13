package com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas.CheckList;
import com.rampiibackend.rampiibackend.assessment.DTO.User.User;
import lombok.Data;
import javax.validation.constraints.*;


@Data
@JsonIdentityInfo(scope = ActionPlan.class, generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class ActionPlan {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    private Long id;

    private String id_name;

    @Size(max = SIZE,message = "SIZE is Max")
    private String orderBy;

    @Size(max = SIZE,message = "SIZE is Max")
    private String formedBy;

    @Size(max = SIZE_DATE,message = "SIZE Date is Max")
    private String date;

    @Size(max = SIZE,message = "SIZE is Max")
    private String note;
    private PostureActions postureActions;

    private RepetitiveWorkActions repetitiveWorkActions;

    private LiftingWorkActions liftingWorkActions;

    private PushingAndPullingActions pushingAndPullingActions;

    private InfluencingFactorsActions influencingFactorsActions;

    private PhysicallyStrenuousWorkActions physicallyStrenuousWorkActions;

    private PhysicalDiscomfortActions physicalDiscomfortActions;

    private User user;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CheckList checkList;

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
                '}';
    }
}
