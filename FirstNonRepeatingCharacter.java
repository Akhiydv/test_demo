import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // Example input string
        String input = "swiss";

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Output the result
        if (result != 0) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String input) {
        // Create a hashmap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over the input string to count character frequencies
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Iterate over the input string again to find the first non-repeating character
        for (char ch : input.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }

        // Return 0 if no non-repeating character is found
        return 0;
    }
}
