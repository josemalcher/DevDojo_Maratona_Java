package net.devdojo.javacore.polimorfismo.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 64: Polimorfismo pt 01
 * https://www.youtube.com/watch?v=Ps2ptq1twyA&index=65&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class RelatorioPagamento {

/*    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("Gerando relatorio para a gerencia");
        gerente.calcularPagamento();
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salario desse mes R$ " + gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendendor){
        System.out.println("Gerando relatorio para a área de vendas");
        vendendor.calcularPagamento();
        System.out.println("Nome: " + vendendor.getNome());
        System.out.println("Salario desse mes R$ " + vendendor.getSalario());
    }*/

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio para a FUNCIONARIO GENERICO");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mes R$ " + funcionario.getSalario());
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario; //cast
            System.out.println("Participação nos lucros "+ g.getPnl());
        }
        if(funcionario instanceof Vendedor){
            //Vendedor v =( Vendedor) funcionario;
            System.out.println("Total de vendas "+ ((Vendedor) funcionario).getTotaoVendas());
        }

    }


}
