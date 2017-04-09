package net.devdojo.javacore.exception.checkedexception;

/**
 * Criado por José Stélio Malcher Jr. on 09/04/2017.
 *
 * Curso Java Completo - Aula 74 : Exceptions: try-with-resources pt 08
 * https://www.youtube.com/watch?v=Medf33blG4M&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=75
 *
 */
public class LeitorTest {
    public static void main(String[] args) {

        lerArquivoLeitor();


    }

    public static void lerArquivoLeitor(){
        try(Leitor1 leitor1 = new Leitor1() ;
            Leitor2 leitor2 = new Leitor2()){

        }catch (Exception e){
                e.printStackTrace();
        }
    }
}
