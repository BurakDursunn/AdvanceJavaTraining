package Abstract_Interface;

abstract class Animalx {
    abstract void sound();  // Abstract method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animalx {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Outputs: Bark
        dog.sleep();  // Outputs: Animal is sleeping
    }
}
