package com.rampiibackend.rampiibackend.assessment.Service;

import com.rampiibackend.rampiibackend.assessment.Entity.Users.User;

import java.util.List;

public interface UserService {
    public void save(User user);
    public User findByUserName(String username);
}
