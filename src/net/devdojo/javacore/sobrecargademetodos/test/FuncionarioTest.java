package net.devdojo.javacore.sobrecargademetodos.test;

import net.devdojo.javacore.sobrecargademetodos.classes.Funcionario;

/**
 * Criado por José Stélio Malcher Junior em 24/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 38: Sobrecarga de métodos
 * https://www.youtube.com/watch?v=uq4O__CGPdo&index=39&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        /*
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("José Malcher Junior");
        funcionario01.setCpf("123.123.123.55");
        funcionario01.setSalario(45000);
        */
        Funcionario funcionario01 = new Funcionario();
        //funcionario01.init("José Malcher","123.123.123.55", 4500);
        funcionario01.imprime();

        Funcionario funcionario02 = new Funcionario("José Malcher","123.123.123.55", 4500,"44578");
        funcionario02.imprime();

    }
}
