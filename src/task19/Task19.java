package task19;

import java.util.Arrays;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello",
                "world",
                "longWord",
                "a bit longer srting",
                "bit"
                );

        List<String> filtered = list.stream().
                filter(s -> s.length() > 5).
                toList();
        System.out.println(filtered);
    }
}
