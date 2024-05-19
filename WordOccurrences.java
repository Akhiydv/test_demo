import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordOccurrences
 {
    public static void main(String[] args)
	{
        String str="I Love My India. India is a Great Country.";
        
        // Convert the string to lower case to handle case insensitivity and remove punctuation
        str=str.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        
        // Split the string into words
        String words[]=str.split("\\s+");
        
        // Create a HashMap to store word occurrences
        Map<String, Integer> wordCountMap=new HashMap<>();
        
        // Count occurrences of each word
        for(String word:words) 
		{
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        // Print the word occurrences
        for(Map.Entry<String, Integer> entry:wordCountMap.entrySet())
		{
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
