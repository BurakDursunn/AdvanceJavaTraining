package Abstract_Interface;

interface Animal {
    void sound();  // Abstract method

    default void sleep() {  // Default method
        System.out.println("Animal is sleeping");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();  // Outputs: Meow
        cat.sleep();  // Outputs: Animal is sleeping (default method)
    }
}

