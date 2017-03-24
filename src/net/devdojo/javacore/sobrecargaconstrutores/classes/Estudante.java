package net.devdojo.javacore.sobrecargaconstrutores.classes;

/**
 * Criado por José Stélio Malcher Junior em 24/03/2017.
 * www.josemalcher.net
 *
 * DevDojo
 * Curso Java Completo - Aula 40: Construtores e sobrecarga de construtores pt 02
 * https://www.youtube.com/watch?v=RufTevo0S0M&index=41&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Estudante {
    private String nome;
    private String matricula;
    private double[] notas;
    private String dataMatricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Estudante() {
        System.out.println("contrutor Padrão");
    }

    public Estudante(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

 /*   public void init(String nome, String matricula, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }*/
    public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {
        this(nome,matricula,notas);
        this.dataMatricula = dataMatricula;
    }

    /************************/

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: "+matricula);
        for (double nota : notas){
            System.out.print(nota + " ");
        }
        System.out.println("\nData Matricula: "+dataMatricula);

    }
}
