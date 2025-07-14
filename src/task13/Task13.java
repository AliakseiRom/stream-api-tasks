package task13;

import taskBetween5And11.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
        List<Person> people = Person.initializePersons();

        Map<String, Integer> nameToAge = people.stream()
                .collect(Collectors.toMap(Person::getName,
                        Person::getAge));

        System.out.println(nameToAge);
    }
}
