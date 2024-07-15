import java.util.Scanner;
class Fact2UserInput1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to get Factorial...");
    int n=sc.nextInt();
	//int n=8;
	int fact = 1;
	for(int i = n; i>=1;i--)
	{
	 fact=fact*i;
	}
	System.out.println("Entered Value is "+n);
	System.out.println("Factorial of "+n+" is "+fact);
  }
}