package com.authentication_provider.auth.Services;

import com.authentication_provider.auth.Payload.AuthenticationRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.concurrent.CompletableFuture;


public interface AuthenticationServiceInterface {

    CompletableFuture<AuthenticationRequest> authenticate(AuthenticationRequest authenticationRequest, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);

}
