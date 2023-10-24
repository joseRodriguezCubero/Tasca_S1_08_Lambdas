package n2exercici4;

import java.util.*;
import java.util.stream.Stream;


import static java.util.Collections.replaceAll;

public class Main {
    public static void main(String[] args) {
        //Crea una llista que contingui algunes cadenes de text i nombres.
        //
        //Ordena-les per:
        //Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter)
        //Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.
        //Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
        //Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).

        List<String> list = Arrays.asList("Pedro","Juan","5","Miguel","Maria","Nicolasa","Eusebio","48","53","36");

        System.out.println("Imprimiendo la lista según los criterios de ordenación.");

        list.stream()
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .sorted(Comparator.comparingInt(s -> s.contains("e") ? 0 : 1))
                .forEach(s -> System.out.println(s.replaceAll("a","4")));


        System.out.println("Imprimiendo solo numeros.");

        list.stream()
                .filter(s -> s.matches("\\d+"))
                .forEach(System.out::println);





    }
}
