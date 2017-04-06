package net.devdojo.javacore.enumeracao.classes;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 57: Enumeração pt 01
 * https://www.youtube.com/watch?v=Gr0-waoTkJc&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=58
 *
 *
 */
public enum TIpoCliente {
    PESSOA_JURIDICA(1, "Pessoa Juridica"), PESSOA_FISICA(2, "Pessoa Física"){
        public String getId(){ // constant specific class body || Corpo de classe especifico constate
            return "B";
        }
    }; //sempre será a primeira linha

    private int tipo;
    private String nome;

    TIpoCliente(int tipo, String nome) { //sempre são privados
        this.tipo =tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
