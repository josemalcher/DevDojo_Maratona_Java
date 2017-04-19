package net.devdojo.javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Criado por José Stélio Malcher Jr. on 19/04/2017.
 *
 *Curso Java Completo - Aula 85: Formatação de datas com DateFormat
 * https://www.youtube.com/watch?v=Fmwg6ECNVXI&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=86
 *
 */
public class DateFormatTest {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[6];
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df : dfa){
            System.out.println(df.format(c.getTime()));
        }

    }
}
