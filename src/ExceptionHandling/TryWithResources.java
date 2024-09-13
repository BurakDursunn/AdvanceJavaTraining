package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("file.txt")) {
            writer.write("Hello, Frankfurt!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
