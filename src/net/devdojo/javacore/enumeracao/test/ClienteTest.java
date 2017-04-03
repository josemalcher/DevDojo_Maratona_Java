package net.devdojo.javacore.enumeracao.test;

import net.devdojo.javacore.enumeracao.classes.Cliente;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 57: Enumeração pt 01
 * https://www.youtube.com/watch?v=Gr0-waoTkJc&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=58
 *
 */
public class ClienteTest {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna", Cliente.PESSOA_FISICA);
        //Problema decorre se for lançado no tipo cliente, que é um int, um valor diferente!!
        System.out.println(cliente);
    }

}
