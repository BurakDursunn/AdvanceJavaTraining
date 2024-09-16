package Composition_Inheritance;

class Engine {
    void start() {
        System.out.println("Engine is starting");
    }
}

class Car {
    private Engine engine = new Engine();  // Car "has-a" Engine

    void drive() {
        engine.start();  // Car uses Engine functionality
        System.out.println("Car is driving");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();  // Uses engine functionality via composition
    }
}
