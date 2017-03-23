package net.devdojo.javacore.introducaometodos.classes;

/**
 * Criado por José Stélio Malcher Junior em 22/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 31: Métodos com parâmetros tipo reference pt 01
 * https://www.youtube.com/watch?v=WHd3PRcFbQw&index=32&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class Professor {

    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("CPF: "+this.cpf);
        System.out.println("RG: "+this.rg);
    }

}
