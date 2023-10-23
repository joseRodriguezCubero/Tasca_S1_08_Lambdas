package n1exercici6;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        ArrayList<Object> lista = new ArrayList<>();
        lista.add(5);
        lista.add("Ana");
        lista.add("Juan");
        lista.add("Zacarias");
        lista.add(53);

        lista.stream()
                .filter(s -> s instanceof String)
                .sorted(Comparator.comparingInt(s -> ((String) s).length()))
                .forEach(System.out::println);


    }
}
