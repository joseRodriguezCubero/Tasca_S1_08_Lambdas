package n1exercici1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pedro","Juan","Miguel","Maria","Nicolasa");
        listOfStringsWithO(list);

    }
    private static void listOfStringsWithO(List<String> list){
        list.stream()
                .filter (s -> s.toLowerCase().contains("o"))
                .forEach(s -> System.out.print(s + " "));
    }
}

