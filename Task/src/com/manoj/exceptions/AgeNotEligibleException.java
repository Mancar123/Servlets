package com.manoj.exceptions;

public class AgeNotEligibleException extends RuntimeException{
    public AgeNotEligibleException(String msg) {
        super(msg);
    }

}
