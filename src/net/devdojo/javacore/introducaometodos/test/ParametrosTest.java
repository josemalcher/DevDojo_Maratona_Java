package net.devdojo.javacore.introducaometodos.test;

import net.devdojo.javacore.introducaometodos.classes.Calculadora;

/**
 * Criado por José Stélio Malcher Junior em 23/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 31: Métodos com parâmetros tipo reference pt 01
 * https://www.youtube.com/watch?v=WHd3PRcFbQw&index=32&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class ParametrosTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;

        //passando uma copia dos valores acima - tipos primitivos
        calc.alteraDoisNumero(num1, num2);

        System.out.println("Dentro do teste");
        System.out.println("num1 "+ num1);
        System.out.println("num2 "+ num2);
    }
}
