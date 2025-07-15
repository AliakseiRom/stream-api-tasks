package task21;

import java.util.Arrays;
import java.util.List;

public class Task21 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sum = numbers.stream()
                .mapToInt(n -> n*n)
                .sum();
        System.out.println(sum);
    }
}
