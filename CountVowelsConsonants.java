public class CountVowelsConsonants {
    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Function to count vowels and consonants in a string recursively
    public static void countVowelsConsonants(String str, int index, int[] counts) {
        // Base case: if index reaches the end of the string
        if (index == str.length()) {
            return;
        }
        char ch = Character.toLowerCase(str.charAt(index));
        // Increment count based on whether the character is a vowel or consonant
        if (Character.isLetter(ch)) {
            if (isVowel(ch)) {
                counts[0]++; // Increment vowel count
            } else {
                counts[1]++; // Increment consonant count
            }
        }
        // Recursive call for the next character in the string
        countVowelsConsonants(str, index + 1, counts);
    }

    public static void main(String[] args) {
        String input = "Hello World"; // Change this string to test with different inputs
        int[] counts = new int[2]; // Index 0 for vowels count, index 1 for consonants count
        countVowelsConsonants(input, 0, counts);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}
