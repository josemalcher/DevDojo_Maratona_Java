package net.devdojo.javacore.exception.checkedexception;

import net.devdojo.javacore.exception.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Criado por José Stélio Malcher Jr. on 10/04/2017.
 * Curso Java Completo - Aula 76: Exceptions e regras para sobrescrita pt 10
 * https://www.youtube.com/watch?v=CxTXrKWXzo4&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=77
 */
public class SobrescritaComExceptionTest {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Pessoa      p = new Pessoa();

     /*   try {
            p.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/
        /*try {
            p.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            p.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
