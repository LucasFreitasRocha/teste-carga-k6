package com.trabalhota2.exception;

public class BadCustomizeException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BadCustomizeException(String message) {
        super(message);
    }

    public BadCustomizeException(String message, Throwable cause) {
        super(message, cause);
    }
}