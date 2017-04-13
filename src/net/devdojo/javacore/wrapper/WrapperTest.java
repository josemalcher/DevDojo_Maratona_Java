package net.devdojo.javacore.wrapper;

/**
 * Criado por José Stélio Malcher Jr. on 10/04/2017.
 *
 * Curso Java Completo - Aula 78: Classes Wrapper pt 01
 * https://www.youtube.com/watch?v=MBm7iyYt6NQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=79
 *
 *
 */
public class WrapperTest {
    public static void main(String[] args) {
        // 8 tipos primitivos
        byte bytePrimitivo = 1;
        short shotPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo  = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booblean = true;

        //Wrapper's
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = new Integer("10");
        Long longWrapper = 10L;
        Long longgWrapper = Long.valueOf("10");
        Float floatWrapper = new Float("10");
        Double doublewrapper = 10D;
        Character characterWrapper = new Character('A');
        Boolean boobleanWrapper = new Boolean("trUE");

        //System.out.println(boobleanWrapper); // true

        String valor = "10";
        Float f = Float.parseFloat(valor);
        //System.out.println(f);

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('i'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.isUpperCase('a'));

    }
}
