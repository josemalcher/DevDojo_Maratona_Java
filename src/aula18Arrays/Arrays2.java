package aula18Arrays;

/**
 * Criado por José Stélio Malcher Junior em 21/03/2017.
 * www.josemalcher.net
 *
 * Curso Java Completo - Aula 19: Arrays parte 2
 * https://www.youtube.com/watch?v=p5PJuCxlzo4&index=20&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Arrays2 {
    public static void main(String[] args) {

        /*
        Valores de inicialização de arrays
        byte, short, int, long, float, double = 0
        char '\u0000' ''
        boolean false;
        reference null
         */

        String[] nomes = new String[4];

        nomes[0] = "Naruto";
        nomes[1] = "Jose";
        nomes[2]= "Luci";
        nomes[3]= "Maria";

        for (int i = 0; i < nomes.length; i++) {
            //System.out.println(nomes[i]);
            System.out.println((i+1) + " nome " + nomes[i]);
        }

    }
}
