import java.util.function.Function;
public class FunctionalInterfaceSquareOfNumber
{
    public static void main(String args[]) 
	{
        Function<Integer, Integer> squareFunction = x -> x * x;
        int number = 5;
        int result = squareFunction.apply(number);
        System.out.println("The square of " + number + " is: " + result);
    }
}
