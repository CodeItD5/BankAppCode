package com.userService.userService.ExceptionHandler;

public class UserNotFound extends RuntimeException{
    public UserNotFound(String message) {
        super(message);
    }
}