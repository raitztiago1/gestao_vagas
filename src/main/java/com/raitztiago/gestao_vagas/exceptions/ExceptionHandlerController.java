package com.raitztiago.gestao_vagas.exceptions;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException)
    public void handleMethodArgumentNotValidException(MethodArgumentNotValidException e){

    }
}
