package task29;

import taskBetween5And11.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task29 {
    public static void main(String[] args) {
        List<Person> people = Person.initializePersons();

        Map<String, Map<Character, List<Person>>> map = people.stream()
                .collect(Collectors.groupingBy(
                        person -> person.getAge() >= 18 ? "Old" : "Young",
                        Collectors.groupingBy(
                                person -> person.getName().charAt(0)
                        )
                ));

        map.forEach((ageGroup, nameMap) -> {
            System.out.println(ageGroup + ":");
            nameMap.forEach((initial, persons) -> {
                System.out.println("  " + initial + ": " + persons);
            });
        });
    }
}
