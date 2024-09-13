package ShallowCopy_DeepCopy_CloneMethod;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person p1 = new Person("John", address);
        Person p2 = (Person) p1.clone();  // Deep copy

        // Now p1 and p2 are independent objects
        p2.address.city = "Los Angeles";

        System.out.println(p1.address.city);  // New York (original object remains unchanged)
        System.out.println(p2.address.city);  // Los Angeles (cloned object is modified)
    }
}


class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Deep copy: We need to clone both the Person and the Address objects
        Person clonedPerson = (Person) super.clone();
        clonedPerson.address = (Address) address.clone();  // Deep copy for Address
        return clonedPerson;
    }
}
