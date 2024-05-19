import java.util.Scanner;
public class AddSpacesAfterEachCharacter
 {
    public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=sc.nextLine();
        
        // Insert spaces after each character using a StringBuilder
        StringBuilder addSpace=new StringBuilder();
        for(char c : str.toCharArray())
		{
            addSpace.append(c).append(' ');
        }
        System.out.println("Sentence with spaces after each character: " +addSpace.toString());
    }
}
