package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Pedro","Juan","Miguel","Maria","Nicolasa");

        var list2 = listOfStringsWithO(lista, p -> p.contains("o"));

        for (String s: list2) {
            System.out.println(s);
        }

    }
    private static List<String> listOfStringsWithO(List<String> list, Predicate<String> predicate){
        List<String> list2 = new ArrayList<>();
        for (String s:list) {
            if (predicate.test(s)) {
                list2.add(s);
            }
        }
       return list2;
    }
}
