package n1exercici7;

import java.util.ArrayList;

import static java.util.Comparator.*;

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
                .sorted(comparingInt(s -> ((String) s).length()).reversed())
                .forEach(System.out::println);


    }
}

