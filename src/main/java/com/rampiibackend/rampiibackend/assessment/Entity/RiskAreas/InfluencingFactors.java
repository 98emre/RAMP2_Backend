package com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@NoArgsConstructor
@Entity
@Table(name="influencingfactors")
@JsonIdentityInfo(scope = InfluencingFactors.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class InfluencingFactors {

    @JsonIgnore
    private final int SIZE =  65;

    @JsonIgnore
    private final int LENGTH = 5;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "q51a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q51a;

    @Column(name = "q51a_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q51a_Comm;

    @Column(name = "q51b", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q51b;

    @Column(name = "q51b_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q51b_Comm;

    @Column(name = "q51c", nullable = true,length = LENGTH)
    private String q51c;

    @Column(name = "q51c_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q51c_Comm;

    @Column(name = "q51d", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q51d;

    @Column(name = "q51d_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q51d_Comm;

    @Column(name = "q51e", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q51e;

    @Column(name = "q51e_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q51e_Comm;

    @Column(name = "q51f", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q51f;

    @Column(name = "q51f_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q51f_Comm;

    @Column(name = "q52a", nullable = true,length =LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q52a;

    @Column(name = "q52a_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q52a_Comm;

    @Column(name = "q52b", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q52b;

    @Column(name = "q52b_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q52b_Comm;

    @Column(name = "q52c", nullable = true,length =LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q52c;

    @Column(name = "q52c_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q52c_Comm;

    @Column(name = "q52d", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q52d;

    @Column(name = "q52d_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q52d_Comm;

    @Column(name = "q52e", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q52e;

    @Column(name = "q52e_Comm", nullable =true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q52e_Comm;

    @Column(name = "q52f", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q52f;

    @Column(name = "q52f_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q52f_Comm;

    @Column(name = "q52g", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q52g;

    @Column(name = "q52g_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q52g_Comm;
    @Column(name = "q52h", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q52h;

    @Column(name = "q52h_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q52h_Comm;

    @Column(name = "q53a", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q53a;

    @Column(name = "q53a_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q53a_Comm;

    @Column(name = "q53b", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q53b;

    @Column(name = "q53b_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q53b_Comm;

    @Column(name = "q53c", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q53c;

    @Column(name = "q53c_Comm", nullable = true,length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q53c_Comm;

    @Column(name = "q53d", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q53d;

    @Column(name = "q53d_Comm", nullable = true, length = SIZE)
    @Size(max = SIZE, message = "Comment Lenght Is Max 65")
    private String q53d_Comm;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "influencingFactors")
    @JsonIgnore
    private CheckList checkList;

    public InfluencingFactors(String q51a, String q51a_Comm,
                              String q51b, String q51b_Comm,
                              String q51c, String q51c_Comm,
                              String q51d, String q51d_Comm,
                              String q51e, String q51e_Comm,
                              String q51f, String q51f_Comm,
                              String q52a, String q52a_Comm,
                              String q52b, String q52b_Comm,
                              String q52c, String q52c_Comm,
                              String q52d, String q52d_Comm,
                              String q52e, String q52e_Comm,
                              String q52f, String q52f_Comm,
                              String q52g, String q52g_Comm,
                              String q52h, String q52h_Comm,
                              String q53a, String q53a_Comm,
                              String q53b, String q53b_Comm,
                              String q53c, String q53c_Comm,
                              String q53d, String q53d_Comm) {
        this.q51a = q51a;
        this.q51a_Comm = q51a_Comm;
        this.q51b = q51b;
        this.q51b_Comm = q51b_Comm;
        this.q51c = q51c;
        this.q51c_Comm = q51c_Comm;
        this.q51d = q51d;
        this.q51d_Comm = q51d_Comm;
        this.q51e = q51e;
        this.q51e_Comm = q51e_Comm;
        this.q51f = q51f;
        this.q51f_Comm = q51f_Comm;
        this.q52a = q52a;
        this.q52a_Comm = q52a_Comm;
        this.q52b = q52b;
        this.q52b_Comm = q52b_Comm;
        this.q52c = q52c;
        this.q52c_Comm = q52c_Comm;
        this.q52d = q52d;
        this.q52d_Comm = q52d_Comm;
        this.q52e = q52e;
        this.q52e_Comm = q52e_Comm;
        this.q52f = q52f;
        this.q52f_Comm = q52f_Comm;
        this.q52g = q52g;
        this.q52g_Comm = q52g_Comm;
        this.q52h = q52h;
        this.q52h_Comm = q52h_Comm;
        this.q53a = q53a;
        this.q53a_Comm = q53a_Comm;
        this.q53b = q53b;
        this.q53b_Comm = q53b_Comm;
        this.q53c = q53c;
        this.q53c_Comm = q53c_Comm;
        this.q53d = q53d;
        this.q53d_Comm = q53d_Comm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQ51a() {
        return q51a;
    }

    public void setQ51a(String q51a) {
        this.q51a = q51a;
    }

    public String getQ51a_Comm() {
        return q51a_Comm;
    }

    public void setQ51a_Comm(String q51a_Comm) {
        this.q51a_Comm = q51a_Comm;
    }

    public String getQ51b() {
        return q51b;
    }

    public void setQ51b(String q51b) {
        this.q51b = q51b;
    }

    public String getQ51b_Comm() {
        return q51b_Comm;
    }

    public void setQ51b_Comm(String q51b_Comm) {
        this.q51b_Comm = q51b_Comm;
    }

    public String getQ51c() {
        return q51c;
    }

    public void setQ51c(String q51c) {
        this.q51c = q51c;
    }

    public String getQ51c_Comm() {
        return q51c_Comm;
    }

    public void setQ51c_Comm(String q51c_Comm) {
        this.q51c_Comm = q51c_Comm;
    }

    public String getQ51d() {
        return q51d;
    }

    public void setQ51d(String q51d) {
        this.q51d = q51d;
    }

    public String getQ51d_Comm() {
        return q51d_Comm;
    }

    public void setQ51d_Comm(String q51d_Comm) {
        this.q51d_Comm = q51d_Comm;
    }

    public String getQ51e() {
        return q51e;
    }

    public void setQ51e(String q51e) {
        this.q51e = q51e;
    }

    public String getQ51e_Comm() {
        return q51e_Comm;
    }

    public void setQ51e_Comm(String q51e_Comm) {
        this.q51e_Comm = q51e_Comm;
    }

    public String getQ51f() {
        return q51f;
    }

    public void setQ51f(String q51f) {
        this.q51f = q51f;
    }

    public String getQ51f_Comm() {
        return q51f_Comm;
    }

    public void setQ51f_Comm(String q51f_Comm) {
        this.q51f_Comm = q51f_Comm;
    }

    public String getQ52a() {
        return q52a;
    }

    public void setQ52a(String q52a) {
        this.q52a = q52a;
    }

    public String getQ52a_Comm() {
        return q52a_Comm;
    }

    public void setQ52a_Comm(String q52a_Comm) {
        this.q52a_Comm = q52a_Comm;
    }

    public String getQ52b() {
        return q52b;
    }

    public void setQ52b(String q52b) {
        this.q52b = q52b;
    }

    public String getQ52b_Comm() {
        return q52b_Comm;
    }

    public void setQ52b_Comm(String q52b_Comm) {
        this.q52b_Comm = q52b_Comm;
    }

    public String getQ52c() {
        return q52c;
    }

    public void setQ52c(String q52c) {
        this.q52c = q52c;
    }

    public String getQ52c_Comm() {
        return q52c_Comm;
    }

    public void setQ52c_Comm(String q52c_Comm) {
        this.q52c_Comm = q52c_Comm;
    }

    public String getQ52d() {
        return q52d;
    }

    public void setQ52d(String q52d) {
        this.q52d = q52d;
    }

    public String getQ52d_Comm() {
        return q52d_Comm;
    }

    public void setQ52d_Comm(String q52d_Comm) {
        this.q52d_Comm = q52d_Comm;
    }

    public String getQ52e() {
        return q52e;
    }

    public void setQ52e(String q52e) {
        this.q52e = q52e;
    }

    public String getQ52e_Comm() {
        return q52e_Comm;
    }

    public void setQ52e_Comm(String q52e_Comm) {
        this.q52e_Comm = q52e_Comm;
    }

    public String getQ52f() {
        return q52f;
    }

    public void setQ52f(String q52f) {
        this.q52f = q52f;
    }

    public String getQ52f_Comm() {
        return q52f_Comm;
    }

    public void setQ52f_Comm(String q52f_Comm) {
        this.q52f_Comm = q52f_Comm;
    }

    public String getQ52g() {
        return q52g;
    }

    public void setQ52g(String q52g) {
        this.q52g = q52g;
    }

    public String getQ52g_Comm() {
        return q52g_Comm;
    }

    public void setQ52g_Comm(String q52g_Comm) {
        this.q52g_Comm = q52g_Comm;
    }

    public String getQ52h() {
        return q52h;
    }

    public void setQ52h(String q52h) {
        this.q52h = q52h;
    }

    public String getQ52h_Comm() {
        return q52h_Comm;
    }

    public void setQ52h_Comm(String q52h_Comm) {
        this.q52h_Comm = q52h_Comm;
    }

    public String getQ53a() {
        return q53a;
    }

    public void setQ53a(String q53a) {
        this.q53a = q53a;
    }

    public String getQ53a_Comm() {
        return q53a_Comm;
    }

    public void setQ53a_Comm(String q53a_Comm) {
        this.q53a_Comm = q53a_Comm;
    }

    public String getQ53b() {
        return q53b;
    }

    public void setQ53b(String q53b) {
        this.q53b = q53b;
    }

    public String getQ53b_Comm() {
        return q53b_Comm;
    }

    public void setQ53b_Comm(String q53b_Comm) {
        this.q53b_Comm = q53b_Comm;
    }

    public String getQ53c() {
        return q53c;
    }

    public void setQ53c(String q53c) {
        this.q53c = q53c;
    }

    public String getQ53c_Comm() {
        return q53c_Comm;
    }

    public void setQ53c_Comm(String q53c_Comm) {
        this.q53c_Comm = q53c_Comm;
    }

    public String getQ53d() {
        return q53d;
    }

    public void setQ53d(String q53d) {
        this.q53d = q53d;
    }

    public String getQ53d_Comm() {
        return q53d_Comm;
    }

    public void setQ53d_Comm(String q53d_Comm) {
        this.q53d_Comm = q53d_Comm;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "InfluencingFactors{" +
                ", id=" + id +
                ", q51a=" + q51a +
                ", q51a_Comm='" + q51a_Comm + '\'' +
                ", q51b=" + q51b +
                ", q51b_Comm='" + q51b_Comm + '\'' +
                ", q51c=" + q51c +
                ", q51c_Comm='" + q51c_Comm + '\'' +
                ", q51d=" + q51d +
                ", q51d_Comm='" + q51d_Comm + '\'' +
                ", q51e=" + q51e +
                ", q51e_Comm='" + q51e_Comm + '\'' +
                ", q51f=" + q51f +
                ", q51f_Comm='" + q51f_Comm + '\'' +
                ", q52a=" + q52a +
                ", q52a_Comm='" + q52a_Comm + '\'' +
                ", q52b=" + q52b +
                ", q52b_Comm='" + q52b_Comm + '\'' +
                ", q52c=" + q52c +
                ", q52c_Comm='" + q52c_Comm + '\'' +
                ", q52d=" + q52d +
                ", q52d_Comm='" + q52d_Comm + '\'' +
                ", q52e=" + q52e +
                ", q52e_Comm='" + q52e_Comm + '\'' +
                ", q52f=" + q52f +
                ", q52f_Comm='" + q52f_Comm + '\'' +
                ", q52g=" + q52g +
                ", q52g_Comm='" + q52g_Comm + '\'' +
                ", q52h=" + q52h +
                ", q52h_Comm='" + q52h_Comm + '\'' +
                ", q53a=" + q53a +
                ", q53a_Comm='" + q53a_Comm + '\'' +
                ", q53b=" + q53b +
                ", q53b_Comm='" + q53b_Comm + '\'' +
                ", q53c=" + q53c +
                ", q53c_Comm='" + q53c_Comm + '\'' +
                ", q53d=" + q53d +
                ", q53d_Comm='" + q53d_Comm + '\'' +
                '}';
    }
}
