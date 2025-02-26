package com.example.mobileappwebservices.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 4050179717880662935L;

    public UserServiceException(String message) {
        super(message);
    }

}
