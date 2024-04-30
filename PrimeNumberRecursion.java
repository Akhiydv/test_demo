import java.util.Scanner;
public class PrimeNumberRecursion
 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to check Prime...");
		int number=sc.nextInt();
        //int number = 17; // Example number to check
        if(isPrime(number, 2)) 
		{
            System.out.println(number + " is a prime number.");
        } 
		else
		{
            System.out.println(number + " is not a prime number.");
        }
    }
	static boolean isPrime(int n, int i)
	{
        if(n<=2) 
		{
            return(n==2) ? true : false;
        }
        if(n%i==0)
		{
            return false;
        }
        if(i*i>n)
		{
            return true;
        }
        // Recursive call
        return isPrime(n, i + 1);
    }
    
}

