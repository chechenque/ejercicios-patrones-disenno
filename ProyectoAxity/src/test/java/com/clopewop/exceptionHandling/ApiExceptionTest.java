package com.clopewop.exceptionHandling;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class ApiExceptionTest {
    ApiException apiException;

    @BeforeEach
    void setUp(){
        apiException = new ApiException(HttpStatus.ACCEPTED, "ACEPTADO");
    }

    @Test
    void constructorTest(){
        assertNotNull(apiException);
    }
    
}
