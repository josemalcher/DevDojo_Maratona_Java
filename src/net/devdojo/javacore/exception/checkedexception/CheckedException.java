package net.devdojo.javacore.exception.checkedexception;

import java.io.File;
import java.io.IOException;

/**
 * Criado por José Stélio Malcher Jr. on 08/04/2017.
 *
 * Curso Java Completo - Aula 69: Exceptions: Exceções checked pt 03
 * https://www.youtube.com/watch?v=9xW7o1sIkRE&index=70&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class CheckedException {
    public static void main(String[] args) {
        /*try {

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void criarArquivo() throws IOException{
/*        File file = new File("texto.txt");
        try {
            System.out.println("Arquivo Criado? " + file.createNewFile());
            System.out.println("Arquivo Criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*File file = new File("texto.txt");
        System.out.println("Arquivo Criado? " + file.createNewFile());
        System.out.println("Arquivo Criado com sucesso!");*/

        File file = new File("texto.txt");
        try{
            System.out.println("Arquivo Criado? " + file.createNewFile());
            System.out.println("Arquivo Criado com sucesso!");
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
