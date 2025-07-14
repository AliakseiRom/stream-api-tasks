package taskBetween5And11.task7;

import taskBetween5And11.Person;

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
