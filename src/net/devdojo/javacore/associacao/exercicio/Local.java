package net.devdojo.javacore.associacao.exercicio;

/**
 * Criado por José Stélio Malcher Jr. on 27/03/2017.
 *
 * DevDojo
 * Curso Java Completo - Aula 48: Exercício associação de classes pt 03
 * https://www.youtube.com/watch?v=2blCZZJ3HP4&index=49&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Local {
    private String rua;
    private String bairro;

    public Local() {
    }

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /*
    ************************************************
    *
     */
    public void print(){
        System.out.println("----- Relatório de LOCAL ------");
        System.out.println("Rua " + this.rua);
        System.out.println("Bairro "+ this.bairro);
    }

}
