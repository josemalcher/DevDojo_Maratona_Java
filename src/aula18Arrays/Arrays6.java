package aula18Arrays;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net
 *
 * Curso Java Completo - Aula 22: Arrays parte 5
 *https://www.youtube.com/watch?v=Q7IVkwq7LcM&index=23&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Arrays6 {

    public static void main(String[] args) {

        int[] arrInt = {1,2,3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[]{1,2,3};

//        int[][] dias = new int[3][];
//        dias[0] = new int[2];
//        dias[1] = new int[]{1,2,3};
//        dias[2] = new int[4];

        int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};

        //qual o valor da posição [1][2] = 3

        for(int[] arr: dias){
            for(int num : arr){
                System.out.println(num);
            }
        }

    }

}
