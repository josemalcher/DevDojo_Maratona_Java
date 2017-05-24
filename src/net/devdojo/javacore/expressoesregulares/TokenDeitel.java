package net.devdojo.javacore.expressoesregulares;

import java.util.Scanner;

/**
 * Criado por José Stélio Malcher Jr. on 24/05/2017.
 */
public class TokenDeitel {
    public static void main(String[] args) {
        //Obtem a frase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String setence = scanner.nextLine();

        //processa a frase do usuário
        String[] tokem = setence.split(" ");
        System.out.printf("Numero de elementos: %d%nOs tokens são %n", tokem.length);
        for(String tok : tokem){
            System.out.println(tok);
        }
    }
}
