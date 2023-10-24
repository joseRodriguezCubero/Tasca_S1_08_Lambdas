package n2exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 42, 32, 7, 89, 41, 36);

        System.out.println(orderingPairs(list));
    }
        public static String orderingPairs(List<Integer> list) {

        return list.stream()
                             .map(n -> (n% 2 == 0 ? "e" : "o") + n)
                             .collect(Collectors.joining(" ,"));
        }
    }





