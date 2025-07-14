package taskBetween5And11;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Person> initializePersons() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Roma", 18));
        persons.add(new Person("Mary", 22));
        persons.add(new Person("John", 23));
        persons.add(new Person("Jane", 16));
        persons.add(new Person("Bob", 17));
        persons.add(new Person("Jack", 12));
        return persons;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
