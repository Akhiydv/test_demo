public class SumOfEvenNumbers 
{
 public static void main(String[] args) 
 {
        int limit = 100;
        int sum = 0;
     for (int i = 2; i <= limit; i += 2)
		{
            sum += i;
        }
    //System.out.println("Sum of even numbers from 2 to " + limit + ": " + sum);
	System.out.println(sum);
    }
}