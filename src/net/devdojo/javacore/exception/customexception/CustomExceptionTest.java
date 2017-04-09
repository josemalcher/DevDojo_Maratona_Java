package net.devdojo.javacore.exception.customexception;

/**
 * Criado por José Stélio Malcher Jr. on 09/04/2017.
 *
 * Curso Java Completo - Aula 75: Exceptions customizadas pt 09
 * https://www.youtube.com/watch?v=HoXCxdcCN6o&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=76
 *
 */
public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException{
        String usuarioBancoDeDados = "Gogu";
        String senhaBancoDeDados = "123456";
        String usuarioDigitado = "Goguu";
        String senhaDigitada   = "123456";

        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("LOGADO!!!");
        }

    }
}
