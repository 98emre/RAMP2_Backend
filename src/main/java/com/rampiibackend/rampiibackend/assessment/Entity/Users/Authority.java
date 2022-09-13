package com.rampiibackend.rampiibackend.assessment.Entity.Users;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Table(name ="authority")
@Entity
public class Authority implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "roleCode")
    private String roleCode;

    @Override
    public String getAuthority() {
        return roleCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

}
