package com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;


@NoArgsConstructor
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.PhysicalDiscomfort.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
@Data
public class PhysicalDiscomfort {

    @JsonIgnore
    private final int SIZE = 65;

    @JsonIgnore
    private final int LENGTH = 5;

    private Long id;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q71;

    @Size(max = SIZE, message = "Comment Max Length Is 65")
    private String q71_Comm;

    @Size(max = SIZE, message = "Text Max Length Is 65")
    private String q72a;

    @Size(max = SIZE, message = "Comment Max Length Is 65")
    private String q72a_Comm;

    @Size(max = SIZE, message = "Text Max Length Is 65")
    private String q72b;

    @Size(max = SIZE, message = "Comment Max Length Is 65")
    private String q72b_Comm;

    @Size(max = SIZE, message = "Text Max Length Is 65")
    private String q72c;

    @Size(max = SIZE, message = "Comment Max Length Is 65")
    private String q72c_Comm;

    @Size(max = SIZE, message = "Text Max Length Is 65")
    private String q72d;

    @Size(max = SIZE, message = "Comment Max Length Is 65")
    private String q72d_Comm;

    @Size(max = SIZE, message = "Text Max Length Is 65")
    private String q72e;

    @Size(max = SIZE, message = "Comment Max Length Is 65")
    private String q72e_Comm;

    @JsonIgnore
    private CheckList checkList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQ71() {
        return q71;
    }

    public void setQ71(String q71) {
        this.q71 = q71;
    }

    public String getQ71_Comm() {
        return q71_Comm;
    }

    public void setQ71_Comm(String q71_Comm) {
        this.q71_Comm = q71_Comm;
    }

    public String getQ72a() {
        return q72a;
    }

    public void setQ72a(String q72a) {
        this.q72a = q72a;
    }

    public String getQ72a_Comm() {
        return q72a_Comm;
    }

    public void setQ72a_Comm(String q72a_Comm) {
        this.q72a_Comm = q72a_Comm;
    }

    public String getQ72b() {
        return q72b;
    }

    public void setQ72b(String q72b) {
        this.q72b = q72b;
    }

    public String getQ72b_Comm() {
        return q72b_Comm;
    }

    public void setQ72b_Comm(String q72b_Comm) {
        this.q72b_Comm = q72b_Comm;
    }

    public String getQ72c() {
        return q72c;
    }

    public void setQ72c(String q72c) {
        this.q72c = q72c;
    }

    public String getQ72c_Comm() {
        return q72c_Comm;
    }

    public void setQ72c_Comm(String q72c_Comm) {
        this.q72c_Comm = q72c_Comm;
    }

    public String getQ72d() {
        return q72d;
    }

    public void setQ72d(String q72d) {
        this.q72d = q72d;
    }

    public String getQ72d_Comm() {
        return q72d_Comm;
    }

    public void setQ72d_Comm(String q71d_Comm) {
        this.q72d_Comm = q71d_Comm;
    }

    public String getQ72e() {
        return q72e;
    }

    public void setQ72e(String q72e) {
        this.q72e = q72e;
    }

    public String getQ72e_Comm() {
        return q72e_Comm;
    }

    public void setQ72e_Comm(String q72e_Comm) {
        this.q72e_Comm = q72e_Comm;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "PhysicalDiscomfort Entity{" +
                "id=" + id +
                ", q71=" + q71 +
                ", q71_Comm='" + q71_Comm + '\'' +
                ", q72a=" + q72a +
                ", q72a_Comm='" + q72a_Comm + '\'' +
                ", q72b=" + q72b +
                ", q72b_Comm='" + q72b_Comm + '\'' +
                ", q72c=" + q72c +
                ", q72c_Comm='" + q72c_Comm + '\'' +
                ", q72d=" + q72d +
                ", q72d_Comm='" + q72d_Comm + '\'' +
                ", q72e=" + q72e +
                ", q72e_Comm='" + q72e_Comm + '\'' +
                '}';
    }
}
