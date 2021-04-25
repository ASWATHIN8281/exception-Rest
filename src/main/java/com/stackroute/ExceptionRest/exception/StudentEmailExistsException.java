package com.stackroute.ExceptionRest.exception;

public class StudentEmailExistsException extends Exception{
    private String msg;

    public StudentEmailExistsException() {
    }

    public StudentEmailExistsException(String msg, String message) {
        super(message);
        this.msg = msg;
    }
}
