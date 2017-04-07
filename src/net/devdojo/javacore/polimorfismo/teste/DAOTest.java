package net.devdojo.javacore.polimorfismo.teste;

import net.devdojo.javacore.polimorfismo.classes.ArquivoDAOImple;
import net.devdojo.javacore.polimorfismo.classes.DatabaseDAOImple;
import net.devdojo.javacore.polimorfismo.classes.GenericDAO;

/**
 * Criado por José Stélio Malcher Jr. on 07/04/2017.
 *
 * Curso Java Completo - Aula 66: Polimorfismo pt 03
 * https://www.youtube.com/watch?v=PMFxgfqYYuE&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=67
 *
 */
public class DAOTest {
    public static void main(String[] args) {
        //ArquivoDAOImple arquivoDAO = new ArquivoDAOImple();

        //GenericDAO aquivoDAO = new DatabaseDAOImple();
        GenericDAO aquivoDAO = new ArquivoDAOImple();
        aquivoDAO.save();
    }
}
