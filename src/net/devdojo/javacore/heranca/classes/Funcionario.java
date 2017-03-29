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

    public Funcionario(String nome) {
        super(nome); //sempre a primeira linha na execução
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: "+this.salario);
        imprimeReciboPagamento();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu "+ super.nome + "Recebi o pagamento de R$" +this.salario );
    }
}
