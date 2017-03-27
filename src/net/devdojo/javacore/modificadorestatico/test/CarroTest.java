package net.devdojo.javacore.modificadorestatico.test;

import net.devdojo.javacore.modificadorestatico.classes.Carro;

/**
 * Criado por José Stélio Malcher Jr. on 27/03/2017.
 *
 * DevDojo
 * Curso Java Completo - Aula 42: Modificador static
 * https://www.youtube.com/watch?v=JFFfIN14oc4&index=43&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class CarroTest {

    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("AUDI", 275);
        Carro c3 = new Carro("Mercedes", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("###############################");

        //c1.setVelocidadeLimite(220);
        Carro.velocidadeLimite = 220;

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
