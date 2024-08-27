package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {

        Tea tea = new Tea.Builder("Blue")
                .addSugar(false)
                .addMilk(true)
                .build();

        System.out.println(tea);
        System.out.println(tea);
        System.out.println(tea);
        System.out.println(tea);
        System.out.println(tea);
        System.out.println(tea);

    }
}
