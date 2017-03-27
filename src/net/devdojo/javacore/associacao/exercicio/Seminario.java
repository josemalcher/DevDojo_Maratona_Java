package net.devdojo.javacore.associacao.exercicio;

/**
 * Criado por José Stélio Malcher Jr. on 27/03/2017.
 * DevDojo
 * Curso Java Completo - Aula 48: Exercício associação de classes pt 03
 * https://www.youtube.com/watch?v=2blCZZJ3HP4&index=49&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class Seminario {

    private String titulo;

    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /*
    *************************************************************
     */

    public void print() {
        System.out.println("----- Relatório de Seminário ------");
        System.out.println("Título " + this.titulo);
        System.out.println("Professor Palestrante " + this.professor.getNome());
        if (this.local != null) {
            System.out.println("Local, rua " + this.local.getRua() + " Bairro " + this.local.getBairro());
        }
        if (this.alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes ");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno foi passado");
    }
}
