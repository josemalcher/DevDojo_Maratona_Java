package net.devdojo.javacore.introducaometodos.test;

import net.devdojo.javacore.introducaometodos.classes.Calculadora;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 27: Introdução a métodos
 * https://www.youtube.com/watch?v=GEjFD9qvUVM
 *
 */
public class CalculadoraTest {
    //public static void main(String... args) {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumero();
        System.out.println("---");
        calc.subtraiDoisNumeros();

        System.out.println("----");

        calc.multiplicaDoisNUmeros(5,5);
        System.out.println("----");
        System.out.println(calc.diviteDoisNUmero( 20 , 2));

        System.out.println("----");

        calc.imprimeDoisNUmeroDivididos(20,5);

        System.out.println("Soma dos arrays");
        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);

        System.out.println("Soma por varargs");
        calc.somaVarArgs(1,2,3,4,5);

    }
}
