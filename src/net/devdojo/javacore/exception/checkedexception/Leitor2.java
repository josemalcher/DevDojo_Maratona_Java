package net.devdojo.javacore.exception.checkedexception;

/**
 * Criado por José Stélio Malcher Jr. on 09/04/2017.
 *
 * Curso Java Completo - Aula 74 : Exceptions: try-with-resources pt 08
 * https://www.youtube.com/watch?v=Medf33blG4M&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=75
 *
 */
public class Leitor2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("FECHANDO o LEITOR 2");
    }
}
