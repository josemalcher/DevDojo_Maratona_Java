package net.devdojo.javacore.associacao.exercicio;

/**
 * Criado por José Stélio Malcher Jr. on 27/03/2017.
 *
 * DevDojo
 * Curso Java Completo - Aula 48: Exercício associação de classes pt 03
 * https://www.youtube.com/watch?v=2blCZZJ3HP4&index=49&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class Aluno {

    private String nome;
    private int idade;

    private Seminario seminario;

    public Aluno(){
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*
    *******************************************
     */

    public void print(){
        System.out.println("----- Relatório de Alunos ------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade "+ this.idade);
        if(this.seminario != null) {
            System.out.println("Seminário Inscrito " + this.seminario.getTitulo());
        }else {
            System.out.println("Não há incrição em nenhum seminário");
        }
    }


}
