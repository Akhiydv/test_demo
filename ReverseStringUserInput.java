import java.util.Scanner;
public class ReverseStringUserInput 
{
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        //String str = "Hello, World!";
		System.out.println("Enter the String to Print Reverse of it..");
        String str=sc.nextLine();
		String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str)
	{
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right)
	    {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
