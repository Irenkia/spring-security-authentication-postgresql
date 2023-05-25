package com.example.springsecurityauthenticationpostgresql.security.services;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public interface UserDetails {
//    AuthenticationManager authenticationManager = null;
//    Authentication authentication =
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(username, password)
//            );
//    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//    userDetails.getUsername();
//    userDetails.getPassword();
//    userDetails.getAuthorities();


    Collection<? extends GrantedAuthority> getAuthorities();
    String getPassword();
    String getUsername();
    boolean isAccountNonExpired();
    boolean isAccountNonLocked();
    boolean isCredentialsNonExpired();
    boolean isEnabled();
}
