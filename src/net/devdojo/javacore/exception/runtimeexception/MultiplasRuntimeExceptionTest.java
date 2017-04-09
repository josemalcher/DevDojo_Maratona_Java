package net.devdojo.javacore.exception.runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

/**
 * Criado por José Stélio Malcher Jr. on 09/04/2017.
 *
 *Curso Java Completo - Aula 72: Tratamento de multiplas exceções pt 06
 * https://www.youtube.com/watch?v=IL0-EWlytzA&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=73
 *
 *
 */
public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {


        /*try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e ){
            System.out.println("Dentro de IllegalArgumentException");
        }catch (ArithmeticException e ){
            System.out.println("Dentro de ArithmeticException");
        }catch (RuntimeException e ){ // mais generico - sempre por ultimo
            System.out.println("Dentro de RuntimeException");
        }*/
        try{
            throw new IndexOutOfBoundsException();
        }catch (IllegalArgumentException | IndexOutOfBoundsException  | RuntimeException e ){
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        }
        System.out.println("FIal do progama");

        /*try {
            telvezLanceException();
        } catch (SQLDataException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            telvezLanceException();
        } catch (SQLDataException | IOException e) {
            e.printStackTrace();
        }

    }

    private static void telvezLanceException() throws SQLDataException, FileNotFoundException{

    }
}
