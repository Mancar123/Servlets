package com.manoj.exceptions;

public class InvalidColorCodeException extends RuntimeException{
    public InvalidColorCodeException(String message) {
        super(message);
    }
}

