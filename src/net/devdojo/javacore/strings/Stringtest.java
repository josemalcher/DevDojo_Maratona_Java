package net.devdojo.javacore.strings;

/**
 * Criado por José Stélio Malcher Jr. on 13/04/2017.
 *
 * Curso Java Completo - Aula 80: String pt 01
 * https://www.youtube.com/watch?v=n0B_KA3DHHg&index=81&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Stringtest {
    public static void main(String[] args) {
        String nome = "JOSE";
        //String sobrenome = new String("Malcher");
        //System.out.println(nome + sobrenome);
        nome = nome.concat(" MALCHER");

        String nome2 = "Katarina";
        String nome3 = new String("Maria");
        //1 variavel de referencia, 2 - um objeto do tipo string, 3 - uma string no pool de string

        //System.out.println(nome.concat(" MALCHER"));



    }
}
