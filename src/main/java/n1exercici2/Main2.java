package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        //Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista
        // amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.


        List<String> lista = Arrays.asList("Pedro","Juan","Miguel","Maria","Nicolasa");

        Predicate<String> p1 = s-> s.contains("o") && (s.length() == 5);
        var list2 = listOfStringsWithO(lista, p1= s-> s.contains("o") && (s.length() > 5));

        for (String s: list2) {
            System.out.println(s);
        }
    }
    private static List<String> listOfStringsWithO(List<String> list, Predicate<String> p1){
        List<String> list2 = new ArrayList<>();
        for (String s:list) {
            if (p1.test(s)) {
                list2.add(s);
            }
        }
        return list2;
    }
}

