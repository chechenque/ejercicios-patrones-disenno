package com.clopewop.exceptionHandling;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class ExceptionResponseTest {
    ExceptionResponse exceptionResponse1, exceptionResponse2;

    @BeforeEach
    void setUp(){
        exceptionResponse1 = new ExceptionResponse();
        exceptionResponse2 = new ExceptionResponse(LocalDateTime.now(),200,"Test message",HttpStatus.ACCEPTED,"/Path");
    }

    @Test
    void ConstructorTest1(){
        assertNotNull(exceptionResponse1);
    }

    @Test
    void ConstructorTest2(){
        assertNotNull(exceptionResponse2);
    }
    
}
