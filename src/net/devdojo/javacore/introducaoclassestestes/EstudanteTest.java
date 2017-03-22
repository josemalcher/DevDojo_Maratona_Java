package net.devdojo.javacore.introducaoclassestestes;

import net.devdojo.javacore.introducaoclasses.Estudante;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net
 *
 * Curso Java Completo - Aula 24: Introdução a classes parte 1
 * https://www.youtube.com/watch?v=Godi9y-B2aI&index=25&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante jose = new Estudante();

        jose.nome = "José";
        jose.matricula = "123456";
        jose.idade = 32;

        System.out.println("Nome: " +jose.nome);
        System.out.println("Matricula "+jose.matricula);
        System.out.println("Idade: " + jose.idade);
    }
}
