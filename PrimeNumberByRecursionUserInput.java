import java.util.Scanner;
public class PrimeNumberByRecursionUserInput
 {
   public static boolean isPrime(int n, int i) 
   {
    if (n <= 2)
		{
            return (n == 2);
        }
        if (n % i == 0)
		{
            return false;
        }
        if (i * i > n)
		{
            return true;
        }
	return isPrime(n, i + 1);
   }
    
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number to check prime or not...");
	    int number=sc.nextInt();
        //int number = 17; 
        if (isPrime(number, 2)) 
		{
            System.out.println(number + " is a prime number.");
        }
		else
		{
            System.out.println(number + " is not a prime number.");
        }
    }
}
