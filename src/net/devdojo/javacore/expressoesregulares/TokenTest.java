package net.devdojo.javacore.expressoesregulares;

/**
 * Criado por José Stélio Malcher Jr. on 24/05/2017.
 */
public class TokenTest {
    public static void main(String[] args) {
        String str = "jose, maria, joão, camila, rafaella, jorge";
        String[] token = str.split(",");
        // String[] token = str.split("\\d");
        for (String arr : token){
            System.out.println(arr.trim());
        }
    }
}
