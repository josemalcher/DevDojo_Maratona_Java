package net.devdojo.javacore.datas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Criado por José Stélio Malcher Jr. on 22/04/2017.
 *
 * Curso Java Completo - Aula 87: Formatação de números e moeda com NumberFormat
 * https://www.youtube.com/watch?v=xACEG97W8p0&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=88
 *
 */
public class NumberFormatTest {
    public static void main(String[] args) {

       float valor = 112345.1234f;

       Locale locJP = new Locale("jp");
       Locale locFR = new Locale("fr");
       Locale locIT = new Locale("it");

       NumberFormat[] nfa = new NumberFormat[4];

       nfa[0] = NumberFormat.getInstance();
       nfa[1] = NumberFormat.getInstance(locIT);
       nfa[2] = NumberFormat.getCurrencyInstance();
       nfa[3] = NumberFormat.getCurrencyInstance(locIT);

       for(NumberFormat nf : nfa){
           System.out.println(nf.format(valor));
       }

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(valor));

        System.out.println("###################");

        String valorString = "12345,1234";
        try {
            System.out.println(nf.parse(valorString));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
