package com.example.agileprojectbackend.exception;

public class MovieNotFoundException extends RuntimeException{
    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    public MovieNotFoundException(String message) {
        super(message);
    }
}
