package com.raitztiago.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("User Already Exists");
    }
}
