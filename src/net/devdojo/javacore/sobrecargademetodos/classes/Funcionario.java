package net.devdojo.javacore.sobrecargademetodos.classes;

/**
 * Criado por José Stélio Malcher Junior em 24/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 38: Sobrecarga de métodos
 * https://www.youtube.com/watch?v=uq4O__CGPdo&index=39&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

   /* public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String cpf, double salario, String rg) {
        init(nome,cpf,salario);
        this.rg = rg;
    }*/

    public Funcionario(String nome, String cpf, double salario, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    public Funcionario() {
    }

    public void imprime(){
        System.out.println("NOme: "+ this.nome);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Salario: R$ "+this.salario);
    }
}
