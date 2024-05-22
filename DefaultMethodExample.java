// Define an interface with a default method
interface Greetable {
    // Abstract method
    void greet(String name);

    // Default method
    default void greetWithDefault() {
        System.out.println("Hello from the default method!");
    }
}

// Implement the interface in a class
class Greeter implements Greetable {
    // Provide implementation for the abstract method
    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// Main class to test the default method
public class DefaultMethodExample {
    public static void main(String[] args) {
        // Create an instance of the implementing class
        Greeter greeter = new Greeter();

        // Call the abstract method
        greeter.greet("Alice");

        // Call the default method
        greeter.greetWithDefault();
    }
}
