package Autoboxing_Unboxing;

public class Main {
    public static void main(String[] args) {

        // Autoboxing: int otomatik olarak Integer'a dönüştürülür
        Integer intObject = 10;  // Java burada int 10'u Integer 10'a dönüştürür

        // Unboxing: Integer otomatik olarak int'e dönüştürülür
        int num = intObject;  // Java burada Integer 10'u int 10'a dönüştürür

        System.out.println("Integer object: " + intObject);
        System.out.println("Primitive int: " + num);
    }
}
