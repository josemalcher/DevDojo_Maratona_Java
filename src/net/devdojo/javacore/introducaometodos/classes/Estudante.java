package net.devdojo.javacore.introducaometodos.classes;

/**
 * Criado por José Stélio Malcher Junior em 23/03/2017.
 * www.josemalcher.net
 *
 * DeveDojo
 * Curso Java Completo - Aula 35: Exercício sobre métodos
 * https://www.youtube.com/watch?v=Qx4-p5fn_rA&index=36&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(idade < 0){
            System.out.println("Não pode atribuir zero na idade");
            return;
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

/*    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }*/

    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Notas: ");
        if(notas != null) {
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
        }

    }

    public void tirarMedia(){
       if(this.notas == null){
           System.out.println("Aluno não possui notas");
           return;
       }

        double media = 0;

        for(double nota: notas){
            media += nota;
        }
        media = media / this.notas.length;

        if(media > 6){
            this.aprovado = true;
            System.out.println("Aprovado");
        }else{
            this.aprovado = false;
            System.out.println("REPROVADO");
        }
    }

}
