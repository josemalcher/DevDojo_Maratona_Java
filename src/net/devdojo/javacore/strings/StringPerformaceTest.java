package net.devdojo.javacore.strings;

/**
 * Criado por José Stélio Malcher Jr. on 19/04/2017.
 *
 *Curso Java Completo - Aula 82: Performance das Strings
 * https://www.youtube.com/watch?v=3ctBVJQaMWM&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=83
 *
 */
public class StringPerformaceTest {

    public static void main(String[] args) {
        long inicio =  System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo Gasto String: " + (fim - inicio) + " ns");


        long inicioSB =  System.currentTimeMillis();
        concatStringBuilder(300000);
        long fimSB = System.currentTimeMillis();
        System.out.println("Tempo Gasto String Bilder: " + (fimSB - inicioSB) + " ns");

        long inicioSBf =  System.currentTimeMillis();
        concatStringBuffer(300000);
        long fimSBf = System.currentTimeMillis();
        System.out.println("Tempo Gasto String Buffer: " + (fimSBf - inicioSBf) + " ns");

    }

    private static void concatString(int tam){
        String string = "";
        for (int i = 0; i < tam; i++){
            string += i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i < tam; i++){
            sb.append(i);
        }
    }

}

