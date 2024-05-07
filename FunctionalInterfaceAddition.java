import java.util.Scanner;

// Functional interface for addition
interface Adder {
    double add(double a, double b);
}

public class FunctionalInterfaceAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Create an instance of Adder functional interface using lambda expression
        Adder adder = (a, b) -> a + b;

        // Perform addition using the functional interface
        double sum = adder.add(num1, num2);

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to prevent resource leak
        input.close();
    }
}
