package taskBetween5And11.task9;

import taskBetween5And11.Person;

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
