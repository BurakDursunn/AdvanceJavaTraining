package OverridingEquals_HashCode_toString;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Person -> name='" + name + "', age=" + age + "";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Dominic", 35);
        Person p2 = new Person("Dominic", 35);
        System.out.println(p1.equals(p2));  // true
        System.out.println(p1.hashCode() == p2.hashCode());  // true

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
