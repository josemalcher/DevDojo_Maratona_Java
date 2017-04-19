package net.devdojo.javacore.datas;

import java.util.Calendar;
import java.util.Date;

/**
 * Criado por José Stélio Malcher Jr. on 19/04/2017.
 *
 * Curso Java Completo - Aula 84: Datas com Date e Calendar
 * https://www.youtube.com/watch?v=A7dJK1CNxKA&index=85&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {

        Date data  = new Date();
        System.out.println(data);
        //Wed Apr 19 19:29:44 GMT-03:00 2017
        // Pouco suporte para personalização!!

        // Classe mais completa
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario);

        // tratar Date legado!
        calendario.setTime(data);
        System.out.println();

        if(Calendar.SUNDAY == calendario.getFirstDayOfWeek()){
            System.out.println("DOmingo é o primeiro dia da semana ");
        }
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR));

        calendario.add(Calendar.HOUR,2);
        calendario.roll(Calendar.MONTH,2);
        Date dateCalendario = calendario.getTime();
        System.out.println(dateCalendario);







    }
}
