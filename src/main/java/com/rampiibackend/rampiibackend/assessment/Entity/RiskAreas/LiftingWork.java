package com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "liftingwork")
@JsonIdentityInfo(scope = LiftingWork.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class LiftingWork {

    @JsonIgnore
    private final int SIZE = 65;

    @JsonIgnore
    private final int LENGTH = 5;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "q30", nullable = true,length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q30;

    @Column(name = "q31_averageComm", length = SIZE)
    @Size(max = SIZE, message = "Comment Length Is Max 65")
    private String q31_averageComm;

    @Column(name = "q31_worstComm", length = SIZE)
    @Size(max = SIZE, message = "Comment Length Is Max 65")
    private String q31_worstComm;

    @Column(name = "q31a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q31a;

    @Column(name = "q31b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q31b;

    @Column(name = "q32a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q32a;

    @Column(name = "q32b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q32b;

    @Column(name = "q33a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q33a;

    @Column(name = "q33b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q33b;

    @Column(name = "q34a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q34a;

    @Column(name = "q34b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q34b;

    @Column(name = "q35a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q35a;

    @Column(name = "q35b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q35b;

    @Column(name = "q36a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q36a;

    @Column(name = "q36b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q36b;

    @Column(name = "q37a", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q37a;

    @Column(name = "q37b", nullable = true, length = LENGTH)
    @Size(max = LENGTH, message = "It's Max Size")
    private String q37b;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "liftingWork")
    @JsonIgnore
    private CheckList checkList;

    public LiftingWork() {
    }

    public LiftingWork(String q30,
                       String q31_averageComm, String q31_worstComm,
                       String q31a, String q31b,
                       String q32a, String q32b,
                       String q33a, String q33b,
                       String q34a, String q34b,
                       String q35a, String q35b,
                       String q36a, String q36b,
                       String q37a, String q37b) {
        this.q30 = q30;
        this.q31_averageComm = q31_averageComm;
        this.q31_worstComm = q31_worstComm;
        this.q31a = q31a;
        this.q31b = q31b;
        this.q32a = q32a;
        this.q32b = q32b;
        this.q33a = q33a;
        this.q33b = q33b;
        this.q34a = q34a;
        this.q34b = q34b;
        this.q35a = q35a;
        this.q35b = q35b;
        this.q36a = q36a;
        this.q36b = q36b;
        this.q37a = q37a;
        this.q37b = q37b;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQ30() {
        return q30;
    }

    public void setQ30(String q30) {
        this.q30 = q30;
    }

    public String getQ31_averageComm() {
        return q31_averageComm;
    }

    public void setQ31_averageComm(String q31_averageComm) {
        this.q31_averageComm = q31_averageComm;
    }

    public String getQ31_worstComm() {
        return q31_worstComm;
    }

    public void setQ31_worstComm(String q31_worstComm) {
        this.q31_worstComm = q31_worstComm;
    }

    public String getQ31a() {
        return q31a;
    }

    public void setQ31a(String q31a) {
        this.q31a = q31a;
    }

    public String getQ31b() {
        return q31b;
    }

    public void setQ31b(String q31b) {
        this.q31b = q31b;
    }

    public String getQ32a() {
        return q32a;
    }

    public void setQ32a(String q32a) {
        this.q32a = q32a;
    }

    public String getQ32b() {
        return q32b;
    }

    public void setQ32b(String q32b) {
        this.q32b = q32b;
    }

    public String getQ33a() {
        return q33a;
    }

    public void setQ33a(String q33a) {
        this.q33a = q33a;
    }

    public String getQ33b() {
        return q33b;
    }

    public void setQ33b(String q33b) {
        this.q33b = q33b;
    }

    public String getQ34a() {
        return q34a;
    }

    public void setQ34a(String q34a) {
        this.q34a = q34a;
    }

    public String getQ34b() {
        return q34b;
    }

    public void setQ34b(String q34b) {
        this.q34b = q34b;
    }

    public String getQ35a() {
        return q35a;
    }

    public void setQ35a(String q35a) {
        this.q35a = q35a;
    }

    public String getQ35b() {
        return q35b;
    }

    public void setQ35b(String q35b) {
        this.q35b = q35b;
    }

    public String getQ36a() {
        return q36a;
    }

    public void setQ36a(String q36a) {
        this.q36a = q36a;
    }

    public String getQ36b() {
        return q36b;
    }

    public void setQ36b(String q36b) {
        this.q36b = q36b;
    }

    public String getQ37a() {
        return q37a;
    }

    public void setQ37a(String q37a) {
        this.q37a = q37a;
    }

    public String getQ37b() {
        return q37b;
    }

    public void setQ37b(String q37b) {
        this.q37b = q37b;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "LiftingWork{" +
                "id=" + id +
                ", q30='" + q30 + '\'' +
                ", q31_averageComm='" + q31_averageComm + '\'' +
                ", q31_worstComm='" + q31_worstComm + '\'' +
                ", q31a='" + q31a + '\'' +
                ", q31b='" + q31b + '\'' +
                ", q32a='" + q32a + '\'' +
                ", q32b='" + q32b + '\'' +
                ", q33a='" + q33a + '\'' +
                ", q33b='" + q33b + '\'' +
                ", q34a='" + q34a + '\'' +
                ", q34b='" + q34b + '\'' +
                ", q35a='" + q35a + '\'' +
                ", q35b='" + q35b + '\'' +
                ", q36a='" + q36a + '\'' +
                ", q36b='" + q36b + '\'' +
                ", q37a='" + q37a + '\'' +
                ", q37b='" + q37b + '\'' +
                '}';
    }
}