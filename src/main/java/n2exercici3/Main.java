package n2exercici3;

public class Main {
    public static void main(String[] args) {

        Operacion add = (a, b) -> (float) (a + b);
        Operacion minus = (a, b) -> (float) (a - b);
        Operacion multipli = (a, b) -> (float) (a * b);
        Operacion divide = (a, b) -> (float) (a / b);

        System.out.println("Suma: " + add.operacio(5, 3));
        System.out.println("Resta: " + minus.operacio(5, 3));
        System.out.println("Multiplicación: " + multipli.operacio(5, 3));
        System.out.println("División: " + divide.operacio(5, 3));
    }
}



