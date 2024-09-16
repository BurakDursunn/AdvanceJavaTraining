package Immutable_Mutable;

public class Main {
    public static void main(String[] args) {
        // Immutable object example
        String str = "FirstExample";
        String newStr = str.concat(" Amazing");

        System.out.println("Original String (immutable): " + str);
        System.out.println("New String (immutable): " + newStr);

        // Mutable object example
        StringBuilder sb = new StringBuilder("ein");
        sb.append("zwei");  // StringBuilder is mutable, so we modify it directly

        System.out.println("Modified StringBuilder (mutable): " + sb);
    }
}
