package net.devdojo.javacore.exception.customexception;

/**
 * Criado por José Stélio Malcher Jr. on 09/04/2017.
 *
 * Curso Java Completo - Aula 75: Exceptions customizadas pt 09
 * https://www.youtube.com/watch?v=HoXCxdcCN6o&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=76
 *
 *
 */
public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Usuário ou senha Inválidos");
    }
}
