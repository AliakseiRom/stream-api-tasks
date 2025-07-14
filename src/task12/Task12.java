package task12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "hello",
                "world",
                "hello",
                "lesha",
                "loh"
        );

        List<String> list2 = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();

        list2.forEach(System.out::println);
    }
}
