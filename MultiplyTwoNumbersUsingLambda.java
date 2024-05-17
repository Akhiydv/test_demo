public class MultiplyTwoNumbersUsingLambda
 {
    public static void main(String args[]) 
	{
        int number1 = 5;
        int number2 = 3;
        Multiplication multiply = (a, b) -> a * b;
        int product = multiply.multiply(number1, number2);
        System.out.println("The product of " + number1 + " and " + number2 + " is: " + product);
    }
    // unctional interface for multiplication
    interface Multiplication 
	{
        int multiply(int a, int b);
    }
}
