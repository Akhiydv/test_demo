import java.util.function.Function;

public class AddTwoNumbersFunctional {
    public static void main(String[] args) {
        // Define a Function for addition
        Function<Integer, Function<Integer, Integer>> adder = a -> b -> a + b;
        
        // Define two numbers to add
        int number1 = 5;
        int number2 = 3;
        
        // Perform addition
        int sum = adder.apply(number1).apply(number2);
        
        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
