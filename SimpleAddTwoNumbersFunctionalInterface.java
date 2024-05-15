import java.util.function.Function;
public class SimpleAddTwoNumbersFunctionalInterface
{
    public static void main(String args[])
	{
        Function<Integer, Function<Integer, Integer>> adder=a->b->a+b;
        int num1=10;
        int num2=20;
		
        int sum=adder.apply(num1).apply(num2);
        System.out.println("The sum of "+num1+ " and "+num2+ " is: "+sum);
    }
}
