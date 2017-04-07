package net.devdojo.javacore.classesabstratas.test;


import net.devdojo.javacore.classesabstratas.classes.Gerente;
import net.devdojo.javacore.classesabstratas.classes.Vendedor;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * https://www.youtube.com/watch?v=wCvy9BYZE28&index=61&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class FuncionarioTeste {
    public static void main(String[] args) {
        //Funcionario f = new Funcionario("Marcos", "123456", 2000);
        //f.calculaSalario();
        //System.out.println(f);

        Gerente g = new Gerente("Ana", "654321", 2000);
        g.calculaSalario();
        System.out.println(g);

        Vendedor v = new Vendedor("MARIO", "5555",2000, 100);
        v.calculaSalario();
        System.out.println(v);

    }
}
