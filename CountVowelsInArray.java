import java.util.Scanner;
public class  CountVowelsInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check number of Vowels and Consonants...");
		String str=sc.nextLine();
		//String str = "akhilesh";
		char[] ch = str.toCharArray();
		int vowel=0;
		int consonant=0;
		
		for(int i=0; i<str.length(); i++)
		{ 
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
			|| str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' 
			|| str.charAt(i)=='E' || str.charAt(i)=='I'
			|| str.charAt(i)=='O' || str.charAt(i)=='U') 
			{   
			  vowel++;
			}
            else
			{
				consonant++;
			}		
		}
  
	System.out.println("Vowels: " + vowel);
	System.out.println("Consonants: " +consonant);
    }
}