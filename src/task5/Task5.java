package task5;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, 0, 1, 2, 6, 7, 2, 6, 4, 9);
        List<Integer> posNums = numbers.stream()
                .filter(n -> n < 0)
                .toList();
        if (!posNums.isEmpty()) {
            System.out.println("There are negative numbers!");
        } else {
            System.out.println("There are only positive numbers!");
        }
    }
}
