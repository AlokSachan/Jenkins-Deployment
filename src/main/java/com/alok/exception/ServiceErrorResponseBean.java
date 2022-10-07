package com.alok.exception;

import lombok.Data;

@Data
public class ServiceErrorResponseBean {

    private String message;
    private String traceId;
}
