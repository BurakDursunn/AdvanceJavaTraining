package ExceptionHandling;

import java.lang.ref.Cleaner;

public class CleanerExample {
    private static final Cleaner cleaner = Cleaner.create();

    public static void main(String[] args) {

        Resource resource = new Resource();

        cleaner.register(resource, resource::cleanup);
        resource = null;

        System.gc();
    }

    static class Resource {
        void cleanup() {
            System.out.println("Cleaner called");
        }
    }
}
