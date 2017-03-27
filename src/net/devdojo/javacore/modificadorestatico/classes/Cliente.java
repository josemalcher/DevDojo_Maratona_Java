package net.devdojo.javacore.modificadorestatico.classes;

/**
 * Criado por José Stélio Malcher Junior em 24/03/2017.
 * www.josemalcher.net
 * <p>
 * DevDojo
 * Curso Java Completo - Aula 44: Bloco de inicialização
 * https://www.youtube.com/watch?v=QD3_CfitYDU&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=45
 */
public class Cliente {

    /**
     * 0 - Bloco de inicialização é executada quando a JVM carregar a classe, é executada apenas uma vez
     * 1 - Alocado espaço na memoria para cada objeto que será criado
     * 2 - Cada atributo de classe é criado e inicalizado com seus valores Padrões ou valores explicitos
     * 3 - Bloco de inicialização é executado <<--- FOCO DA AULA
     * 4 - O construtor é executado
     */

    private static int[] parcelas;
    {
        System.out.println("BLOCO não ESTATICO");
    }
    static { //com uso do static o bloco é carregado apenas UMA VEZ
        parcelas = new int[20]; //parcelas
        System.out.println("Dentro do BLOCO DE INICIALIZAÇÃO");
        /*for(int parcela : this.parcelas){
            System.out.print(parcela + " - ");
        }*/
        for (int i = 1; i <= 20; i++) {
            parcelas[i - 1] = i;
        }
    }
    static {
        System.out.println("Bloco Statico 2");
    }
    static{
        System.out.println("Bloco Statico 3");
    }

    public Cliente() {
        /*System.out.println("\nDentro do construtor");
        for(int parcela : this.parcelas){
            System.out.print(parcela + " |  ");
        }*/
    }

    public static int[] getParcelas() {
        return parcelas;
    }

/*    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }*/


}
