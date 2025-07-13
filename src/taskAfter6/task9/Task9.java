package taskAfter6.task9;

import taskAfter6.Person;

import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Person> people = Person.initializePersons();

        List<String> names = people.stream()
                .map(Person::getName)
                .toList();

        names.forEach(System.out::println);
    }
}
