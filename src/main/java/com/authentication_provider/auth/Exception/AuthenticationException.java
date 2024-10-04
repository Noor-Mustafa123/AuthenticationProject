package com.authentication_provider.auth.Exception;


import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class AuthenticationException extends ExceptionProvider {

    public AuthenticationException(String code) {
        super(code);
    }
}
