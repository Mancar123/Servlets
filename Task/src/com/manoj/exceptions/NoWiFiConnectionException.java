package com.manoj.exceptions;

public class NoWiFiConnectionException extends  RuntimeException{
    public NoWiFiConnectionException(String message) {
        super(message);
    }
}
