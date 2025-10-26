// Functional Interface
@FunctionalInterface
interface MyFunction
{
   void display(String message);     // Single Abstract Method
}

public class FunctionalInterfaceDemo
{
    public static void main(String args[])
	{
        
        // Using Lambda Expression to implement Functional Interface
        MyFunction function = (msg) -> 
		{
            System.out.println("Message: " + msg);
        };
        
        // Calling the method
        function.display("Hello, Functional Interface in Java!");
    }
}
