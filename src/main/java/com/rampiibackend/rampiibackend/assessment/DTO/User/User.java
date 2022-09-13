package com.rampiibackend.rampiibackend.assessment.DTO.User;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans.ActionPlan;
import com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas.CheckList;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@JsonIdentityInfo(scope = User.class,generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
@Data
public class User {

    private Long id;

    @Size(max = 20, message = "UserName is Max Lenght 20")
    private String username;

    @Size(max = 20, message = "Password is Max Length 20")
    @NotBlank(message = "No Blank Password")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonIgnore
    private CheckList checkList;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
