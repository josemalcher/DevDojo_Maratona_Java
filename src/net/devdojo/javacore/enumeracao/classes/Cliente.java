package net.devdojo.javacore.enumeracao.classes;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 57: Enumeração pt 01
 * https://www.youtube.com/watch?v=Gr0-waoTkJc&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=58
 */
public class Cliente {

    public enum TipoPagamento{
        AVISTA, APRAZO
    }

    private String nome;
    private TIpoCliente tIpoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TIpoCliente tIpoCliente, TipoPagamento tipoPagamento ) {
        this.nome = nome;
        this.tIpoCliente = tIpoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TIpoCliente gettIpoCliente() {
        return tIpoCliente;
    }

    public void settIpoCliente(TIpoCliente tIpoCliente) {
        this.tIpoCliente = tIpoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tIpoCliente=" + tIpoCliente +
                ", tipoPagamento=" + tipoPagamento +
                " numero = " + tIpoCliente.getTipo() + " " + tIpoCliente.getNome() +
                '}';
    }
}