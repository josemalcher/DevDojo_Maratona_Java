package net.devdojo.javacore.assertions;

/**
 * Criado por José Stélio Malcher Jr. on 10/04/2017.
 *
 * Curso Java Completo - Aula 77: Assertivas
 * https://www.youtube.com/watch?v=kd8L6jS8C3Q&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=78
 *
 */
public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(2000);
    }

    private static void calculaSalario(double salario) {

        /*if(salario > 0){
            //fazer o calculo com salario
        }else{
            System.out.println("PROBLEMA AO CALCULAR SALARIO");
        }*/

        //vem desabilitado | p ativar: vm option = -ea  | -da para desabilitar
        // Para habilitar para um pacote: -ea:br.com.abc.NomeTalNOmeClasse
        assert (salario > 0): "O salario Não deve ser menor do que zero";
        //sempre usar em private

    }

}
