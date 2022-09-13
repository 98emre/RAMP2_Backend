package com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@NoArgsConstructor
@Entity
@Table(name="repetitivework")
@JsonIdentityInfo(scope = RepetitiveWork.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class RepetitiveWork {

    @JsonIgnore
    private final int LENGTH = 5;

    @JsonIgnore
    private final int SIZE = 65;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "q21a",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q21a;

    @Column(name = "q21b",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q21b;

    @Column(name = "q21_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q21_Comm;

    @Column(name = "q22a",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q22a;

    @Column(name = "q22b",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q22b;

    @Column(name = "q22_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q22_Comm;

    @Column(name = "q23a",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q23a;

    @Column(name = "q23b",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q23b;

    @Column(name = "q23_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q23_Comm;

    @Column(name = "q24",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q24;

    @Column(name = "q24_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q24_Comm;

    @Column(name = "q25",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q25;

    @Column(name = "q25_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q25_Comm;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "repetitiveWork")
    @JsonIgnore
    private CheckList checkList;

    public RepetitiveWork(String q21a, String q21b, String q21_Comm,
                          String q22a, String q22b, String q22_Comm,
                          String q23a, String q23b, String q23_Comm,
                          String q24, String q24_Comm,
                          String q25, String q25_Comm) {
        this.q21a = q21a;
        this.q21b = q21b;
        this.q21_Comm = q21_Comm;
        this.q22a = q22a;
        this.q22b = q22b;
        this.q22_Comm = q22_Comm;
        this.q23a = q23a;
        this.q23b = q23b;
        this.q23_Comm = q23_Comm;
        this.q24 = q24;
        this.q24_Comm = q24_Comm;
        this.q25 = q25;
        this.q25_Comm = q25_Comm;
    }

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
