package com.authentication_provider.auth.Validator;

import com.authentication_provider.auth.Payload.AuthenticationRequest;
import com.authentication_provider.auth.Services.UsernamePasswordValidator;

public class AuthenticationRequestValidator implements Exhibitor<AuthenticationRequest>{

    public UsernamePasswordValidator usernamePasswordValidator;

    @Override
    public void validate(AuthenticationRequest authenticationRequest) {
        usernamePasswordValidator.validate(authenticationRequest);
    }
}
