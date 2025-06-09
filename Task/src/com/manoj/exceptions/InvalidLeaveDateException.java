package com.manoj.exceptions;

public class InvalidLeaveDateException extends RuntimeException{
    public InvalidLeaveDateException(String msg) {
        super(msg);
    }

}
