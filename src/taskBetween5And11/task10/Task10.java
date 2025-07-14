package taskBetween5And11.task10;

import taskBetween5And11.Person;

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
