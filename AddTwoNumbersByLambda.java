public class AddTwoNumbersByLambda 
{
    public static void main(String[] args)
	{
        Adder adder=(a,b)->a+b;
        int num1 = 5;
        int num2 = 10;
        int sum = adder.add(num1, num2);
        System.out.println("Sum: " + sum);
    }
    interface Adder
	{
     int add(int a, int b);
    }
}
