package com.clopewop.exceptionHandling;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * This class models an API Exception.
 * @version 1.0
 * @author Clopewop
 */
@Setter
@Getter
public class ApiException extends RuntimeException{
    private HttpStatus status;

    /**
     * Constructor method,
     * @param status The status of the calling.
     * @param message The message to send.
     */
    public ApiException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

}