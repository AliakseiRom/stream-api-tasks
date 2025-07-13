package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 7, 2, 6, 4, 9);
        int length = numbers.stream()
                .filter(n -> n > 5)
                .toList()
                .size();
        System.out.println(length);
    }
}
