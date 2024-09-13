package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchFinally {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("file.txt");
            writer.write("Hallo Munchen");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
