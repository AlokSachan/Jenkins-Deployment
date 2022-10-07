package com.alok.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.UUID;

@ControllerAdvice
public class ServiceExceptionHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(ServiceExceptionHandler.class);


    @ExceptionHandler(CustomBusinessException.class)
    public ResponseEntity<ServiceErrorResponseBean> handleBusinessException(final CustomBusinessException ex) {
        LOGGER.error("Rove service BusinessException ", ex);
        final ServiceErrorResponseBean errorResponseBean = new ServiceErrorResponseBean();
        errorResponseBean.setMessage(ex.getMessage());
        errorResponseBean.setTraceId(UUID.randomUUID().toString());
        return new ResponseEntity<>(errorResponseBean, HttpStatus.NOT_FOUND);
    }
}
