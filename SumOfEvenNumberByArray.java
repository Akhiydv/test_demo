public class SumOfEvenNumberByArray {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Variable to store the sum
        int sum = 0;
        
        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if the number is even
            if (numbers[i] % 2 == 0) {
                // Add the even number to the sum
                sum += numbers[i];
            }
        }
        
        // Print the sum of even numbers
        System.out.println("The sum of even numbers is: " + sum);
    }
}
