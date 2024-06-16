import java.util.*;
public class OverloadingExample
{
    public void display(int a) 
	{
        System.out.println("Display with single int: " + a);
    }

    public void display(int... a) 
	{
        System.out.println("Display with varargs int: " + Arrays.toString(a));
    }

    public static void main(String args[]) 
	{
        OverloadingExample obj = new OverloadingExample();
        obj.display(10);            // Calls method with single int parameter
        obj.display(10, 20, 30);    // Calls method with varargs
    }
}
