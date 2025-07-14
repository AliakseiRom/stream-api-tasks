package task15;

import taskBetween5And11.Person;

import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        List<Person> people = Person.initializePersons();

        List<Person> result = people.stream()
                .filter(p -> p.getName().startsWith("J") && p.getAge() > 18)
                .toList();
        result.forEach(System.out::println);
    }
}
