package com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@NoArgsConstructor
@Entity
@Table(name="posture")
@JsonIdentityInfo(scope = Posture.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Posture {

    @JsonIgnore
    private final int SIZE = 65;

    @JsonIgnore
    private final int LENGTH = 5;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "q11", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q11;

    @Column(name = "q11_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q11_Comm;

    @Column(name = "q12", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q12;

    @Column(name = "q12_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q12_Comm;

    @Column(name = "q13", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q13;

    @Column(name = "q13_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q13_Comm;

    @Column(name = "q14",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q14;

    @Column(name = "q14_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q14_Comm;

    @Column(name = "q15a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q15a;

    @Column(name = "q15b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q15b;

    @Column(name = "q15_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q15_Comm;

    @Column(name = "q16a",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q16a;

    @Column(name = "q16b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q16b;

    @Column(name = "q16_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q16_Comm;

    @Column(name = "q17a",nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q17a;

    @Column(name = "q17b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q17b;

    @Column(name = "q17_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q17_Comm;

    @Column(name = "q18", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q18;

    @Column(name = "q18_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q18_Comm;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "posture")
    @JsonIgnore
    private CheckList checkList;

    public Posture(String q11, String q11_Comm,
                   String q12, String q12_Comm,
                   String q13, String q13_Comm,
                   String q14, String q14_Comm,
                   String q15a, String q15b, String q15_Comm,
                   String q16a, String q16b, String q16_Comm,
                   String q17a, String q17b, String q17_Comm,
                   String q18, String q18_Comm) {
        this.q11 = q11;
        this.q11_Comm = q11_Comm;
        this.q12 = q12;
        this.q12_Comm = q12_Comm;
        this.q13 = q13;
        this.q13_Comm = q13_Comm;
        this.q14 = q14;
        this.q14_Comm = q14_Comm;
        this.q15a = q15a;
        this.q15b = q15b;
        this.q15_Comm = q15_Comm;
        this.q16a = q16a;
        this.q16b = q16b;
        this.q16_Comm = q16_Comm;
        this.q17a = q17a;
        this.q17b = q17b;
        this.q17_Comm = q17_Comm;
        this.q18 = q18;
        this.q18_Comm = q18_Comm;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getQ11() {
        return q11;
    }

    public void setQ11(String q11) {
        this.q11 = q11;
    }

    public String getQ11_Comm() {
        return q11_Comm;
    }

    public void setQ11_Comm(String q11_Comm) {
        this.q11_Comm = q11_Comm;
    }

    public String getQ12() {
        return q12;
    }

    public void setQ12(String q12) {
        this.q12 = q12;
    }

    public String getQ12_Comm() {
        return q12_Comm;
    }

    public void setQ12_Comm(String q12_Comm) {
        this.q12_Comm = q12_Comm;
    }

    public String getQ13() {
        return q13;
    }

    public void setQ13(String q13) {
        this.q13 = q13;
    }

    public String getQ13_Comm() {
        return q13_Comm;
    }

    public void setQ13_Comm(String q13_Comm) {
        this.q13_Comm = q13_Comm;
    }

    public String getQ14() {
        return q14;
    }

    public void setQ14(String q14) {
        this.q14 = q14;
    }

    public String getQ14_Comm() {
        return q14_Comm;
    }

    public void setQ14_Comm(String q14_Comm) {
        this.q14_Comm = q14_Comm;
    }

    public String getQ15a() {
        return q15a;
    }

    public void setQ15a(String q15a) {
        this.q15a = q15a;
    }

    public String getQ15b() {
        return q15b;
    }

    public void setQ15b(String q15b) {
        this.q15b = q15b;
    }

    public String getQ15_Comm() {
        return q15_Comm;
    }

    public void setQ15_Comm(String q15_Comm) {
        this.q15_Comm = q15_Comm;
    }

    public String getQ16a() {
        return q16a;
    }

    public void setQ16a(String q16a) {
        this.q16a = q16a;
    }

    public String getQ16b() {
        return q16b;
    }

    public void setQ16b(String q16b) {
        this.q16b = q16b;
    }

    public String getQ16_Comm() {
        return q16_Comm;
    }

    public void setQ16_Comm(String q16_Comm) {
        this.q16_Comm = q16_Comm;
    }

    public String getQ17a() {
        return q17a;
    }

    public void setQ17a(String q17a) {
        this.q17a = q17a;
    }

    public String getQ17b() {
        return q17b;
    }

    public void setQ17b(String q17b) {
        this.q17b = q17b;
    }

    public String getQ17_Comm() {
        return q17_Comm;
    }

    public void setQ17_Comm(String q17_Comm) {
        this.q17_Comm = q17_Comm;
    }

    public String getQ18() {
        return q18;
    }

    public void setQ18(String q18) {
        this.q18 = q18;
    }

    public String getQ18_Comm() {
        return q18_Comm;
    }

    public void setQ18_Comm(String q18_Comm) {
        this.q18_Comm = q18_Comm;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "Posture{" +
                "id=" + id +
                ", q11=" + q11 +
                ", q11_Comm='" + q11_Comm + '\'' +
                ", q12=" + q12 +
                ", q12_Comm='" + q12_Comm + '\'' +
                ", q13=" + q13 +
                ", q13_Comm='" + q13_Comm + '\'' +
                ", q14=" + q14 +
                ", q14_Comm='" + q14_Comm + '\'' +
                ", q15a=" + q15a +
                ", q15b=" + q15b +
                ", q15_Comm='" + q15_Comm + '\'' +
                ", q16a=" + q16a +
                ", q16b=" + q16b +
                ", q16_Comm='" + q16_Comm + '\'' +
                ", q17a=" + q17a +
                ", q17b=" + q17b +
                ", q17_Comm='" + q17_Comm + '\'' +
                ", q18=" + q18 +
                ", q18_Comm='" + q18_Comm + '\'' +
                '}';
    }
}