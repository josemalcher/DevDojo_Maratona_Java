package net.devdojo.javacore.classesabstratas.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 61: Classes abstratas pt 02
 * https://www.youtube.com/watch?v=rCnD1McFOU0&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=62
 *
 */
public abstract class Pessoa {
    protected String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //################################
    public abstract void imprimeDePessoa();
}
