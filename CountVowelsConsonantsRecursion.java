import java.util.Scanner;
public class CountVowelsConsonantsRecursion 
 {
   public static boolean isVowel(char ch)
   {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
   }
   public static void countVowelsConsonants(String str, int index, int counts[]) 
    {
      if(index == str.length()) 
        {
            return;
        }
        char ch = Character.toLowerCase(str.charAt(index));
        if (Character.isLetter(ch))
          {
            if(isVowel(ch)) 
              {
                counts[0]++;
              }
              else
              {
                counts[1]++; 
              }
           } 
         countVowelsConsonants(str, index + 1, counts);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check Vowels & Consonants in it...");
		String input=sc.nextLine();
		//String input = "Akhilesh"; 
        int[] counts = new int[2]; 
        countVowelsConsonants(input, 0, counts);
        System.out.println("Vowels is: " + counts[0]);
        System.out.println("Consonants is: " + counts[1]);
    }
}










