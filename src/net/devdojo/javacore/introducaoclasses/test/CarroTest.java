package net.devdojo.javacore.introducaoclasses.test;

import net.devdojo.javacore.introducaoclasses.classes.Carro;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 25: Introdução a classes parte 2 + exercício
 * https://www.youtube.com/watch?v=Czlx5lQcW50
 *
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.modelo = "Fusca";
        carro1.placa= "123456";
        carro1.velocidadeMaxima = 120f;

        System.out.println(carro1.modelo);
        System.out.println(carro1.placa);
        System.out.println(carro1.velocidadeMaxima);
    }
}
