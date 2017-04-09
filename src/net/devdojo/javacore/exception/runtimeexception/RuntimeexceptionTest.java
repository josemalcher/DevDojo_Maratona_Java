package net.devdojo.javacore.exception.runtimeexception;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 * <p>
 * <p>
 * Curso Java Completo - Aula 68: Exceptions pt 02
 * https://www.youtube.com/watch?v=eZCGf_lTx0E&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=69
 */
public class RuntimeexceptionTest {
    public static void main(String[] args) {
/*
        int a = 10;
        int b = 0;
        if (b != 0) {
            int c = a / b;
            System.out.println(a);
        }

        //Object o = null;
        //System.out.println(o.toString());
        //java.lang.NullPointerException
        try {
            int[] ar = new int[2];
            System.out.println(ar[2]);
            //java.lang.ArrayIndexOutOfBoundsException: 2
            System.out.println("Imprimindo depois da possível excecao");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Fora do Bloco catch");*/

        try {
            divisao(10, 0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void divisao(int num1, int num2) {
        if( num2 == 0){
            throw new IllegalArgumentException("Passe um valor diferente de zero");
        }
        int result = num1 / num2;
        System.out.println(result);
    }
}
