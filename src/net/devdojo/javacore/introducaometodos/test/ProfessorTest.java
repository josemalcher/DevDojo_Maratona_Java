package net.devdojo.javacore.introducaometodos.test;

import net.devdojo.javacore.introducaometodos.classes.Professor;

/**
 * Criado por José Stélio Malcher Junior em 23/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 31: Métodos com parâmetros tipo reference pt 01
 * https://www.youtube.com/watch?v=WHd3PRcFbQw&index=32&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "José";
        professor1.matricula = "123456";
        professor1.rg = "123123";
        professor1.cpf =  "123.123.123-12";

        Professor professor2 = new Professor();
        professor2.nome = "Maria";
        professor2.matricula = "99999";
        professor2.rg = "777777";
        professor2.cpf =  "333.222.888-12";

        professor1.imprime();
        professor2.imprime();
    }
}
