package net.devdojo.javacore.modificadorfinal.classe;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 56: Modificador Final
 * https://www.youtube.com/watch?v=_jmR8SgQr44&index=57&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Comprador {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
