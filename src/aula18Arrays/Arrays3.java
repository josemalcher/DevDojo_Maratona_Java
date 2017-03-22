package aula18Arrays;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net
 *
 * Curso Java Completo - Aula 19: Arrays parte 3
 * https://www.youtube.com/watch?v=9zfJqV9TbYQ&index=21&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 *
 */
public class Arrays3 {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        int[] numeors2 = {1,2,3,4,5};//tem 5, inden de 0 até 4
        int[] numeros3 = new int[]{1,2,3,4,5};

        //int i = 0;
        for(int i = 0 ; i < numeors2.length ; i ++){
            System.out.println(numeors2[i]);
        }

        for (int num : numeors2) {
            System.out.println(num);
        }

    }
}
