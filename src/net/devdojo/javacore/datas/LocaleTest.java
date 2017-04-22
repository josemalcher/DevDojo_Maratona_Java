package net.devdojo.javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Criado por José Stélio Malcher Jr. on 22/04/2017.
 *
 * Curso Java Completo - Aula 86: Internacionalização com a classe Locale
 * https://www.youtube.com/watch?v=UZC14RpxdmQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=87
 *
 *
 * Outros
 * https://pt.stackoverflow.com/questions/5390/o-que-%C3%A9-preciso-para-um-sistema-dar-suporte-a-um-locale
 *
 */
public class LocaleTest {
    public static void main(String[] args) {

        //ISO 639 pt=portugues - BR-Brasil
        Locale locale = new Locale("pt", "BR");
        Locale locale2 = new Locale("it", "CH");

        Calendar c = Calendar.getInstance();
       // c.set(2015, Calendar.DECEMBER, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);

        System.out.println(df.format(c.getTime()));
        System.out.println(locale.getDisplayCountry());

    }
}
