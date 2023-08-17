package com.lcwd.user.service.exceptions;

import com.lcwd.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
    // firstof all I will find the messaage which received
        String message=ex.getMessage();
       // now is message to apne ApiResponse ke andr rakhenge aur bapas bhej denge
        ApiResponse response = ApiResponse.builder()
                .message(message)
                .success(true)
                .status(String.valueOf(HttpStatus.NOT_FOUND))
                .build();
       return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }

}