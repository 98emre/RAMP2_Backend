package com.rampiibackend.rampiibackend.assessment.config;

import com.rampiibackend.rampiibackend.assessment.ServiceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTAuthenticationFilter extends OncePerRequestFilter {

    private UserServiceImp userService;
    private JWTTokenHelper jwtTokenHelper;

    public JWTAuthenticationFilter(UserServiceImp userService, JWTTokenHelper jwtTokenHelper){
        this.userService = userService;
        this.jwtTokenHelper = jwtTokenHelper;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authToken = jwtTokenHelper.getToken(request);

        if(authToken !=null){
            String username = jwtTokenHelper.getUsernameFromToken(authToken);

            if(username !=null){
                UserDetails userDetails = userService.loadUserByUsername(username);

                if(jwtTokenHelper.validateToken(authToken,userDetails)){
                    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
                    usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetails(request));

                    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);

                }
            }
        }
        filterChain.doFilter(request,response);

    }
}
