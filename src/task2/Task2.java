package task2;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upperCaseWords = words.stream()
                .map(word -> word.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());

        upperCaseWords.forEach(System.out::println);
    }
}
