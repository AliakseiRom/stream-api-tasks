package task23;

import java.util.*;

public class Task23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 2, 23, -3, -5, 6, 7, 8, 9, 10);

        OptionalInt value1 = numbers.stream()
                .mapToInt(n -> n)
                .max();

        Optional<Integer> value2 = numbers.stream()
                .min(Comparator.naturalOrder());

        System.out.println(value1.getAsInt());
        System.out.println(value2.get());
    }
}
