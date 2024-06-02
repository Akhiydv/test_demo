import java.util.Scanner;
public class VowelConsonantChecker 
{
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence=sc.nextLine();

        // Initialize counters for vowels and consonants
        int vowelsCount=0;
        int consonantsCount=0;

        // Convert the sentence to lowercase to make the check case-insensitive
        sentence=sentence.toLowerCase();

        // Define a string containing all vowels
        String vowels="aeiou";

        // Iterate over each character in the sentence
        for (int i=0;i<sentence.length();i++)
			{
            char ch=sentence.charAt(i);

            // Check if the character is a letter
            if(Character.isLetter(ch)) 
			{
                // Check if the character is a vowel or a consonant
                if(vowels.indexOf(ch) != -1)
				{
                    vowelsCount++;
                } 
				else
				{
                    consonantsCount++;
                }
            }
        }

        // Output the counts
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);

        // Close the scanner
        //scanner.close();
    }
}
