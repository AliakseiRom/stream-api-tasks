package taskAfter6.task6;

import taskAfter6.Person;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Person> people = Person.initializePersons();

        List<Person> peopleOlderThan18 = people.stream()
                .filter(person -> person.getAge() > 18)
                .toList();

        peopleOlderThan18.forEach(System.out::println);
    }
}
