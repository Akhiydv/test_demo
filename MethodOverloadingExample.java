public class MethodOverloadingExample
{
    public int add(int a, int b) 
	{
        return a+b;
    }
    public int add(int a, int b, int c)
	{
        return a+b+c;
    }
    public double add(double a, double b)
	{
        return a+b;
    }
    public static void main(String args[])
	{
        MethodOverloadingExample example=new MethodOverloadingExample();

        // Call the method with two integers
        int sum1=example.add(10, 20);
        System.out.println("Sum of 10 and 20 is: " +sum1);

        // Call the overloaded method with three integers
        int sum2=example.add(10, 20, 30);
        System.out.println("Sum of 10, 20 and 30 is: " +sum2);

        // Call the overloaded method with two double values
        double sum3=example.add(10.5, 20.5);
        System.out.println("Sum of 10.5 and 20.5 is: " +sum3);
    }
}
