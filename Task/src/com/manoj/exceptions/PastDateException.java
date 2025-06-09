package com.manoj.exceptions;

public class PastDateException extends RuntimeException{
    public PastDateException(String msg) {
        super(msg);
    }

}
