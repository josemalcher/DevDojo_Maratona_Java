package net.devdojo.javacore.associacao.exercicio;

/**
 * Criado por José Stélio Malcher Jr. on 27/03/2017.
 * <p>
 * DevDojo
 * Curso Java Completo - Aula 48: Exercício associação de classes pt 03
 * https://www.youtube.com/watch?v=2blCZZJ3HP4&index=49&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 */
public class Professor {

    private String nome;
    private String especialidade;

    private Seminario[] seminarios;

    private Local local;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /*
    ***********************************************
     */
    public void print() {
        System.out.println("----- Relatório de Professor ------");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade " + this.especialidade);
        if (seminarios != null && seminarios.length != 0) {
            System.out.println("Seminarios participantes ");
            for (Seminario sem : seminarios) {
                System.out.println(sem.getTitulo() + " ");
            }
            return;
        }
        System.out.println("Professor não vinculado a NENHUM SEMINÁRIO");
    }
}
