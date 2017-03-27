package net.devdojo.javacore.modificadorestatico.classes;

/**
 * Criado por José Stélio Malcher Jr. on 27/03/2017.
 * <p>
 * DevDojo
 * Curso Java Completo - Aula 42: Modificador static
 * https://www.youtube.com/watch?v=JFFfIN14oc4&index=43&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class Carro {

    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240.0;

    public Carro() {
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

/*    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }*/

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        //detalhe, não foi usando o this.
        Carro.velocidadeLimite = velocidadeLimite;
    }

    /*
        ***************************************
         */
    public void imprime(){
        System.out.println("*********************");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máx.: "+ this.getVelocidadeMaxima());
        System.out.println("Velocidade Lim.: "+ velocidadeLimite);
    }
}
