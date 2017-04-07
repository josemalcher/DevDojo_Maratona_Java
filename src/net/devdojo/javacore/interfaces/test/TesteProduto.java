package net.devdojo.javacore.interfaces.test;

import net.devdojo.javacore.interfaces.classes.Produto;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 62: Interfaces pt 01
 * https://www.youtube.com/watch?v=uUGFh9UvXyQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=63
 *
 */
public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4,3000);
        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
