@FunctionalInterface
interface Adder {
    int add(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // Create an instance of Adder using lambda expression
        Adder adder = (a, b) -> a + b;

        // Call the add method to add two integers
        int result = adder.add(10, 20);
        System.out.println("Result of adding 10 and 20: " + result);
    }
}
