package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        //Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.

        List<String> lista = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio"
                ,"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");

        lista.forEach(m -> System.out.println(m));
    }
}
