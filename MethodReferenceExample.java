// Functional Interface
@FunctionalInterface
interface Sayable
{
    void say();
}

public class MethodReferenceExample
{

    // Static method
    public static void saySomething()
	{
        System.out.println("Hello, using Method Reference!");
    }

    public static void main(String args[]) 
	{

        // Method reference to static method
        Sayable sayable = MethodReferenceExample::saySomething;

        // Calling interface method
        sayable.say();
    }
}
