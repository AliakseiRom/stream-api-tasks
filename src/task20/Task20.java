package task20;

import java.util.Arrays;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "longWord", "a bit longer srting");

        List<String> list2 = list.stream()
                .map(s -> String.valueOf(s.charAt(0)))
                .toList();
        System.out.println(list2);
    }
}
