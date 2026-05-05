package com.ronnysoares.sistema_usuarios.exception;

public class EmailJaCadastradoException extends RuntimeException{
    public EmailJaCadastradoException(String email) {
        super("Email " + email + " Já está cadastrado!");
    }
}
