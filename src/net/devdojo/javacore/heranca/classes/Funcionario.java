package net.devdojo.javacore.heranca.classes;

/**
 * Criado por José Stélio Malcher Jr. on 28/03/2017.
 *
 * DevDojo
 * Curso Java Completo - Aula 50: Herança pt 01
 * https://www.youtube.com/watch?v=rN5IgvISCsQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=51
 */
public class Funcionario extends Pessoa {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
