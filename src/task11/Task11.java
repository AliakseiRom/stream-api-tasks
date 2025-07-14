package task11;

import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));

        List<Integer> flatList = list.stream()
                .flatMap(List::stream)
                .toList();

        flatList.forEach(System.out::println);
    }
}
