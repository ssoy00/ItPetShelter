package com.itpetshelter.itpetshelter.controller.advice;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@RestControllerAdvice
@Log4j2
public class CustomRestAdvice {

    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)

    public ResponseEntity<Map<String, String>> handleBindException(BindException e) {
        log.error("BindException 확인"+e);

        Map<String, String> errorMap = new HashMap<>();
        if(e.hasErrors()){
            BindingResult bindingResult = e.getBindingResult();
            bindingResult.getFieldErrors().forEach(fieldError -> {
                errorMap.put(fieldError.getField(), fieldError.getCode());
            });
        }
return ResponseEntity.badRequest().body(errorMap);
    }


    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)

    public ResponseEntity<Map<String, String>> handleNoSuchElementException(NoSuchElementException e) {
        log.error("handleNoSuchElementException 확인"+e);

        Map<String, String> errorMap = new HashMap<>();
       errorMap.put("time",""+System.currentTimeMillis());
        errorMap.put("msg","제약 조건 위반");
        return ResponseEntity.badRequest().body(errorMap);
    }


}
