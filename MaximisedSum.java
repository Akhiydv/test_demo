import java.util.*;

public class MaximisedSum {

    // Function to calculate maximised sum
    public static int calculateMaximisedSum(int[] arr1, int[] arr2, int n) {
        // Decide for each index if swapping increases future contribution
        for (int i = 0; i < n - 1; i++) {
            // Contribution without swapping
            int noSwap = Math.abs(arr1[i] - arr2[i]) + Math.abs(arr1[i + 1] - arr2[i]);
            // Contribution if swapped arr1[i] and arr2[i]
            int swap = Math.abs(arr2[i] - arr1[i]) + Math.abs(arr2[i + 1] - arr1[i]);

            if (swap > noSwap) {
                // Swap elements
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }

        // Now compute final sum
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += Math.abs(arr1[i] - arr2[i]);
            if (i < n - 1) {
                maxSum += Math.abs(arr1[i + 1] - arr2[i]);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // array size
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

        int result = calculateMaximisedSum(arr1, arr2, n);
        System.out.println(result);

        sc.close();
    }
}
