package aula18Arrays;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net
 * Curso Java Completo - Aula 21: Arrays parte 4
 * https://www.youtube.com/watch?v=WFAJyBgPqSI&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=22
 *
 */
public class Arrays5 {

    public static void main(String[] args) {

        int[][] dias = new int[2][2];

        dias[0][0] = 30;
        dias[0][1] = 20;

        dias[1][0] = 10;
        dias[1][1] = 33;

        for(int i = 0 ; i < dias.length ; i++){
            System.out.println(dias[i]);

            for(int j = 0 ; j < dias[i].length ; j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("");

        for(int[] ref : dias){
            System.out.println(ref);
            for(int dia : ref){
                System.out.println(dia);
            }
        }

    }

}
