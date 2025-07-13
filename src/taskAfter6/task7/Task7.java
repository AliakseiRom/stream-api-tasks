package taskAfter6.task7;

import taskAfter6.Person;

import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Person> people = Person.initializePersons();

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .toList();
        sortedPeople.forEach(System.out::println);
    }
}
