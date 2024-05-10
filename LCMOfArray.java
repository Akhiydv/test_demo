import java.util.Scanner;
public class LCMOfArray
 {
    // Function to find gcd of two numbers
    static int gcd(int a, int b)
	{
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Function to find lcm of array elements
    static int lcmOfArray(int[] arr)
	{
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++)
	    {
            lcm = (lcm * arr[i]) / gcd(lcm, arr[i]);
        }
        return lcm;
    }

    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        // Input size of array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = scanner.nextInt();
        }
        // Calculate and display LCM
        int lcm = lcmOfArray(arr);
        System.out.println("LCM of the array elements is: " + lcm);
        scanner.close();
    }
}
