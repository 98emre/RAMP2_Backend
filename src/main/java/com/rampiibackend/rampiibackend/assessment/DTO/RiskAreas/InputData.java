package com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@NoArgsConstructor
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.InputData.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
@Data
public class InputData {

    @JsonIgnore
    private final int SIZE = 65;

    @JsonIgnore
    private final int SIZE_DATE = 10;

    private Long id;

    private String date;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentOf;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String workTask;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String station;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String department;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String site;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String country;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentOrderBy;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentOrderByPosition;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentCompletedBy;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String assessmentCompletedByPosition;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String companyRepresentatitve;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String companyRepresentatitvePosition;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String safetyWork;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String safetyWorkPosition;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String other;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String otherPosition;

    @Size(max = SIZE, message = "Text Field Max 65")
    private String otherInformation;

    @JsonIgnore
    private CheckList checkList;

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
