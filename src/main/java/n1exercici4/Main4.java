package n1exercici4;

import java.util.Arrays;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        //Fer la mateixa impressió del punt anterior, però mitjançant method reference.

        List<String> lista = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio"
                ,"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");

        lista.forEach(System.out::println);
    }
}
