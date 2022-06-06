package com.example.demo.exception;

public class UserNotfound extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UserNotfound(String message) {
        super(message);
    }
}
