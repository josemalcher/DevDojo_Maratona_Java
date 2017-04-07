package net.devdojo.javacore.polimorfismo.teste;

import net.devdojo.javacore.polimorfismo.classes.Funcionario;
import net.devdojo.javacore.polimorfismo.classes.Gerente;
import net.devdojo.javacore.polimorfismo.classes.RelatorioPagamento;
import net.devdojo.javacore.polimorfismo.classes.Vendedor;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * https://www.youtube.com/watch?v=Ps2ptq1twyA&index=65&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class PolimorfismoTeste {

    public static void main(String[] args) {
        Gerente g = new Gerente("MARIO" , 5000, 2000);
        Vendedor v = new Vendedor("JOSE", 2000, 20000);

        RelatorioPagamento relatorio = new RelatorioPagamento();
        //relatorio.relatorioPagamentoGerente(g);
        //System.out.println("--------------------------");
        //relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("-----------------------");
        relatorio.relatorioPagamentoGenerico(v);

        Funcionario f = g;
        System.out.println("----------");
        System.out.println(g.getSalario());
    }


}
