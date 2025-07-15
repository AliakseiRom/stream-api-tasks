package task22;

import java.util.Arrays;
import java.util.List;

public class Task22 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer multiply = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(multiply);
    }
}
