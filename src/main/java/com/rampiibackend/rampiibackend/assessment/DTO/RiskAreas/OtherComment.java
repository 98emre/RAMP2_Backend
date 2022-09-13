package com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@NoArgsConstructor
@Data
@JsonIdentityInfo(scope = com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.OtherComment.class,generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class OtherComment {

    @JsonIgnore
    private final int SIZE = 2000;

    private Long id;

    @Size(max = SIZE, message = "Comment Lenght Is Max 200")
    private String text;


    @JsonIgnore
    private CheckList checkList;

    public OtherComment(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public void setCheckList(CheckList checkList) {
        this.checkList = checkList;
    }

    @Override
    public String toString() {
        return "OtherComment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
