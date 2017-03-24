package net.devdojo.javacore.sobrecargaconstrutores.test;

import net.devdojo.javacore.sobrecargaconstrutores.classes.Estudante;

/**
 * Criado por José Stélio Malcher Junior em 24/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 40: Construtores e sobrecarga de construtores pt 02
 * https://www.youtube.com/watch?v=RufTevo0S0M&index=41&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class EstudanteTest {

    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("Jose Malcher", "123456", new double[]{7,7,8,5.5}, "12/08/2007");
        aluno1.imprime();
    }

}
