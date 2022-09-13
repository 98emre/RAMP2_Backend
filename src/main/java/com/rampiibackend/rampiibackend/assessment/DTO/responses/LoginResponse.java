package com.rampiibackend.rampiibackend.assessment.DTO.responses;

import java.util.ArrayList;

public class LoginResponse {

    private Long id;

    private String token;

    private ArrayList<String> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }}
