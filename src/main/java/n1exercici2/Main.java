package n1exercici2;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Pedro","Juan","Miguel","Maria","Nicolasa");
        listOfStringsWithO(lista);
    }
    private static void listOfStringsWithO(List<String> list){
        list.stream()
                .filter (s -> s.toLowerCase().contains("o") &&  s.length() > 5)
                .forEach(s -> System.out.print(s + " "));
    }
}


