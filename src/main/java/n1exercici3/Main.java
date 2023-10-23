package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio"
                ,"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");

        lista.forEach(m -> System.out.println(m));
    }
}
