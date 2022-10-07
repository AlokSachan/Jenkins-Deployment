package com.alok.exception;

import org.springframework.http.HttpStatus;

public class CustomBusinessException extends RuntimeException implements CustomException {

    private final String message;
    private final HttpStatus httpStatus;

    public CustomBusinessException(final Throwable e, final String message, HttpStatus httpStatus) {
        super(message, e);
        this.message = message;
        this.httpStatus=httpStatus;
    }

    public CustomBusinessException(final String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus=httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
