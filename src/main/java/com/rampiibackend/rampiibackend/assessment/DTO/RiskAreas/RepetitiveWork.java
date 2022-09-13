package com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@NoArgsConstructor
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.RepetitiveWork.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
@Data
public class RepetitiveWork {

    @JsonIgnore
    private final int LENGTH = 5;

    @JsonIgnore
    private final int SIZE = 65;

    private Long id;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q21a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q21b;

    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q21_Comm;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q22a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q22b;

    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q22_Comm;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q23a;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q23b;

    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q23_Comm;

    @Size(max = LENGTH, message = "It's Max Size")
    private String q24;

    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q24_Comm;
    private String q25;

    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q25_Comm;

    @JsonIgnore
    private CheckList checkList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQ21a() {
        return q21a;
    }

    public void setQ21a(String q21a) {
        this.q21a = q21a;
    }

    public String getQ21b() {
        return q21b;
    }

    public void setQ21b(String q21b) {
        this.q21b = q21b;
    }

    public String getQ21_Comm() {
        return q21_Comm;
    }

    public void setQ21_Comm(String q21_Comm) {
        this.q21_Comm = q21_Comm;
    }

    public String getQ22a() {
        return q22a;
    }

    public void setQ22a(String q22a) {
        this.q22a = q22a;
    }

    public String getQ22b() {
        return q22b;
    }

    public void setQ22b(String q22b) {
        this.q22b = q22b;
    }

    public String getQ22_Comm() {
        return q22_Comm;
    }

    public void setQ22_Comm(String q22_Comm) {
        this.q22_Comm = q22_Comm;
    }

    public String getQ23a() {
        return q23a;
    }

    public void setQ23a(String q23a) {
        this.q23a = q23a;
    }

    public String getQ23b() {
        return q23b;
    }

    public void setQ23b(String q23b) {
        this.q23b = q23b;
    }

    public String getQ23_Comm() {
        return q23_Comm;
    }

    public void setQ23_Comm(String q23_Comm) {
        this.q23_Comm = q23_Comm;
    }

    public String getQ24() {
        return q24;
    }

    public void setQ24(String q24) {
        this.q24 = q24;
    }

    public String getQ24_Comm() {
        return q24_Comm;
    }

    public void setQ24_Comm(String q24_Comm) {
        this.q24_Comm = q24_Comm;
    }

    public String getQ25() {
        return q25;
    }

    public void setQ25(String q25) {
        this.q25 = q25;
    }

    public String getQ25_Comm() {
        return q25_Comm;
    }

    public void setQ25_Comm(String q25_Comm) {
        this.q25_Comm = q25_Comm;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "RepetitiveWork{" +
                "id=" + id +
                ", q21a=" + q21a +
                ", q21b=" + q21b +
                ", q21_Comm='" + q21_Comm + '\'' +
                ", q22a=" + q22a +
                ", q22b=" + q22b +
                ", q22_Comm='" + q22_Comm + '\'' +
                ", q23a=" + q23a +
                ", q23b=" + q23b +
                ", q23_Comm='" + q23_Comm + '\'' +
                ", q24=" + q24 +
                ", q24_Comm='" + q24_Comm + '\'' +
                ", q25=" + q25 +
                ", q25_Comm='" + q25_Comm + '\'' +
                '}';
    }
}
