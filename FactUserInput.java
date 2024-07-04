class FactUserInput
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter the value to find Factorial of it...");
	int n=sc.nextInt();
    //int n=5;
	int fact=1;
	for(int i=1;i<=n;i++)
	{
	  fact = fact*i;
	}
	System.out.println("The Entered value is : "+n);
	System.out.println("Factorial of "+n+" is "+fact);
  }
}