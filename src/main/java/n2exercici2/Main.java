package n2exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Main {
    //Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers.
    // Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o” si el nombre és imparell.
    // Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”.
    // Imprimeix el resultat.
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,42,32,7,89,41,36);

        Function<List<Integer>,String> f1 = f -> {

                     f.stream()
                             .map((n -> (n % 2 == 0 ? "e" : "o") + n))
                             .collect(Collectors.joining(" ,")return f;
        };
    }

public static String catalogInts(Function<List, String > f1){
    return f1.apply();
}
}
