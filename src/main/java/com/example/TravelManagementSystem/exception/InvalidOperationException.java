package com.example.TravelManagementSystem.exception;

public class InvalidOperationException extends  RuntimeException {
    private String message;

    public InvalidOperationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
