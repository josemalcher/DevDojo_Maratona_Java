package net.devdojo.javacore.enumeracao.classes;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 57: Enumeração pt 01
 * https://www.youtube.com/watch?v=Gr0-waoTkJc&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=58
 */
public class Cliente {

    private String nome;
    private TIpoCliente tipo;

    public Cliente(String nome, TIpoCliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TIpoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TIpoCliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
