public class LargestNumberInArrayByRecursion {
    // Function to find the largest number in an array recursively
    public static int findLargest(int[] arr, int index) {
        // Base case: if the index reaches the end of the array, return the last element
        if (index == arr.length - 1) {
            return arr[index];
        }
        // Recursive case: compare the current element with the largest element found so far
        int currentNumber = arr[index];
        int largestInRest = findLargest(arr, index + 1);
        return Math.max(currentNumber, largestInRest);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 7, 15, 8}; // Change this array to test with different numbers
        int largest = findLargest(numbers, 0);
        System.out.println("The largest number in the array is: " + largest);
    }
}
