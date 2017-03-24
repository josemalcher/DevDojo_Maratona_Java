package net.devdojo.javacore.blocodeinicializacao.classes;

/**
 * Criado por José Stélio Malcher Junior em 24/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 41: Blocos de inicialização
 * https://www.youtube.com/watch?v=TB7mzmjP6WI&index=42&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class Cliente {

    /**
     * 1 - Alocado espaço na memoria para cada objeto que será criado
     * 2 - Cada atributo de classe é criado e inicalizado com seus valores Padrões ou valores explicitos
     * 3 - Bloco de inicialização é executado <<--- FOCO DA AULA
     * 4 - O construtor é executado
     *
     */

    private int[] parcelas;
    {
        parcelas = new int[20]; //parcelas
        System.out.println("Dentro do BLOCO DE INICIALIZAÇÃO");
        /*for(int parcela : this.parcelas){
            System.out.print(parcela + " - ");
        }*/
        for(int i = 1 ; i <= 20 ; i++){
            parcelas[i - 1] = i;
        }
    }
    public Cliente() {
        /*System.out.println("\nDentro do construtor");
        for(int parcela : this.parcelas){
            System.out.print(parcela + " |  ");
        }*/
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }




}
