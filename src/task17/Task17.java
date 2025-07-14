package task17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "longWord", "a bit longer srting");
        String maxLengthString = list.stream()
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(maxLengthString);
    }
}
