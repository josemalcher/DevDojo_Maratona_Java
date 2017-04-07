package net.devdojo.javacore.polimorfismo.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * https://www.youtube.com/watch?v=Ps2ptq1twyA&index=65&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public abstract class Funcionario {

    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String  toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //##################

    public abstract void calcularPagamento();
}
