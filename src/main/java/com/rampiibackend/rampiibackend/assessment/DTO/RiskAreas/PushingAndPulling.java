package com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@NoArgsConstructor
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.PushingAndPulling.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
@Data
public class PushingAndPulling {

    @JsonIgnore
    private final int LENGTH = 5;

    @JsonIgnore
    private final int SIZE = 65;

    private Long id;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q40;

    @Size(max = SIZE, message = "Comment Length Is Max 65")
    private String q41_averageComm;

    @Size(max = SIZE, message = "Comment Length Is Max 65")
    private String q41_worstComm;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q41a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q41b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q41c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q41d;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q42a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q42b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q42c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q42d;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q43a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q43b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q43c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q43d;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q44a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q44b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q44c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q44d;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q45a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q45b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q45c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q45d;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q46a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q46b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q46c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q46d;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q47a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q47b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q47c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q47d;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q48a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q48b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q48c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q48d;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q49a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q49b;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q49c;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q49d;

    @JsonIgnore
    private CheckList checkList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQ40() {
        return q40;
    }

    public void setQ40(String q40) {
        this.q40 = q40;
    }


    public String getQ41_averageComm() {
        return q41_averageComm;
    }

    public void setQ41_averageComm(String q41_averageComm) {
        this.q41_averageComm = q41_averageComm;
    }

    public String getQ41_worstComm() {
        return q41_worstComm;
    }

    public void setQ41_worstComm(String q41_worstComm) {
        this.q41_worstComm = q41_worstComm;
    }

    public String getQ41a() {
        return q41a;
    }

    public void setQ41a(String q41a) {
        this.q41a = q41a;
    }

    public String getQ41b() {
        return q41b;
    }

    public void setQ41b(String q41b) {
        this.q41b = q41b;
    }

    public String getQ41c() {
        return q41c;
    }

    public void setQ41c(String q41c) {
        this.q41c = q41c;
    }

    public String getQ41d() {
        return q41d;
    }

    public void setQ41d(String q41d) {
        this.q41d = q41d;
    }

    public String getQ42a() {
        return q42a;
    }

    public void setQ42a(String q42a) {
        this.q42a = q42a;
    }

    public String getQ42b() {
        return q42b;
    }

    public void setQ42b(String q42b) {
        this.q42b = q42b;
    }

    public String getQ42c() {
        return q42c;
    }

    public void setQ42c(String q42c) {
        this.q42c = q42c;
    }

    public String getQ42d() {
        return q42d;
    }

    public void setQ42d(String q42d) {
        this.q42d = q42d;
    }

    public String getQ43a() {
        return q43a;
    }

    public void setQ43a(String q43a) {
        this.q43a = q43a;
    }

    public String getQ43b() {
        return q43b;
    }

    public void setQ43b(String q43b) {
        this.q43b = q43b;
    }

    public String getQ43c() {
        return q43c;
    }

    public void setQ43c(String q43c) {
        this.q43c = q43c;
    }

    public String getQ43d() {
        return q43d;
    }

    public void setQ43d(String q43d) {
        this.q43d = q43d;
    }

    public String getQ44a() {
        return q44a;
    }

    public void setQ44a(String q44a) {
        this.q44a = q44a;
    }

    public String getQ44b() {
        return q44b;
    }

    public void setQ44b(String q44b) {
        this.q44b = q44b;
    }

    public String getQ44c() {
        return q44c;
    }

    public void setQ44c(String q44c) {
        this.q44c = q44c;
    }

    public String getQ44d() {
        return q44d;
    }

    public void setQ44d(String q44d) {
        this.q44d = q44d;
    }

    public String getQ45a() {
        return q45a;
    }

    public void setQ45a(String q45a) {
        this.q45a = q45a;
    }

    public String getQ45b() {
        return q45b;
    }

    public void setQ45b(String q45b) {
        this.q45b = q45b;
    }

    public String getQ45c() {
        return q45c;
    }

    public void setQ45c(String q45c) {
        this.q45c = q45c;
    }

    public String getQ45d() {
        return q45d;
    }

    public void setQ45d(String q45d) {
        this.q45d = q45d;
    }

    public String getQ46a() {
        return q46a;
    }

    public void setQ46a(String q46a) {
        this.q46a = q46a;
    }

    public String getQ46b() {
        return q46b;
    }

    public void setQ46b(String q46b) {
        this.q46b = q46b;
    }

    public String getQ46c() {
        return q46c;
    }

    public void setQ46c(String q46c) {
        this.q46c = q46c;
    }

    public String getQ46d() {
        return q46d;
    }

    public void setQ46d(String q46d) {
        this.q46d = q46d;
    }

    public String getQ47a() {
        return q47a;
    }

    public void setQ47a(String q47a) {
        this.q47a = q47a;
    }

    public String getQ47b() {
        return q47b;
    }

    public void setQ47b(String q47b) {
        this.q47b = q47b;
    }

    public String getQ47c() {
        return q47c;
    }

    public void setQ47c(String q47c) {
        this.q47c = q47c;
    }

    public String getQ47d() {
        return q47d;
    }

    public void setQ47d(String q47d) {
        this.q47d = q47d;
    }

    public String getQ48a() {
        return q48a;
    }

    public void setQ48a(String q48a) {
        this.q48a = q48a;
    }

    public String getQ48b() {
        return q48b;
    }

    public void setQ48b(String q48b) {
        this.q48b = q48b;
    }

    public String getQ48c() {
        return q48c;
    }

    public void setQ48c(String q48c) {
        this.q48c = q48c;
    }

    public String getQ48d() {
        return q48d;
    }

    public void setQ48d(String q48d) {
        this.q48d = q48d;
    }

    public String getQ49a() {
        return q49a;
    }

    public void setQ49a(String q49a) {
        this.q49a = q49a;
    }

    public String getQ49b() {
        return q49b;
    }

    public void setQ49b(String q49b) {
        this.q49b = q49b;
    }

    public String getQ49c() {
        return q49c;
    }

    public void setQ49c(String q49c) {
        this.q49c = q49c;
    }

    public String getQ49d() {
        return q49d;
    }

    public void setQ49d(String q49d) {
        this.q49d = q49d;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "PushingAndPulling{" +
                "id=" + id +
                ", q40='" + q40 + '\'' +
                ", q41_averageComm='" + q41_averageComm + '\'' +
                ", q41_worstComm='" + q41_worstComm + '\'' +
                ", q41a='" + q41a + '\'' +
                ", q41b='" + q41b + '\'' +
                ", q41c='" + q41c + '\'' +
                ", q41d='" + q41d + '\'' +
                ", q42a='" + q42a + '\'' +
                ", q42b='" + q42b + '\'' +
                ", q42c='" + q42c + '\'' +
                ", q42d='" + q42d + '\'' +
                ", q43a='" + q43a + '\'' +
                ", q43b='" + q43b + '\'' +
                ", q43c='" + q43c + '\'' +
                ", q43d='" + q43d + '\'' +
                ", q44a='" + q44a + '\'' +
                ", q44b='" + q44b + '\'' +
                ", q44c='" + q44c + '\'' +
                ", q44d='" + q44d + '\'' +
                ", q45a='" + q45a + '\'' +
                ", q45b='" + q45b + '\'' +
                ", q45c='" + q45c + '\'' +
                ", q45d='" + q45d + '\'' +
                ", q46a='" + q46a + '\'' +
                ", q46b='" + q46b + '\'' +
                ", q46c='" + q46c + '\'' +
                ", q46d='" + q46d + '\'' +
                ", q47a='" + q47a + '\'' +
                ", q47b='" + q47b + '\'' +
                ", q47c='" + q47c + '\'' +
                ", q47d='" + q47d + '\'' +
                ", q48a='" + q48a + '\'' +
                ", q48b='" + q48b + '\'' +
                ", q48c='" + q48c + '\'' +
                ", q48d='" + q48d + '\'' +
                ", q49a='" + q49a + '\'' +
                ", q49b='" + q49b + '\'' +
                ", q49c='" + q49c + '\'' +
                ", q49d='" + q49d + '\'' +
                '}';
    }
}