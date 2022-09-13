package com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@NoArgsConstructor
@Entity
@Table(name = "physicallystrenuouswork")
@JsonIdentityInfo(scope = PhysicallyStrenuousWork.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PhysicallyStrenuousWork {

    @JsonIgnore
    private final int SIZE = 65;

    @JsonIgnore
    private final int LENGTH = 5;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name = "q61",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q61;

    @Column(name = "q61_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q61_Comm;

    @Column(name = "q62a",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q62a;

    @Column(name = "q62a_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q62a_Comm;

    @Column(name = "q62b",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q62b;

    @Column(name = "q62b_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q62b_Comm;

    @Column(name = "q62c",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q62c;

    @Column(name = "q62c_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q62c_Comm;

    @Column(name = "q62d",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q62d;

    @Column(name = "q62d_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q62d_Comm;

    @Column(name = "q62e",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q62e;

    @Column(name = "q62e_Comm",nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q62e_Comm;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "physicallyStrenuousWork")
    @JsonIgnore
    private CheckList checkList;

    public PhysicallyStrenuousWork(String q61, String q61_Comm,
                                   String q62a, String q62a_Comm,
                                   String q62b, String q62b_Comm,
                                   String q62c, String q62c_Comm,
                                   String q62d, String q62d_Comm,
                                   String q62e, String q62e_Comm) {
        this.q61 = q61;
        this.q61_Comm = q61_Comm;
        this.q62a = q62a;
        this.q62a_Comm = q62a_Comm;
        this.q62b = q62b;
        this.q62b_Comm = q62b_Comm;
        this.q62c = q62c;
        this.q62c_Comm = q62c_Comm;
        this.q62d = q62d;
        this.q62d_Comm = q62d_Comm;
        this.q62e = q62e;
        this.q62e_Comm = q62e_Comm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQ61() {
        return q61;
    }

    public void setQ61(String q61) {
        this.q61 = q61;
    }

    public String getQ61_Comm() {
        return q61_Comm;
    }

    public void setQ61_Comm(String q61_Comm) {
        this.q61_Comm = q61_Comm;
    }

    public String getQ62a() {
        return q62a;
    }

    public void setQ62a(String q62a) {
        this.q62a = q62a;
    }

    public String getQ62a_Comm() {
        return q62a_Comm;
    }

    public void setQ62a_Comm(String q62a_Comm) {
        this.q62a_Comm = q62a_Comm;
    }

    public String getQ62b() {
        return q62b;
    }

    public void setQ62b(String q62b) {
        this.q62b = q62b;
    }

    public String getQ62b_Comm() {
        return q62b_Comm;
    }

    public void setQ62b_Comm(String q62b_Comm) {
        this.q62b_Comm = q62b_Comm;
    }

    public String getQ62c() {
        return q62c;
    }

    public void setQ62c(String q62c) {
        this.q62c = q62c;
    }

    public String getQ62c_Comm() {
        return q62c_Comm;
    }

    public void setQ62c_Comm(String q62c_Comm) {
        this.q62c_Comm = q62c_Comm;
    }

    public String getQ62d() {
        return q62d;
    }

    public void setQ62d(String q62d) {
        this.q62d = q62d;
    }

    public String getQ62d_Comm() {
        return q62d_Comm;
    }

    public void setQ62d_Comm(String q62d_Comm) {
        this.q62d_Comm = q62d_Comm;
    }

    public String getQ62e() {
        return q62e;
    }

    public void setQ62e(String q62e) {
        this.q62e = q62e;
    }

    public String getQ62e_Comm() {
        return q62e_Comm;
    }

    public void setQ62e_Comm(String q62e_Comm) {
        this.q62e_Comm = q62e_Comm;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "PhysicallyStrenuousWork Entity{" +
                "id=" + id +
                ", q61=" + q61 +
                ", q61_Comm='" + q61_Comm + '\'' +
                ", q62a=" + q62a +
                ", q62a_Comm='" + q62a_Comm + '\'' +
                ", q62b=" + q62b +
                ", q62b_Comm='" + q62b_Comm + '\'' +
                ", q62c=" + q62c +
                ", q62c_Comm='" + q62c_Comm + '\'' +
                ", q62d=" + q62d +
                ", q62d_com='" + q62d_Comm + '\'' +
                ", q62e=" + q62e +
                ", q62e_Comm='" + q62e_Comm + '\'' +
                '}';
    }
}
