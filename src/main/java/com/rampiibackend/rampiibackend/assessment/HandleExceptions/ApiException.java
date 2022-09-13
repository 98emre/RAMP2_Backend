package com.rampiibackend.rampiibackend.assessment.HandleExceptions;

public class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
}
