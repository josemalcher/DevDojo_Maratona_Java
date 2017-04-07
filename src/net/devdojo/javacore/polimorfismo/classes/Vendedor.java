package net.devdojo.javacore.polimorfismo.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * https://www.youtube.com/watch?v=Ps2ptq1twyA&index=65&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Vendedor extends Funcionario {

    private double totaoVendas;

    public Vendedor(String nome, double salario, double totaoVendas) {
        super(nome, salario);
        this.totaoVendas = totaoVendas;
    }

    public double getTotaoVendas() {
        return totaoVendas;
    }

    public void setTotaoVendas(double totaoVendas) {
        this.totaoVendas = totaoVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (totaoVendas * 0.05);
    }
}
