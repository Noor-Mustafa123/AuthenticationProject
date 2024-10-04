package com.authentication_provider.auth.Exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;



//You're right to question this design choice. The ExceptionProvider class is created for two main reasons:
//It provides a common code field for all custom exceptions, allowing for consistent error identification.
//It extends RuntimeException, ensuring all custom exceptions are unchecked exceptions.
//While an interface could define a contract, this base class approach allows for shared implementation and consistent behavior across all custom exceptions in the application. However, if only the code field is needed, using an interface with a default method might indeed be a simpler and more flexible approach.
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ExceptionProvider extends RuntimeException {
    public String code;
}
