package com.rampiibackend.rampiibackend.assessment.Entity.Users;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.ActionPlan;
import com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@JsonIdentityInfo(scope = User.class,generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="username", unique = true)
    private String username;

    @Column(name="password",length = 255)
    private String password;

    @Column(name = "enabled")
    private boolean enabled=true;

    @OneToMany(mappedBy = "user",cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<CheckList> checkLists;

    @OneToMany(mappedBy = "user",cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ActionPlan> actionPlans;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name ="userAuthority",joinColumns = @JoinColumn(referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(referencedColumnName = "id"))
    private List<Authority> authorities;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    @Override
    public List<Authority> getAuthorities() {
        return authorities;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.enabled;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.enabled;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.enabled;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public List<CheckList> getCheckLists() {
        return checkLists;
    }

    public void setCheckLists(List<CheckList> checkLists) {
        this.checkLists = checkLists;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<ActionPlan> getActionPlans() {
        return actionPlans;
    }

    public void setActionPlans(List<ActionPlan> actionPlans) {
        this.actionPlans = actionPlans;
    }
}
