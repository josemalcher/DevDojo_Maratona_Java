package net.devdojo.javacore.associacao.test;

import net.devdojo.javacore.associacao.exercicio.Aluno;
import net.devdojo.javacore.associacao.exercicio.Local;
import net.devdojo.javacore.associacao.exercicio.Professor;
import net.devdojo.javacore.associacao.exercicio.Seminario;

/**
 * Criado por José Stélio Malcher Jr. on 27/03/2017.
 *
 * DevDojo
 * Curso Java Completo - Aula 48: Exercício associação de classes pt 03
 * https://www.youtube.com/watch?v=2blCZZJ3HP4&index=49&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno  = new Aluno ("José Malcher", 32);
        Aluno aluno2 = new Aluno("Joana Maria", 29);

        Seminario seminario01 = new Seminario("Java Como Programar");

        Professor prof01 = new Professor("Prf. Girafales","COnhecimentos Gerais...");
        Local local = new Local("Rua das Araras","Mato");

        aluno.setSeminario(seminario01);
        aluno2.setSeminario(seminario01);
        //aluno.print();

        seminario01.setProfessor(prof01);
        seminario01.setLocal(local);
        seminario01.setAlunos(new Aluno[]{aluno,aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario01;
        prof01.setSeminarios(semArray);

        seminario01.print();
        prof01.print();
    }
}
