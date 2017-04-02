package net.devdojo.javacore.sobrescrita.test;

import net.devdojo.javacore.sobrescrita.classes.Pessoa;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 55: Sobrescrita de métodos
 * https://www.youtube.com/watch?v=JXVsUtqP0Ak&index=56&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&spfreload=1
 *
 */
public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(20);
        p.setNome("Jose");
        System.out.println(p);
    }
}
