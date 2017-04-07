package net.devdojo.javacore.polimorfismo.classes;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 66: Polimorfismo pt 03
 * https://www.youtube.com/watch?v=PMFxgfqYYuE&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=67
 *
 */
public class DatabaseDAOImple implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
