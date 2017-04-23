package net.devdojo.javacore.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Criado por José Stélio Malcher Jr. on 23/04/2017.
 *
 * Curso Java Completo - Aula 88: Datas personalizadas com SimpleDateFormat
 * https://www.youtube.com/watch?v=ruc10Zv4F24&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=89
 *
 *  https://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html
 *  http://www.guj.com.br/t/basico-formatar-data-simpledateformat-ou-calendar/73321/4
 *  http://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
 *
 *
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "yyyy.MM.dd G ' as ' HH:mm:ss z ";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

    }
}
