package net.devdojo.javacore.sobrescrita.classes;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 55: Sobrescrita de métodos
 * https://www.youtube.com/watch?v=JXVsUtqP0Ak&index=56&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&spfreload=1
 *
 *
 */
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
