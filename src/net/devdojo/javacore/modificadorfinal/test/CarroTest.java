package net.devdojo.javacore.modificadorfinal.test;

import net.devdojo.javacore.modificadorfinal.classe.Carro;

/**
 * Criado por José Stélio Malcher Jr. on 02/04/2017.
 *
 * Curso Java Completo - Aula 56: Modificador Final
 * https://www.youtube.com/watch?v=_jmR8SgQr44&index=57&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        //c.VELOCIDADE_FINAL = 260; //dará erro!
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());

        //c.comprador = new Comprador(); // não é possível, somente alterar os valores dentro do objeto
    }
}
