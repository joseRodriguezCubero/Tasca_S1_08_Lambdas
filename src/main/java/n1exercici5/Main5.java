package n1exercici5;

public class Main5 {
    public static void main(String[] args) {
        //Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double.
        // Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415.
        // Invoca el mètode getPiValue() i imprimeix el resultat.

       PiValue pi = () -> 3.1416;

        System.out.println(pi.getPiValue());
    }
}
