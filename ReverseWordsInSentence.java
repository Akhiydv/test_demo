public class ReverseWordsInSentence
{
    public static void main(String args[])
	{
        String input = "A big cat jumped over a dog.";
        
        // Split the sentence into words
        String[] words = input.split(" ");
        
        // StringBuilder to store the final reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        
        // Reverse the order of words in the sentence
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            
            // Reverse each word
            String reversedWord = new StringBuilder(word).reverse().toString();
            
            // Append the reversed word to the final sentence
            reversedSentence.append(reversedWord);
            
            // Add a space between words
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        
        // Print the final reversed sentence
        System.out.println(reversedSentence.toString());
    }
}
