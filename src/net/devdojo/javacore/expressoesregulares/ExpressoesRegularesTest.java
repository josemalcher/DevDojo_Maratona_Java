package net.devdojo.javacore.expressoesregulares;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Criado por José Stélio Malcher Jr. on 01/05/2017.
 *
 * Curso Java Completo - Aula 89: Expressões regulares pt 01
 * Curso Java Completo - Aula 90: Expressões regulares pt 02
 * Curso Java Completo - Aula 91: Expressões regulares pt 03
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
         *  []
         *
         *  Quantificadores
         *  ? - zero ou uma
         *  * - zero ou mais
         *  + - uma ou mais
         *  {n,m} - de n até m
         *  () - agrupar
         *  | - ou
         *  $ - fim da linha
         *
         *  o(v | c)0 = ovo, oco
         *
         *  . - coringa : 1.3 = 123,133,1A3, 1#3. 1 3
         *  ^ - negação : [^abc]
         *
         */

        //String regex = "ab";
        //String regex = "\\d";
        //String regex = "[abcABC]";
        //int numeroHex = 0x100F;
        //String regex = "0[xX][0-9afA-F]+(\\s|$)";
        //String texto = "cafeBARE@#123abcababab";
        //String texto = "12 0x 0x 0xFFABC 0x10G 0x1";

        //String regex = "([a-zA-Z0-9\\._-])+@([a-z-A-Z])+(\\.([a-zA-Z])+)+";
        //String regex = "([\\w\\.])+@([a-z-A-Z])+(\\.([a-zA-Z])+)+";
        //String texto = "fulano@hotmail.com, 123Abc@gmail.com, #@!abra@gmail.com, teste@gmail";
        //Validar
        //System.out.println("Email Válido: " + "#@!abra@gmail.com".matches(regex));

//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2014 05/12/17 1/1/1 222/333/2222";
        String regex = "proj([^,])*";
        String texto = "proj1.txt proj2.bkp proj123, traba, arquiv, ";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressao: "+matcher.pattern());
        System.out.println("Posicoes encontradas ");

        while(matcher.find()){
            System.out.println(matcher.start() + " "+ matcher.group());
        }
        //System.out.println("");
        //System.out.println(numeroHex); // 256


    }
}
