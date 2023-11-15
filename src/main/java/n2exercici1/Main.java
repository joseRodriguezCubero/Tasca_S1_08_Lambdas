package n2exercici1;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pedro","Juan","Miguel","Maria","Nicolasa","Ana","Antonia");

        list.stream().
                filter(s -> s.startsWith("A") && s.length()==3).
                forEach(System.out::println);
    }
}
