import java.util.Scanner;
public class RemoveWhiteSpacesInString 
{
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence...  ");
        String str=sc.nextLine();
        // Remove white spaces using replaceAll
        String noSpaces=str.replaceAll("\\s", "");
        System.out.println("Sentence without white spaces...  "+noSpaces);
    }
}
