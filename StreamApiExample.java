import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamApiExample
{
    public static void main(String args[]) 
	{
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Use Stream API to process the list
        List<Integer> result = numbers.stream()  // Create a stream from the list
                                      .filter(n -> n % 2 != 0)  // Filter out even numbers
                                      .map(n -> n * n)  // Square the remaining numbers
                                      .collect(Collectors.toList());  // Collect the results into a list
        System.out.println("The squares of the odd numbers are: " + result);
    }
}
