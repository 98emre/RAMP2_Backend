package com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Entity
@Table(name="influencingfactorsaction")
@JsonIdentityInfo(scope = InfluencingFactorsActions.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class InfluencingFactorsActions {

    private final int SIZE = 65;
    private final int SIZE_DATE = 10;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "plannedactions51a", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions51a;

    @Column(name = "bywhom51a", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom51a;

    @Column(name = "date51a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date51a;

    @Column(name = "readydate51a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate51a;

    @Column(name = "followupdate51a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate51a;

    @Column(name = "plannedactions51b", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions51b;

    @Column(name = "bywhom51b", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom51b;

    @Column(name = "date51b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date51b;

    @Column(name = "readydate51b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate51b;

    @Column(name = "followupdate51b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate51b;

    @Column(name = "plannedactions51c", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions51c;

    @Column(name = "bywhom51c", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom51c;

    @Column(name = "date51c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date51c;

    @Column(name = "readydate51c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate51c;

    @Column(name = "followupdate51c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate51c;

    @Column(name = "plannedactions51d", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions51d;

    @Column(name = "bywhom51d", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom51d;

    @Column(name = "date51d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date51d;

    @Column(name = "readydate51d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate51d;

    @Column(name = "followupdate51d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate51d;

    @Column(name = "plannedactions51e", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions51e;

    @Column(name = "bywhom51e", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom51e;

    @Column(name = "date51e", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date51e;

    @Column(name = "readydate51e", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate51e;

    @Column(name = "followupdate51e", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate51e;

    @Column(name = "plannedactions51f", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions51f;

    @Column(name = "bywhom51f", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom51f;

    @Column(name = "date51f", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date51f;

    @Column(name = "readydate51f", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate51f;

    @Column(name = "followupdate51f", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate51f;

    @Column(name = "plannedactions52a", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions52a;

    @Column(name = "bywhom52a", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom52a;

    @Column(name = "date52a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date52a;

    @Column(name = "readydate52a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate52a;

    @Column(name = "followupdate52a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate52a;

    @Column(name = "plannedactions52b", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions52b;

    @Column(name = "bywhom52b", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom52b;

    @Column(name = "date52b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date52b;

    @Column(name = "readydate52b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate52b;

    @Column(name = "followupdate52b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate52b;

    @Column(name = "plannedactions52c", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions52c;

    @Column(name = "bywhom52c", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom52c;

    @Column(name = "date52c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date52c;

    @Column(name = "readydate52c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate52c;

    @Column(name = "followupdate52c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate52c;

    @Column(name = "plannedactions52d", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions52d;

    @Column(name = "bywhom52d", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom52d;

    @Column(name = "date52d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date52d;

    @Column(name = "readydate52d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate52d;

    @Column(name = "followupdate52d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate52d;

    @Column(name = "plannedactions52e", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions52e;

    @Column(name = "bywhom52e", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom52e;

    @Column(name = "date52e", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date52e;

    @Column(name = "readydate52e", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate52e;

    @Column(name = "followupdate52e", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate52e;

    @Column(name = "plannedactions52f", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions52f;

    @Column(name = "bywhom52f", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom52f;

    @Column(name = "date52f", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date52f;

    @Column(name = "readydate52f", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate52f;

    @Column(name = "followupdate52f", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate52f;

    @Column(name = "plannedactions52g", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions52g;

    @Column(name = "bywhom52g", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom52g;

    @Column(name = "date52g", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date52g;

    @Column(name = "readydate52g", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate52g;

    @Column(name = "followupdate52g", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate52g;

    @Column(name = "plannedactions52h", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions52h;

    @Column(name = "bywhom52h", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom52h;

    @Column(name = "date52h", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date52h;

    @Column(name = "readydate52h", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate52h;

    @Column(name = "followupdate52h", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate52h;

    @Column(name = "plannedactions53a", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions53a;

    @Column(name = "bywhom53a", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom53a;

    @Column(name = "date53a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date53a;

    @Column(name = "readydate53a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate53a;

    @Column(name = "followupdate53a", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate53a;

    @Column(name = "plannedactions53b", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions53b;

    @Column(name = "bywhom53b", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom53b;

    @Column(name = "date53b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date53b;

    @Column(name = "readydate53b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate53b;

    @Column(name = "followupdate53b", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate53b;

    @Column(name = "plannedactions53c", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions53c;

    @Column(name = "bywhom53c", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom53c;

    @Column(name = "date53c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date53c;

    @Column(name = "readydate53c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate53c;

    @Column(name = "followupdate53c", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate53c;

    @Column(name = "plannedactions53d", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String plannedActions53d;

    @Column(name = "bywhom53d", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "SIZE Is Max")
    private String byWhom53d;

    @Column(name = "date53d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String date53d;

    @Column(name = "readydate53d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String readyDate53d;

    @Column(name = "followupdate53d", nullable = true, length = SIZE_DATE)
    @Size(max = SIZE_DATE, message = "SIZE_DATE Is Max")
    private String followUpDate53d;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "influencingFactorsActions")
    @JsonIgnore
    private ActionPlan actionPlan;

    public InfluencingFactorsActions(String plannedActions51a, String byWhom51a, String date51a, String readyDate51a, String followUpDate51a,
                                     String plannedActions51b, String byWhom51b, String date51b, String readyDate51b, String followUpDate51b,
                                     String plannedActions51c, String byWhom51c, String date51c, String readyDate51c, String followUpDate51c,
                                     String plannedActions51d, String byWhom51d, String date51d, String readyDate51d, String followUpDate51d,
                                     String plannedActions51e, String byWhom51e, String date51e, String readyDate51e, String followUpDate51e,
                                     String plannedActions51f, String byWhom51f, String date51f, String readyDate51f, String followUpDate51f,
                                     String plannedActions52a, String byWhom52a, String date52a, String readyDate52a, String followUpDate52a,
                                     String plannedActions52b, String byWhom52b, String date52b, String readyDate52b, String followUpDate52b,
                                     String plannedActions52c, String byWhom52c, String date52c, String readyDate52c, String followUpDate52c,
                                     String plannedActions52d, String byWhom52d, String date52d, String readyDate52d, String followUpDate52d,
                                     String plannedActions52e, String byWhom52e, String date52e, String readyDate52e, String followUpDate52e,
                                     String plannedActions52f, String byWhom52f, String date52f, String readyDate52f, String followUpDate52f,
                                     String plannedActions52g, String byWhom52g, String date52g, String readyDate52g, String followUpDate52g,
                                     String plannedActions52h, String byWhom52h, String date52h, String readyDate52h, String followUpDate52h,
                                     String plannedActions53a, String byWhom53a, String date53a, String readyDate53a, String followUpDate53a,
                                     String plannedActions53b, String byWhom53b, String date53b, String readyDate53b, String followUpDate53b,
                                     String plannedActions53c, String byWhom53c, String date53c, String readyDate53c, String followUpDate53c,
                                     String plannedActions53d, String byWhom53d, String date53d, String readyDate53d, String followUpDate53d) {
        this.plannedActions51a = plannedActions51a;
        this.byWhom51a = byWhom51a;
        this.date51a = date51a;
        this.readyDate51a = readyDate51a;
        this.followUpDate51a = followUpDate51a;
        this.plannedActions51b = plannedActions51b;
        this.byWhom51b = byWhom51b;
        this.date51b = date51b;
        this.readyDate51b = readyDate51b;
        this.followUpDate51b = followUpDate51b;
        this.plannedActions51c = plannedActions51c;
        this.byWhom51c = byWhom51c;
        this.date51c = date51c;
        this.readyDate51c = readyDate51c;
        this.followUpDate51c = followUpDate51c;
        this.plannedActions51d = plannedActions51d;
        this.byWhom51d = byWhom51d;
        this.date51d = date51d;
        this.readyDate51d = readyDate51d;
        this.followUpDate51d = followUpDate51d;
        this.plannedActions51e = plannedActions51e;
        this.byWhom51e = byWhom51e;
        this.date51e = date51e;
        this.readyDate51e = readyDate51e;
        this.followUpDate51e = followUpDate51e;
        this.plannedActions51f = plannedActions51f;
        this.byWhom51f = byWhom51f;
        this.date51f = date51f;
        this.readyDate51f = readyDate51f;
        this.followUpDate51f = followUpDate51f;
        this.plannedActions52a = plannedActions52a;
        this.byWhom52a = byWhom52a;
        this.date52a = date52a;
        this.readyDate52a = readyDate52a;
        this.followUpDate52a = followUpDate52a;
        this.plannedActions52b = plannedActions52b;
        this.byWhom52b = byWhom52b;
        this.date52b = date52b;
        this.readyDate52b = readyDate52b;
        this.followUpDate52b = followUpDate52b;
        this.plannedActions52c = plannedActions52c;
        this.byWhom52c = byWhom52c;
        this.date52c = date52c;
        this.readyDate52c = readyDate52c;
        this.followUpDate52c = followUpDate52c;
        this.plannedActions52d = plannedActions52d;
        this.byWhom52d = byWhom52d;
        this.date52d = date52d;
        this.readyDate52d = readyDate52d;
        this.followUpDate52d = followUpDate52d;
        this.plannedActions52e = plannedActions52e;
        this.byWhom52e = byWhom52e;
        this.date52e = date52e;
        this.readyDate52e = readyDate52e;
        this.followUpDate52e = followUpDate52e;
        this.plannedActions52f = plannedActions52f;
        this.byWhom52f = byWhom52f;
        this.date52f = date52f;
        this.readyDate52f = readyDate52f;
        this.followUpDate52f = followUpDate52f;
        this.plannedActions52g = plannedActions52g;
        this.byWhom52g = byWhom52g;
        this.date52g = date52g;
        this.readyDate52g = readyDate52g;
        this.followUpDate52g = followUpDate52g;
        this.plannedActions52h = plannedActions52h;
        this.byWhom52h = byWhom52h;
        this.date52h = date52h;
        this.readyDate52h = readyDate52h;
        this.followUpDate52h = followUpDate52h;
        this.plannedActions53a = plannedActions53a;
        this.byWhom53a = byWhom53a;
        this.date53a = date53a;
        this.readyDate53a = readyDate53a;
        this.followUpDate53a = followUpDate53a;
        this.plannedActions53b = plannedActions53b;
        this.byWhom53b = byWhom53b;
        this.date53b = date53b;
        this.readyDate53b = readyDate53b;
        this.followUpDate53b = followUpDate53b;
        this.plannedActions53c = plannedActions53c;
        this.byWhom53c = byWhom53c;
        this.date53c = date53c;
        this.readyDate53c = readyDate53c;
        this.followUpDate53c = followUpDate53c;
        this.plannedActions53d = plannedActions53d;
        this.byWhom53d = byWhom53d;
        this.date53d = date53d;
        this.readyDate53d = readyDate53d;
        this.followUpDate53d = followUpDate53d;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlannedActions51a() {
        return plannedActions51a;
    }

    public void setPlannedActions51a(String plannedActions51a) {
        this.plannedActions51a = plannedActions51a;
    }

    public String getByWhom51a() {
        return byWhom51a;
    }

    public void setByWhom51a(String byWhom51a) {
        this.byWhom51a = byWhom51a;
    }

    public String getDate51a() {
        return date51a;
    }

    public void setDate51a(String date51a) {
        this.date51a = date51a;
    }

    public String getReadyDate51a() {
        return readyDate51a;
    }

    public void setReadyDate51a(String readyDate51a) {
        this.readyDate51a = readyDate51a;
    }

    public String getFollowUpDate51a() {
        return followUpDate51a;
    }

    public void setFollowUpDate51a(String followUpDate51a) {
        this.followUpDate51a = followUpDate51a;
    }

    public String getPlannedActions51b() {
        return plannedActions51b;
    }

    public void setPlannedActions51b(String plannedActions51b) {
        this.plannedActions51b = plannedActions51b;
    }

    public String getByWhom51b() {
        return byWhom51b;
    }

    public void setByWhom51b(String byWhom51b) {
        this.byWhom51b = byWhom51b;
    }

    public String getDate51b() {
        return date51b;
    }

    public void setDate51b(String date51b) {
        this.date51b = date51b;
    }

    public String getReadyDate51b() {
        return readyDate51b;
    }

    public void setReadyDate51b(String readyDate51b) {
        this.readyDate51b = readyDate51b;
    }

    public String getFollowUpDate51b() {
        return followUpDate51b;
    }

    public void setFollowUpDate51b(String followUpDate51b) {
        this.followUpDate51b = followUpDate51b;
    }

    public String getPlannedActions51c() {
        return plannedActions51c;
    }

    public void setPlannedActions51c(String plannedActions51c) {
        this.plannedActions51c = plannedActions51c;
    }

    public String getByWhom51c() {
        return byWhom51c;
    }

    public void setByWhom51c(String byWhom51c) {
        this.byWhom51c = byWhom51c;
    }

    public String getDate51c() {
        return date51c;
    }

    public void setDate51c(String date51c) {
        this.date51c = date51c;
    }

    public String getReadyDate51c() {
        return readyDate51c;
    }

    public void setReadyDate51c(String readyDate51c) {
        this.readyDate51c = readyDate51c;
    }

    public String getFollowUpDate51c() {
        return followUpDate51c;
    }

    public void setFollowUpDate51c(String followUpDate51c) {
        this.followUpDate51c = followUpDate51c;
    }

    public String getPlannedActions51d() {
        return plannedActions51d;
    }

    public void setPlannedActions51d(String plannedActions51d) {
        this.plannedActions51d = plannedActions51d;
    }

    public String getByWhom51d() {
        return byWhom51d;
    }

    public void setByWhom51d(String byWhom51d) {
        this.byWhom51d = byWhom51d;
    }

    public String getDate51d() {
        return date51d;
    }

    public void setDate51d(String date51d) {
        this.date51d = date51d;
    }

    public String getReadyDate51d() {
        return readyDate51d;
    }

    public void setReadyDate51d(String readyDate51d) {
        this.readyDate51d = readyDate51d;
    }

    public String getFollowUpDate51d() {
        return followUpDate51d;
    }

    public void setFollowUpDate51d(String followUpDate51d) {
        this.followUpDate51d = followUpDate51d;
    }

    public String getPlannedActions51e() {
        return plannedActions51e;
    }

    public void setPlannedActions51e(String plannedActions51e) {
        this.plannedActions51e = plannedActions51e;
    }

    public String getByWhom51e() {
        return byWhom51e;
    }

    public void setByWhom51e(String byWhom51e) {
        this.byWhom51e = byWhom51e;
    }

    public String getDate51e() {
        return date51e;
    }

    public void setDate51e(String date51e) {
        this.date51e = date51e;
    }

    public String getReadyDate51e() {
        return readyDate51e;
    }

    public void setReadyDate51e(String readyDate51e) {
        this.readyDate51e = readyDate51e;
    }

    public String getFollowUpDate51e() {
        return followUpDate51e;
    }

    public void setFollowUpDate51e(String followUpDate51e) {
        this.followUpDate51e = followUpDate51e;
    }

    public String getPlannedActions51f() {
        return plannedActions51f;
    }

    public void setPlannedActions51f(String plannedActions51f) {
        this.plannedActions51f = plannedActions51f;
    }

    public String getByWhom51f() {
        return byWhom51f;
    }

    public void setByWhom51f(String byWhom51f) {
        this.byWhom51f = byWhom51f;
    }

    public String getDate51f() {
        return date51f;
    }

    public void setDate51f(String date51f) {
        this.date51f = date51f;
    }

    public String getReadyDate51f() {
        return readyDate51f;
    }

    public void setReadyDate51f(String readyDate51f) {
        this.readyDate51f = readyDate51f;
    }

    public String getFollowUpDate51f() {
        return followUpDate51f;
    }

    public void setFollowUpDate51f(String followUpDate51f) {
        this.followUpDate51f = followUpDate51f;
    }

    public String getPlannedActions52a() {
        return plannedActions52a;
    }

    public void setPlannedActions52a(String plannedActions52a) {
        this.plannedActions52a = plannedActions52a;
    }

    public String getByWhom52a() {
        return byWhom52a;
    }

    public void setByWhom52a(String byWhom52a) {
        this.byWhom52a = byWhom52a;
    }

    public String getDate52a() {
        return date52a;
    }

    public void setDate52a(String date52a) {
        this.date52a = date52a;
    }

    public String getReadyDate52a() {
        return readyDate52a;
    }

    public void setReadyDate52a(String readyDate52a) {
        this.readyDate52a = readyDate52a;
    }

    public String getFollowUpDate52a() {
        return followUpDate52a;
    }

    public void setFollowUpDate52a(String followUpDate52a) {
        this.followUpDate52a = followUpDate52a;
    }

    public String getPlannedActions52b() {
        return plannedActions52b;
    }

    public void setPlannedActions52b(String plannedActions52b) {
        this.plannedActions52b = plannedActions52b;
    }

    public String getByWhom52b() {
        return byWhom52b;
    }

    public void setByWhom52b(String byWhom52b) {
        this.byWhom52b = byWhom52b;
    }

    public String getDate52b() {
        return date52b;
    }

    public void setDate52b(String date52b) {
        this.date52b = date52b;
    }

    public String getReadyDate52b() {
        return readyDate52b;
    }

    public void setReadyDate52b(String readyDate52b) {
        this.readyDate52b = readyDate52b;
    }

    public String getFollowUpDate52b() {
        return followUpDate52b;
    }

    public void setFollowUpDate52b(String followUpDate52b) {
        this.followUpDate52b = followUpDate52b;
    }

    public String getPlannedActions52c() {
        return plannedActions52c;
    }

    public void setPlannedActions52c(String plannedActions52c) {
        this.plannedActions52c = plannedActions52c;
    }

    public String getByWhom52c() {
        return byWhom52c;
    }

    public void setByWhom52c(String byWhom52c) {
        this.byWhom52c = byWhom52c;
    }

    public String getDate52c() {
        return date52c;
    }

    public void setDate52c(String date52c) {
        this.date52c = date52c;
    }

    public String getReadyDate52c() {
        return readyDate52c;
    }

    public void setReadyDate52c(String readyDate52c) {
        this.readyDate52c = readyDate52c;
    }

    public String getFollowUpDate52c() {
        return followUpDate52c;
    }

    public void setFollowUpDate52c(String followUpDate52c) {
        this.followUpDate52c = followUpDate52c;
    }

    public String getPlannedActions52d() {
        return plannedActions52d;
    }

    public void setPlannedActions52d(String plannedActions52d) {
        this.plannedActions52d = plannedActions52d;
    }

    public String getByWhom52d() {
        return byWhom52d;
    }

    public void setByWhom52d(String byWhom52d) {
        this.byWhom52d = byWhom52d;
    }

    public String getDate52d() {
        return date52d;
    }

    public void setDate52d(String date52d) {
        this.date52d = date52d;
    }

    public String getReadyDate52d() {
        return readyDate52d;
    }

    public void setReadyDate52d(String readyDate52d) {
        this.readyDate52d = readyDate52d;
    }

    public String getFollowUpDate52d() {
        return followUpDate52d;
    }

    public void setFollowUpDate52d(String followUpDate52d) {
        this.followUpDate52d = followUpDate52d;
    }

    public String getPlannedActions52e() {
        return plannedActions52e;
    }

    public void setPlannedActions52e(String plannedActions52e) {
        this.plannedActions52e = plannedActions52e;
    }

    public String getByWhom52e() {
        return byWhom52e;
    }

    public void setByWhom52e(String byWhom52e) {
        this.byWhom52e = byWhom52e;
    }

    public String getDate52e() {
        return date52e;
    }

    public void setDate52e(String date52e) {
        this.date52e = date52e;
    }

    public String getReadyDate52e() {
        return readyDate52e;
    }

    public void setReadyDate52e(String readyDate52e) {
        this.readyDate52e = readyDate52e;
    }

    public String getFollowUpDate52e() {
        return followUpDate52e;
    }

    public void setFollowUpDate52e(String followUpDate52e) {
        this.followUpDate52e = followUpDate52e;
    }

    public String getPlannedActions52f() {
        return plannedActions52f;
    }

    public void setPlannedActions52f(String plannedActions52f) {
        this.plannedActions52f = plannedActions52f;
    }

    public String getByWhom52f() {
        return byWhom52f;
    }

    public void setByWhom52f(String byWhom52f) {
        this.byWhom52f = byWhom52f;
    }

    public String getDate52f() {
        return date52f;
    }

    public void setDate52f(String date52f) {
        this.date52f = date52f;
    }

    public String getReadyDate52f() {
        return readyDate52f;
    }

    public void setReadyDate52f(String readyDate52f) {
        this.readyDate52f = readyDate52f;
    }

    public String getFollowUpDate52f() {
        return followUpDate52f;
    }

    public void setFollowUpDate52f(String followUpDate52f) {
        this.followUpDate52f = followUpDate52f;
    }

    public String getPlannedActions52g() {
        return plannedActions52g;
    }

    public void setPlannedActions52g(String plannedActions52g) {
        this.plannedActions52g = plannedActions52g;
    }

    public String getByWhom52g() {
        return byWhom52g;
    }

    public void setByWhom52g(String byWhom52g) {
        this.byWhom52g = byWhom52g;
    }

    public String getDate52g() {
        return date52g;
    }

    public void setDate52g(String date52g) {
        this.date52g = date52g;
    }

    public String getReadyDate52g() {
        return readyDate52g;
    }

    public void setReadyDate52g(String readyDate52g) {
        this.readyDate52g = readyDate52g;
    }

    public String getFollowUpDate52g() {
        return followUpDate52g;
    }

    public void setFollowUpDate52g(String followUpDate52g) {
        this.followUpDate52g = followUpDate52g;
    }

    public String getPlannedActions52h() {
        return plannedActions52h;
    }

    public void setPlannedActions52h(String plannedActions52h) {
        this.plannedActions52h = plannedActions52h;
    }

    public String getByWhom52h() {
        return byWhom52h;
    }

    public void setByWhom52h(String byWhom52h) {
        this.byWhom52h = byWhom52h;
    }

    public String getDate52h() {
        return date52h;
    }

    public void setDate52h(String date52h) {
        this.date52h = date52h;
    }

    public String getReadyDate52h() {
        return readyDate52h;
    }

    public void setReadyDate52h(String readyDate52h) {
        this.readyDate52h = readyDate52h;
    }

    public String getFollowUpDate52h() {
        return followUpDate52h;
    }

    public void setFollowUpDate52h(String followUpDate52h) {
        this.followUpDate52h = followUpDate52h;
    }

    public String getPlannedActions53a() {
        return plannedActions53a;
    }

    public void setPlannedActions53a(String plannedActions53a) {
        this.plannedActions53a = plannedActions53a;
    }

    public String getByWhom53a() {
        return byWhom53a;
    }

    public void setByWhom53a(String byWhom53a) {
        this.byWhom53a = byWhom53a;
    }

    public String getDate53a() {
        return date53a;
    }

    public void setDate53a(String date53a) {
        this.date53a = date53a;
    }

    public String getReadyDate53a() {
        return readyDate53a;
    }

    public void setReadyDate53a(String readyDate53a) {
        this.readyDate53a = readyDate53a;
    }

    public String getFollowUpDate53a() {
        return followUpDate53a;
    }

    public void setFollowUpDate53a(String followUpDate53a) {
        this.followUpDate53a = followUpDate53a;
    }

    public String getPlannedActions53b() {
        return plannedActions53b;
    }

    public void setPlannedActions53b(String plannedActions53b) {
        this.plannedActions53b = plannedActions53b;
    }

    public String getByWhom53b() {
        return byWhom53b;
    }

    public void setByWhom53b(String byWhom53b) {
        this.byWhom53b = byWhom53b;
    }

    public String getDate53b() {
        return date53b;
    }

    public void setDate53b(String date53b) {
        this.date53b = date53b;
    }

    public String getReadyDate53b() {
        return readyDate53b;
    }

    public void setReadyDate53b(String readyDate53b) {
        this.readyDate53b = readyDate53b;
    }

    public String getFollowUpDate53b() {
        return followUpDate53b;
    }

    public void setFollowUpDate53b(String followUpDate53b) {
        this.followUpDate53b = followUpDate53b;
    }

    public String getPlannedActions53c() {
        return plannedActions53c;
    }

    public void setPlannedActions53c(String plannedActions53c) {
        this.plannedActions53c = plannedActions53c;
    }

    public String getByWhom53c() {
        return byWhom53c;
    }

    public void setByWhom53c(String byWhom53c) {
        this.byWhom53c = byWhom53c;
    }

    public String getDate53c() {
        return date53c;
    }

    public void setDate53c(String date53c) {
        this.date53c = date53c;
    }

    public String getReadyDate53c() {
        return readyDate53c;
    }

    public void setReadyDate53c(String readyDate53c) {
        this.readyDate53c = readyDate53c;
    }

    public String getFollowUpDate53c() {
        return followUpDate53c;
    }

    public void setFollowUpDate53c(String followUpDate53c) {
        this.followUpDate53c = followUpDate53c;
    }

    public String getPlannedActions53d() {
        return plannedActions53d;
    }

    public void setPlannedActions53d(String plannedActions53d) {
        this.plannedActions53d = plannedActions53d;
    }

    public String getByWhom53d() {
        return byWhom53d;
    }

    public void setByWhom53d(String byWhom53d) {
        this.byWhom53d = byWhom53d;
    }

    public String getDate53d() {
        return date53d;
    }

    public void setDate53d(String date53d) {
        this.date53d = date53d;
    }

    public String getReadyDate53d() {
        return readyDate53d;
    }

    public void setReadyDate53d(String readyDate53d) {
        this.readyDate53d = readyDate53d;
    }

    public String getFollowUpDate53d() {
        return followUpDate53d;
    }

    public void setFollowUpDate53d(String followUpDate53d) {
        this.followUpDate53d = followUpDate53d;
    }

    public ActionPlan getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(ActionPlan actionPlan) {
        this.actionPlan = actionPlan;
    }

    @Override
    public String toString() {
        return "InfluencingFactorsAction{" +
                "id=" + id +
                ", plannedActions51a='" + plannedActions51a + '\'' +
                ", byWhom51a='" + byWhom51a + '\'' +
                ", date51a='" + date51a + '\'' +
                ", readyDate51a='" + readyDate51a + '\'' +
                ", followUpDate51a='" + followUpDate51a + '\'' +
                ", plannedActions51b='" + plannedActions51b + '\'' +
                ", byWhom51b='" + byWhom51b + '\'' +
                ", date51b='" + date51b + '\'' +
                ", readyDate51b='" + readyDate51b + '\'' +
                ", followUpDate51b='" + followUpDate51b + '\'' +
                ", plannedActions51c='" + plannedActions51c + '\'' +
                ", byWhom51c='" + byWhom51c + '\'' +
                ", date51c='" + date51c + '\'' +
                ", readyDate51c='" + readyDate51c + '\'' +
                ", followUpDate51c='" + followUpDate51c + '\'' +
                ", plannedActions51d='" + plannedActions51d + '\'' +
                ", byWhom51d='" + byWhom51d + '\'' +
                ", date51d='" + date51d + '\'' +
                ", readyDate51d='" + readyDate51d + '\'' +
                ", followUpDate51d='" + followUpDate51d + '\'' +
                ", plannedActions51e='" + plannedActions51e + '\'' +
                ", byWhom51e='" + byWhom51e + '\'' +
                ", date51e='" + date51e + '\'' +
                ", readyDate51e='" + readyDate51e + '\'' +
                ", followUpDate51e='" + followUpDate51e + '\'' +
                ", plannedActions51f='" + plannedActions51f + '\'' +
                ", byWhom51f='" + byWhom51f + '\'' +
                ", date51f='" + date51f + '\'' +
                ", readyDate51f='" + readyDate51f + '\'' +
                ", followUpDate51f='" + followUpDate51f + '\'' +
                ", plannedActions52a='" + plannedActions52a + '\'' +
                ", byWhom52a='" + byWhom52a + '\'' +
                ", date52a='" + date52a + '\'' +
                ", readyDate52a='" + readyDate52a + '\'' +
                ", followUpDate52a='" + followUpDate52a + '\'' +
                ", plannedActions52b='" + plannedActions52b + '\'' +
                ", byWhom52b='" + byWhom52b + '\'' +
                ", date52b='" + date52b + '\'' +
                ", readyDate52b='" + readyDate52b + '\'' +
                ", followUpDate52b='" + followUpDate52b + '\'' +
                ", plannedActions52c='" + plannedActions52c + '\'' +
                ", byWhom52c='" + byWhom52c + '\'' +
                ", date52c='" + date52c + '\'' +
                ", readyDate52c='" + readyDate52c + '\'' +
                ", followUpDate52c='" + followUpDate52c + '\'' +
                ", plannedActions52d='" + plannedActions52d + '\'' +
                ", byWhom52d='" + byWhom52d + '\'' +
                ", date52d='" + date52d + '\'' +
                ", readyDate52d='" + readyDate52d + '\'' +
                ", followUpDate52d='" + followUpDate52d + '\'' +
                ", plannedActions52e='" + plannedActions52e + '\'' +
                ", byWhom52e='" + byWhom52e + '\'' +
                ", date52e='" + date52e + '\'' +
                ", readyDate52e='" + readyDate52e + '\'' +
                ", followUpDate52e='" + followUpDate52e + '\'' +
                ", plannedActions52f='" + plannedActions52f + '\'' +
                ", byWhom52f='" + byWhom52f + '\'' +
                ", date52f='" + date52f + '\'' +
                ", readyDate52f='" + readyDate52f + '\'' +
                ", followUpDate52f='" + followUpDate52f + '\'' +
                ", plannedActions52g='" + plannedActions52g + '\'' +
                ", byWhom52g='" + byWhom52g + '\'' +
                ", date52g='" + date52g + '\'' +
                ", readyDate52g='" + readyDate52g + '\'' +
                ", followUpDate52g='" + followUpDate52g + '\'' +
                ", plannedActions52h='" + plannedActions52h + '\'' +
                ", byWhom52h='" + byWhom52h + '\'' +
                ", date52h='" + date52h + '\'' +
                ", readyDate52h='" + readyDate52h + '\'' +
                ", followUpDate52h='" + followUpDate52h + '\'' +
                ", plannedActions53a='" + plannedActions53a + '\'' +
                ", byWhom53a='" + byWhom53a + '\'' +
                ", date53a='" + date53a + '\'' +
                ", readyDate53a='" + readyDate53a + '\'' +
                ", followUpDate53a='" + followUpDate53a + '\'' +
                ", plannedActions53b='" + plannedActions53b + '\'' +
                ", byWhom53b='" + byWhom53b + '\'' +
                ", date53b='" + date53b + '\'' +
                ", readyDate53b='" + readyDate53b + '\'' +
                ", followUpDate53b='" + followUpDate53b + '\'' +
                ", plannedActions53c='" + plannedActions53c + '\'' +
                ", byWhom53c='" + byWhom53c + '\'' +
                ", date53c='" + date53c + '\'' +
                ", readyDate53c='" + readyDate53c + '\'' +
                ", followUpDate53c='" + followUpDate53c + '\'' +
                ", plannedActions53d='" + plannedActions53d + '\'' +
                ", byWhom53d='" + byWhom53d + '\'' +
                ", date53d='" + date53d + '\'' +
                ", readyDate53d='" + readyDate53d + '\'' +
                ", followUpDate53d='" + followUpDate53d + '\'' +
                '}';
    }
}
