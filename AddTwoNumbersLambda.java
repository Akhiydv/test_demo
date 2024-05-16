public class AddTwoNumbersByLambda 
{
    public static void main(String args[])
	{
        int num1=5;
        int num2=3;
 
        Addition add=(a, b)->a+b;
     
        int sum=add.addition(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
    interface Addition 
	{
        int addition(int a, int b);
    }
}
