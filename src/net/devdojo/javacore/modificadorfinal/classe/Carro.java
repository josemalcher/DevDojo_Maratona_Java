package net.devdojo.javacore.modificadorfinal.classe;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 56: Modificador Final
 * https://www.youtube.com/watch?v=_jmR8SgQr44&index=57&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Carro {
//public final class Carro { // classe não poderá ser extendida
    public static final double VELOCIDADE_FINAL = 250;
    public final Comprador COMPRADOR = new Comprador();
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return comprador;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public final void imprime(){ // método não poderá ser sobreescrito

    }
}
