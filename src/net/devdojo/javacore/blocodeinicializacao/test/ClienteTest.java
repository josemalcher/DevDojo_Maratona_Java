package net.devdojo.javacore.blocodeinicializacao.test;

import net.devdojo.javacore.blocodeinicializacao.classes.Cliente;

/**
 * Criado por José Stélio Malcher Junior em 24/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 41: Blocos de inicialização
 * https://www.youtube.com/watch?v=TB7mzmjP6WI&index=42&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente();

        System.out.println("Exibindo as parcelas");
        for(int parcela : cliente01.getParcelas()){
            System.out.print(parcela + " ");
        }

    }
}
