package Comparable_Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 22));

        // Sorting using Comparable (by age)
        Collections.sort(people);
        System.out.println("Sorted by age: " + people);

        // Sorting using Comparator (by name)
        Collections.sort(people, new NameComparator());
        System.out.println("Sorted by name: " + people);
    }
}

// Comparable example
class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;  // Sort by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

// Comparator example
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);  // Sort by name
    }
}
