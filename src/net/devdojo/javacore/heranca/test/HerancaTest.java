package net.devdojo.javacore.heranca.test;

import net.devdojo.javacore.heranca.classes.Endereco;
import net.devdojo.javacore.heranca.classes.Funcionario;
import net.devdojo.javacore.heranca.classes.Pessoa;

/**
 * Criado por José Stélio Malcher Jr. on 28/03/2017.
 * <p>
 * DevDojo
 * Curso Java Completo - Aula 50: Herança pt 01
 * https://www.youtube.com/watch?v=rN5IgvISCsQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=51
 */
public class HerancaTest {
/**
 *  1) Espaço em memória é alocado para o objeto sendo contruído;
 *  2) Cada um dos atributos do objeto é criado e inicializado com seus valores Default;
 *  3) O construtor da superclasse é chamado.
 *  4) A inicialização dos atributos via declaração e o código de inicialização da superclasse
 *      são executados na ordem que aparecem;
 *  5) O código do contrutor da superclasse é chamdo;
 *  6) Passo 4 para a superclasse é executado;
 *  7) O código do construtor da classe é executado.
 */
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        Endereco ende01 = new Endereco();

        pessoa01.setNome("José");
        pessoa01.setCpf("123.123.123-88");

        ende01.setBairro("Bairro 01");
        ende01.setRua("Rua 10");

        pessoa01.setEndereco(ende01);

        pessoa01.imprime();
        System.out.println("*************************");

        Funcionario func = new Funcionario("Augusto");
        //func.setNome("Augusto");
        func.setCpf("32165498788");
        func.setSalario(15000);
        func.setEndereco(ende01);
        func.imprime();

    }

}
