package com.rampiibackend.rampiibackend.assessment.RestController;

import com.rampiibackend.rampiibackend.assessment.Entity.Users.Authority;
import com.rampiibackend.rampiibackend.assessment.Entity.Users.User;
import com.rampiibackend.rampiibackend.assessment.ServiceImp.UserServiceImp;
import com.rampiibackend.rampiibackend.assessment.config.JWTTokenHelper;
import com.rampiibackend.rampiibackend.assessment.DTO.requests.AuthenticationRequest;
import com.rampiibackend.rampiibackend.assessment.DTO.responses.LoginResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JWTTokenHelper jWTTokenHelper;

    @Autowired
    private UserServiceImp userServiceImp;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthenticationRequest authenticationRequest) throws InvalidKeySpecException, NoSuchAlgorithmException {

        final Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                authenticationRequest.getUsername(), authenticationRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        User user=(User)authentication.getPrincipal();
        String jwtToken=jWTTokenHelper.generateToken(user.getUsername());
        ArrayList<String> roles = new ArrayList<>();
        for(int i = 0;i<user.getAuthorities().size();i++){
            roles.add(user.getAuthorities().get(i).getRoleCode());
        }
        LoginResponse response=new LoginResponse();
        response.setToken(jwtToken);
        response.setRoles(roles);
        response.setId(user.getId());

        return ResponseEntity.ok(response);
    }


    @PostMapping("/addUser")
    public User addUser(@Valid @RequestBody User user){
        user.setId(0L);

        Authority userAuthority = new Authority();
        userAuthority.setId(0L);
        userAuthority.setRoleCode("USER");
        List<Authority> authorityList = new ArrayList<>();
        authorityList.add(userAuthority);
        user.setAuthorities(authorityList);
        userServiceImp.save(modelMapper.map(user, com.rampiibackend.rampiibackend.assessment.Entity.Users.User.class));
        return user;
    }

}
