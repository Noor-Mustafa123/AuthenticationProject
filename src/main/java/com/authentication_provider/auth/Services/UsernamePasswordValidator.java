package com.authentication_provider.auth.Services;


import com.authentication_provider.auth.Constants.ExceptionCodes;
import com.authentication_provider.auth.Constants.ServiceConstants;
import com.authentication_provider.auth.Exception.AuthenticationException;
import com.authentication_provider.auth.Payload.AuthenticationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

public class UsernamePasswordValidator {



//   The entrypoint in the AuthenticationRequest class is a field that can contain either an email address or another identifier (such as a username)
   public void validate(AuthenticationRequest authenticationRequest){
//      first check entry point
      if(authenticationRequest.getEntrypoint().contains("@")){
         validateEmail(authenticationRequest.getEntrypoint());
      }

//      check password format
//      how to check format
   }

   public void validateEmail(String email){
//      check email format that it matches the regex meaning format by using the constants
      if(ObjectUtils.isEmpty(email)){
         throw new AuthenticationException(ExceptionCodes.EMAIL_MANDATORY);
      }
      if(!email.matches(ServiceConstants.EMAIL_REGEX)){
         throw new AuthenticationException(ExceptionCodes.EMAIL_NOT_VALID);
      }
//      throw an exception if not
   }

   public void validatePassword(String password){
//      check email format that it matches the regex meaning format by using the constants
      if(ObjectUtils.isEmpty(password)){
         throw new AuthenticationException(ExceptionCodes.PASSWORD_EMPTY);
      }
      if(!password.matches(ServiceConstants.PASSWORD_REGEX)){
         throw new AuthenticationException(ExceptionCodes.PASSWORD_CRITERIA_NOT_MATCHED);
      }
//      throw an exception if not
   }


}
