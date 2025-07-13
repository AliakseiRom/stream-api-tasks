package taskAfter6.task8;

import taskAfter6.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<Person> people = Person.initializePersons();

        Map<Integer, List<Person>> groupedPeople = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        groupedPeople.forEach((age, persons) -> {
            System.out.println("Age " + age + ": " + persons);
        });
    }
}
