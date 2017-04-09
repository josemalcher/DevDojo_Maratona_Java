package net.devdojo.javacore.exception.checkedexception;

import java.io.*;

/**
 * Criado por José Stélio Malcher Jr. on 09/04/2017.
 * <p>
 * Curso Java Completo - Aula 74 : Exceptions: try-with-resources pt 08
 * https://www.youtube.com/watch?v=Medf33blG4M&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=75
 */
public class TryWithResourcesTest {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("texto.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void lerArquivoOld() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("texto.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
