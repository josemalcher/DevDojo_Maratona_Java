package net.devdojo.javacore.polimorfismo.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 */
public class Gerente extends Funcionario {

    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + pnl;
    }
}
