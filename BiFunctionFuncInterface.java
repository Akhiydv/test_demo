import java.util.function.BiFunction;

public class BiFunctionFuncInterface 
{
    public static void main(String[] args) {
        // Define a BiFunction for addition
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
        
        // Example usage
        int result = adder.apply(5, 3);
        System.out.println("Result: " + result);
    }
}
