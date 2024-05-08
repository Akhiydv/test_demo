import java.util.Arrays;

public class AdditionOfArrayByStream
{
    public static void main(String[] args)
	{
        //Array of numbers
        int[] numbers = {2, 3, 5, 7};

        //Calculate the sum using Stream API
        int sum = Arrays.stream(numbers).sum();

        // Print the sum
        System.out.println("The sum is: " + sum);
    }
}
