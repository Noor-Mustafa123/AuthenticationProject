package com.authentication_provider.auth.Exception;

import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;


public class SpringSecuritySpecificAuthenticationException extends AuthenticationException {

    public SpringSecuritySpecificAuthenticationException(String errorMsg) {
        super(errorMsg);
    }

}
