package net.devdojo.javacore.classesabstratas.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 60: Classes abstratas pt 01
 * https://www.youtube.com/watch?v=wCvy9BYZE28&index=61&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }




    //###########################
    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    @Override
    public void imprimeDePessoa() {

    }
}
