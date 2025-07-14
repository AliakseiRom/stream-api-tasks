package task16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task16 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "wassup");

        String words = list.stream()
                .collect(Collectors.joining(", "));
        System.out.println(words);
    }
}
