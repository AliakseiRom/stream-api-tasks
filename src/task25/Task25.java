package task25;

import java.util.stream.IntStream;

public class Task25 {
    public static void main(String[] args) {
        int number = 5;

        System.out.println(IntStream.rangeClosed(2, number)
                .reduce(1, (a, b) -> a * b));
    }
}
