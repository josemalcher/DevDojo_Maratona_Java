package net.devdojo.javacore.heranca.classes;

/**
 * Criado por José Stélio Malcher Jr. on 28/03/2017.
 *
 * * DevDojo
 * Curso Java Completo - Aula 50: Herança pt 01
 * https://www.youtube.com/watch?v=rN5IgvISCsQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=51
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    /*
    ***********************************************
     */

    public void imprime(){
        System.out.println("Nome " + this.nome);
        System.out.println("CPF "+ this.cpf);
        System.out.println("End: " + this.endereco.getRua());
    }

}
