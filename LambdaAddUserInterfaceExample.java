import java.util.Scanner;
@FunctionalInterface
interface Addable
{
	int add(int a, int b);
}
public class LambdaAddUserInterfaceExample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number...");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second number...");
		int num2=sc.nextInt();
		
		Addable addition=(x,y) -> x+y;
		
		int result=addition.add(num1,num2);
		
		System.out.println("Sum of given input numbers = "+result);
		sc.close();
	}	
}