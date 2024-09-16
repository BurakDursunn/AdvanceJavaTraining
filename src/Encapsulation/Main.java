package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Donald");
        p.setAge(23);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
