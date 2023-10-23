package n1exercici8;

public class Main {
    public static void main(String[] args) {
        ReverseString re = s -> String.valueOf(new StringBuilder(s).reverse());
        System.out.println(re.reverse("arroz"));
    }
}
