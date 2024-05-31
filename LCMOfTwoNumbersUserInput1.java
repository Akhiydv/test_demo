import java.util.Scanner;
public class LCMOfTwoNumbersUserInput1 
{
    public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number...");
		//int num1 = 16;
		int num1=sc.nextInt();
        System.out.println("Enter the second number...");
		int num2=sc.nextInt();
		//int num2 = 34; 
        int result = lcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + result);
    }
    public static int gcd(int a, int b)
	{
        if(b==0)
		{
            return a;
        }
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b)
	{
        return (a*b) / gcd(a,b);
    }
}