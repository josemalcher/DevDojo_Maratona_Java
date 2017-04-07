package net.devdojo.javacore.classesabstratas.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * https://www.youtube.com/watch?v=wCvy9BYZE28&index=61&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public abstract class Funcionario extends Pessoa {


    protected String clt;
    protected double salario;


    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    //####################################

    public abstract void calculaSalario();

    @Override
    public void imprimeDePessoa() {
        System.out.println("Imprime de FUNCIONARIO");
    }
}

