package com.ronnysoares.sistema_usuarios.exception;

public class UsuarioNotFoundException extends RuntimeException {

    public UsuarioNotFoundException(Long id){
        super("Usuario com id " + id + " não encontrado!");
    }

    public UsuarioNotFoundException(String email){
        super("Usuario com com email " + email + " não encontrado!");
    }

}
