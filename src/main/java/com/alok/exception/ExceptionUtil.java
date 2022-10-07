package com.alok.exception;

import org.springframework.http.HttpStatus;

public class ExceptionUtil {

    public static void throwException(final String message, HttpStatus status) {
        throw new CustomBusinessException(message,status);
    }
}
