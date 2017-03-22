package net.devdojo.javacore.introducaoclasses.test;

import net.devdojo.javacore.introducaoclasses.classes.Professor;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net

 * DevDojo
 * Curso Java Completo - Aula 26: Solução do exercício introdução a classes
 * https://www.youtube.com/watch?v=BNYNM5hhDHw
 */
public class ProfessorTest {
    public static void main(String[] args) {

        Professor prof01 = new Professor();
        prof01.nome = "Jose";
        prof01.cpf = "12345678999";
        prof01.matricula= "123456";
        prof01.rg = "44445578";

        Professor prof02 = new Professor();
        prof02.nome = "Maria";
        prof02.cpf = "12222278999";
        prof02.matricula= "444444";
        prof02.rg = "999999";

        System.out.println(prof01.nome);
        System.out.println(prof01.matricula);
        System.out.println(prof01.rg);
        System.out.println("-------------");
        System.out.println(prof02.nome);
        System.out.println(prof02.matricula);
        System.out.println(prof02.rg);


    }
}
