package com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Entity
@Table(name ="inputdata")
@JsonIdentityInfo(scope = InputData.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class InputData {

    @JsonIgnore
    private final int SIZE = 65;
    @JsonIgnore
    private final int SIZE_DATE = 10;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="date",nullable = true,length = SIZE_DATE)
    private String date;

    @Column(name ="assessment_of",nullable = true, length = SIZE)
    //@NotNull(message = "Assessment Of Is Null")
    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentOf;

    @Column(name ="work_task",nullable = true,length = SIZE)
    //@NotNull(message = "Work Task Is Null")
    @Size(max = SIZE, message = "Text Field Max 65")
    private String workTask;

    @Column(name = "station",nullable = true,length = SIZE)
    //@NotNull(message = "Station Is Null")
    @Size(max = SIZE, message = "Text Field Max 65")
    private String station;

    @Column(name = "department",nullable = true,length = SIZE)
    //@NotNull(message = "Department Is Null")
    @Size(max = SIZE, message = "Text Field Max 65")
    private String department;

    @Column(name ="site",nullable = true,length = SIZE)
    //@NotNull(message = "Site Is Null")
    @Size(max = SIZE, message = "Text Field Max 65")
    private String site;

    @Column(name = "country",nullable = true,length = SIZE)
    //@NotNull(message = "Country Is Null")
    @Size(max = SIZE, message = "Text Field Max 65")
    private String country;

    @Column(name = "assessment_order_by",nullable = true,length = SIZE)
    //@NotNull(message = "Assessment Order By Is Null")
    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentOrderBy;

    @Column(name = "assessment_order_by_position",nullable = true,length = SIZE)
    //@NotNull(message = "Assessment Order By Position By Is Null")
    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentOrderByPosition;

    @Column(name = "assessment_completed_by",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentCompletedBy;

    @Column(name = "assessment_completed_by_position",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentCompletedByPosition;

    @Column(name = "company_representatitve",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String companyRepresentatitve;

    @Column(name = "company_representatitve_position",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String companyRepresentatitvePosition;

    @Column(name = "safety_work",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String safetyWork;

    @Column(name = "safety_work_position",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String safetyWorkPosition;

    @Column(name = "other",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String other;

    @Column(name = "other_position",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String otherPosition;

    @Column(name = "other_information",nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Text Field Max 65")
    private String otherInformation;

    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="inputData")
    @JsonIgnore
    private CheckList checkList;

    public InputData(String date, String assessmentOf, String workTask,
                     String station, String department, String site,
                     String country, String assessmentOrderBy, String assessmentOrderByPosition,
                     String assessmentCompletedBy, String assessmentCompletedByPosition, String companyRepresentatitve,
                     String companyRepresentatitvePosition, String safetyWork, String safetyWorkPosition,
                     String other, String otherPosition, String otherInformation) {
        this.date = date;
        this.assessmentOf = assessmentOf;
        this.workTask = workTask;
        this.station = station;
        this.department = department;
        this.site = site;
        this.country = country;
        this.assessmentOrderBy = assessmentOrderBy;
        this.assessmentOrderByPosition = assessmentOrderByPosition;
        this.assessmentCompletedBy = assessmentCompletedBy;
        this.assessmentCompletedByPosition = assessmentCompletedByPosition;
        this.companyRepresentatitve = companyRepresentatitve;
        this.companyRepresentatitvePosition = companyRepresentatitvePosition;
        this.safetyWork = safetyWork;
        this.safetyWorkPosition = safetyWorkPosition;
        this.other = other;
        this.otherPosition = otherPosition;
        this.otherInformation = otherInformation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAssessmentOf() {
        return assessmentOf;
    }

    public void setAssessmentOf(String assessmentOf) {
        this.assessmentOf = assessmentOf;
    }

    public String getWorkTask() {
        return workTask;
    }

    public void setWorkTask(String workTask) {
        this.workTask = workTask;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAssessmentOrderBy() {
        return assessmentOrderBy;
    }

    public void setAssessmentOrderBy(String assessmentOrderBy) {
        this.assessmentOrderBy = assessmentOrderBy;
    }

    public String getAssessmentOrderByPosition() {
        return assessmentOrderByPosition;
    }

    public void setAssessmentOrderByPosition(String assessmentOrderByPosition) {
        this.assessmentOrderByPosition = assessmentOrderByPosition;
    }

    public String getAssessmentCompletedBy() {
        return assessmentCompletedBy;
    }

    public void setAssessmentCompletedBy(String assessmentCompletedBy) {
        this.assessmentCompletedBy = assessmentCompletedBy;
    }

    public String getAssessmentCompletedByPosition() {
        return assessmentCompletedByPosition;
    }

    public void setAssessmentCompletedByPosition(String assessmentCompletedByPosition) {
        this.assessmentCompletedByPosition = assessmentCompletedByPosition;
    }

    public String getCompanyRepresentatitve() {
        return companyRepresentatitve;
    }

    public void setCompanyRepresentatitve(String companyRepresentatitve) {
        this.companyRepresentatitve = companyRepresentatitve;
    }

    public String getCompanyRepresentatitvePosition() {
        return companyRepresentatitvePosition;
    }

    public void setCompanyRepresentatitvePosition(String companyRepresentatitvePosition) {
        this.companyRepresentatitvePosition = companyRepresentatitvePosition;
    }

    public String getSafetyWork() {
        return safetyWork;
    }

    public void setSafetyWork(String safetyWork) {
        this.safetyWork = safetyWork;
    }

    public String getSafetyWorkPosition() {
        return safetyWorkPosition;
    }

    public void setSafetyWorkPosition(String safetyWorkPosition) {
        this.safetyWorkPosition = safetyWorkPosition;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOtherPosition() {
        return otherPosition;
    }

    public void setOtherPosition(String otherPosition) {
        this.otherPosition = otherPosition;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "InputData{" +
                "id=" + id +
                ", date=" + date +
                ", assessmentOf='" + assessmentOf + '\'' +
                ", workTask='" + workTask + '\'' +
                ", station='" + station + '\'' +
                ", department='" + department + '\'' +
                ", site='" + site + '\'' +
                ", country='" + country + '\'' +
                ", assessmentOrderBy='" + assessmentOrderBy + '\'' +
                ", assessmentOrderByPosition='" + assessmentOrderByPosition + '\'' +
                ", assessmentCompletedBy='" + assessmentCompletedBy + '\'' +
                ", assessmentCompletedByPosition='" + assessmentCompletedByPosition + '\'' +
                ", companyRepresentatitve='" + companyRepresentatitve + '\'' +
                ", companyRepresentatitvePosition='" + companyRepresentatitvePosition + '\'' +
                ", safetyWork='" + safetyWork + '\'' +
                ", safetyWorkPosition='" + safetyWorkPosition + '\'' +
                ", other='" + other + '\'' +
                ", otherPosition='" + otherPosition + '\'' +
                ", otherInformation='" + otherInformation + '\'' +
                '}';
    }
}
