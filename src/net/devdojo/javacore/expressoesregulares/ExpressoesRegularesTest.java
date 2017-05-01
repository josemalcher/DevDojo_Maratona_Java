package net.devdojo.javacore.expressoesregulares;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Criado por José Stélio Malcher Jr. on 01/05/2017.
 *
 * Curso Java Completo - Aula 89: Expressões regulares pt 01
 * Curso Java Completo - Aula 90: Expressões regulares pt 02
 * https://www.youtube.com/watch?v=-Pmnb_no1bQ&index=90&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
 *
 */
public class ExpressoesRegularesTest {
    public static void main(String[] args) {

        /**
         *  \d - todos os digitos
         *  \D - Tudo o que não for digito (@#abc...)
         *  \s - Espaços em branco \t \n \f \r
         *  \S - Caracteres que não é branco
         *  \w - Caracteres de palavras a-z A-Z digitos e _
         *  \W - tudo que não for caractere de palavra
         */

        //String regex = "ab";
        String regex = "\\d";
        String texto = "@#123ababab";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressao: "+matcher.pattern());
        System.out.println("Posicoes encontradas ");

        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }


    }
}
