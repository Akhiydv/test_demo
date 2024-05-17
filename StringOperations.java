import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringOperations 
{
    public static void main(String args[]) 
	{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string... ");
        String str=sc.nextLine();
        System.out.println(str);
        System.out.println(str.length());
        
        System.out.println(str.charAt(0)+" "+str.charAt(str.length()-1));
        
        // Print the string with each character separated by a space
        String spacedString = str.chars()
                                   .mapToObj(c -> String.valueOf((char)c))
                                   .collect(Collectors.joining(" "));
        System.out.println(spacedString);
        
        // Print the number of unique characters in the string
        long uniqueCharCount = str.chars().distinct().count();
        System.out.println(uniqueCharCount);
        
        System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
    }
}
