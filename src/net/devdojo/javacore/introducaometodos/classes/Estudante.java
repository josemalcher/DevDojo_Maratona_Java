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

    public String nome;
    public int idade;
    public double[] notas;

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
       if(notas == null){
           System.out.println("Aluno não possui notas");
           return;
       }

        double media = 0;

        for(double nota: notas){
            media += nota;
        }
        media = media / notas.length;

        if(media > 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("REPROVADO");
        }
    }

}
