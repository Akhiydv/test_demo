public class TryCatchFinallyExample
{
    public static void main(String args[])
	{
        int numerator=10;
        int denominator=0; // This will cause an ArithmeticException
        int result=0;

        try
		{
            // Attempt to divide the numerator by the denominator
            result=numerator/denominator;
            System.out.println("Result: " + result);
        } 
		catch(ArithmeticException e)
		{
            // Handle the exception (e.g., division by zero)
            System.out.println("Error: Cannot divide by zero.");
        }
		finally 
		{
            // This block always executes
            System.out.println("Execution of the finally block.");
        }
        System.out.println("Program continues after try-catch-finally.");
    }
}
