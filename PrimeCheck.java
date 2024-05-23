import java.util.stream.IntStream;
import java.util.Scanner;
public class PrimeCheck
 {
    public static void main(String args[]) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check prime...");
		int number=sc.nextInt();
		//int number = 29;
        boolean isPrime = isPrime(number);
		System.out.println(number + " is " + (isPrime ? "a prime number" : "not a prime number"));
    }

    public static boolean isPrime(int number)
	{
        if(number<=1) 
		{
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(i -> number % i == 0);
    }
}
