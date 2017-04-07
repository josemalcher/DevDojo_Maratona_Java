package net.devdojo.javacore.interfaces.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * * Curso Java Completo - Aula 62: Interfaces pt 01
 * https://www.youtube.com/watch?v=uUGFh9UvXyQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=63
 *
 */
public class Produto implements Tributavel, Transportavel{

    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFinal() {
        return valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    //#####################################

    @Override
    public void calcularImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }
}
