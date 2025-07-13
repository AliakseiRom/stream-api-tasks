package taskAfter6.task10;

import taskAfter6.Person;

import java.util.List;
import java.util.OptionalDouble;

public class Task10 {
    public static void main(String[] args) {
        List<Person> people = Person.initializePersons();

        OptionalDouble average = people.stream()
                .mapToInt(p -> p.getAge())
                .average();

        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }
    }
}
