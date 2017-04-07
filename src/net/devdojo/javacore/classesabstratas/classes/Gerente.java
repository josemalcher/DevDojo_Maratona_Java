package net.devdojo.javacore.classesabstratas.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * https://www.youtube.com/watch?v=wCvy9BYZE28&index=61&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }
    //#################################


    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.2);
    }

    @Override
    public void imprimeDePessoa() {

    }
}
