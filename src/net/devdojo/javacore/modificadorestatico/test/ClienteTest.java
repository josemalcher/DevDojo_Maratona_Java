package net.devdojo.javacore.modificadorestatico.test;


import net.devdojo.javacore.modificadorestatico.classes.Cliente;

/**
 * Criado por José Stélio Malcher Junior em 24/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 44: Bloco de inicialização
 * https://www.youtube.com/watch?v=QD3_CfitYDU&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=45
 *
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente();
        Cliente cliente02 = new Cliente();
        Cliente cliente03 = new Cliente();

        System.out.println("Exibindo as parcelas");
        /*for(int parcela : cliente01.getParcelas()){
            System.out.print(parcela + " ");
        }*/

        System.out.println("Tamanho " + Cliente.getParcelas().length);

    }

}

