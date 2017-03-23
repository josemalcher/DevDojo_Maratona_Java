package net.devdojo.javacore.introducaometodos.classes;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 27: Introdução a métodos
 * https://www.youtube.com/watch?v=GEjFD9qvUVM
 *
 */
public class Calculadora {
    public void somaDoisNumero(){
        System.out.println(5+5);
    }
    public void subtraiDoisNumeros(){
        System.out.println(10-8);
    }

    public void multiplicaDoisNUmeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double diviteDoisNUmero(double num1, double num2){
        if( num2 != 0 )
            return num1 / num2;
        return 0;
    }

    public void imprimeDoisNUmeroDivididos(double num1, double num2){
        if(num2 != 0){
            System.out.println(num1 / num2);
            return; //somente com métodos void -
        }
        System.out.println("Não é possível dividir por zero");
    }

    public void alteraDoisNumero(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois numero ");
        System.out.println("num1 " + num1 );
        System.out.println("num2 " + num2 );
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //public void somaVarArgs(double valorDouble, int... numeros){
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }




}
