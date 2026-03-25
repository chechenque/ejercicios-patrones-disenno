package com.clopewop.exceptionHandling;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import jakarta.servlet.http.HttpServletRequest;

class RestExceptionHandlerTest {
    ApiException apiException;
    WebRequest webRequest;
    RestExceptionHandler restExceptionHandler;
    
    @BeforeEach
    void setUp(){
        apiException = new ApiException(HttpStatus.ACCEPTED, "Aceptado");
        restExceptionHandler = new RestExceptionHandler();

        HttpServletRequest mockHttpServletRequest = mock(HttpServletRequest.class);
        when(mockHttpServletRequest.getRequestURI()).thenReturn("/api/test");
        webRequest = new ServletWebRequest(mockHttpServletRequest);
    }

    @Test
    void handleApiExceptionTest(){
        var response = restExceptionHandler.handleApiException(apiException, webRequest);
        assertNotNull(response);
    }
}
