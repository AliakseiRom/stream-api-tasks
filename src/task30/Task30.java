package task30;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Task30 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "hello",
                "world",
                "other",
                "wod",
                "raaaandom",
                "sm",
                "bit",
                "w"
        );

        String string = strings.stream()
                .filter(s -> s.length() <= 3)
                .map(s -> s.toUpperCase(Locale.ROOT))
                .sorted()
                .collect(Collectors.joining(" | "));

        System.out.println(string);
    }
}
