package task4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, 0, 1, 2, 6, 7, 2, 6, 4, 9);
        Optional<Integer> a = numbers.stream()
                .filter(n -> n > 3)
                .findFirst();

        System.out.println(a);
    }
}
