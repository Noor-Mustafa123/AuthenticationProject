package com.authentication_provider.auth.Services;

import com.authentication_provider.auth.Payload.AuthenticationRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AuthenticationServiceImplementation implements AuthenticationServiceInterface{
    @Override
    public CompletableFuture<AuthenticationRequest> authenticate(AuthenticationRequest authenticationRequest, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

    }
}
