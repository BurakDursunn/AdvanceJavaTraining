package MemoryManagement_GarbageCollection;

public class Main {

    public static void main(String[] args) {

        createObjects();

        System.gc();

        System.out.println("Garbage Collection is called.");
    }

    private static void createObjects() {
        for (int i = 0; i < 100; i++) {
            String temp = new String("Temp Object " + i);
        }

        System.out.println("Temp object is created but it was not used.");
    }
}
