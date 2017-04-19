package net.devdojo.javacore.strings;

/**
 * Criado por José Stélio Malcher Jr. on 19/04/2017.
 *
 *Curso Java Completo - Aula 83: StringBuilder and StringBuffer
 * https://www.youtube.com/watch?v=QY92U86m77s&index=84&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class StringBilderTest {
    public static void main(String[] args) {

        String s = "Uma Frase em String";

        StringBuilder sb = new StringBuilder(16);
        sb.append("Uma frase StrngBuilder 1 2 3 4 5 6 7 8 9 0 10");
        //s = sb.toString();
        sb.append("0123456789");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,4));
        System.out.println(sb.insert(2," #### "));

        sb.append("def").insert(3," *** ").reverse().delete(2,4);
        System.out.println(sb);

    }
}
