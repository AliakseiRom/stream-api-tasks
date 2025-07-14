package task18;

import java.util.Arrays;
import java.util.List;

public class Task18 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "longWord", "a bit longer srting");

        int sum = list.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
    }
}
