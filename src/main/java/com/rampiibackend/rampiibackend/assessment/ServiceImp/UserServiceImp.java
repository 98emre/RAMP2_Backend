package com.rampiibackend.rampiibackend.assessment.ServiceImp;

import com.rampiibackend.rampiibackend.assessment.Entity.Users.User;
import com.rampiibackend.rampiibackend.assessment.Repository.UserRepository;
import com.rampiibackend.rampiibackend.assessment.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUserName(username);

        if(user==null){
            throw new UsernameNotFoundException("User Not Found with Username: " +username);
        }
        return user;
    }

    public void save(User user) {
        User result = userRepository.findByUserName(user.getUsername());

        if(result != null) {
            throw new RuntimeException("Username Is Already Used - " + user.getUsername());
        }
        userRepository.save(user);
    }


}
