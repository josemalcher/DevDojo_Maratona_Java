package net.devdojo.javacore.introducaometodos.test;

import net.devdojo.javacore.introducaometodos.classes.Estudante;

/**
 * Criado por José Stélio Malcher Junior em 23/03/2017.
 * www.josemalcher.net
 *
 * DeveDojo
 * Curso Java Completo - Aula 35: Exercício sobre métodos
 * https://www.youtube.com/watch?v=Qx4-p5fn_rA&index=36&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class EstudanteTest   {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        aluno1.setNome("José Malcher");
        aluno1.setIdade(32);
        aluno1.setNotas(new double[]{3,4,3,9.5});

        aluno1.print();
        System.out.println("");
        aluno1.tirarMedia();

    }
}
