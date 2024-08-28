public class ReverseWordsAndSentence 
{
    public static void main(String args[])
	{
        String input = "A big cat jumped over a dog.";
        
        // Split the sentence into words
        String[] words = input.split(" ");
        
        // StringBuilder to store the final reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        
        // Iterate over the words array from the end to the start
        for (int i = words.length - 1; i >= 0; i--) {
            // Reverse each word
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            
            // Append the reversed word to the final sentence
            reversedSentence.append(reversedWord);
            
            // Add a space if not the last word
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        
        // Print the final reversed sentence
        System.out.println(reversedSentence.toString());
    }
}
