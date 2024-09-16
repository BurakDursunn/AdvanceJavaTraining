package InnerClasses;

public class Main {
    public static void main(String[] args) {
        // Static Nested Class Example
        Outer.Nested nested = new Outer.Nested();
        nested.show();  // Outputs: Inside static nested class

        // Inner Class Example
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();  // Outputs: Inside inner class

        // Local Inner Class Example
        outer.outerMethod();  // Outputs: Inside local inner class
    }
}

class Outer {
    // Static Nested Class
    static class Nested {
        void show() {
            System.out.println("Inside static nested class");
        }
    }

    // Inner Class
    class Inner {
        void display() {
            System.out.println("Inside inner class");
        }
    }

    // Method containing Local Inner Class
    void outerMethod() {
        class LocalInner {
            void show() {
                System.out.println("Inside local inner class");
            }
        }
        LocalInner local = new LocalInner();
        local.show();
    }
}
