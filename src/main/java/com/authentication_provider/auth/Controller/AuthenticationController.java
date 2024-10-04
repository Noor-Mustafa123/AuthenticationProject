package com.authentication_provider.auth.Controller;

import com.authentication_provider.auth.Payload.AuthenticationRequest;
import com.authentication_provider.auth.Services.AuthenticationServiceInterface;
import com.authentication_provider.auth.Constants.EndpointsConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class AuthenticationController {

    @Autowired
    public AuthenticationServiceInterface AuthenticationServiceInterface;


    @PostMapping(EndpointsConstants.AuthenticationControllerConstants.LOGIN_PATH)
    public ResponseEntity loginRequest(AuthenticationRequest authenticationRequest){

    }

}
