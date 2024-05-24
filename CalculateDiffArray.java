import java.util.*;

public class CalculateDiffArray
{
    public static void main(String args[]) 
	{
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int n = scanner.nextInt();

        // Initialize arrays
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Read elements into arr2
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Read elements into arr1
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Calculate the difference and store in arr2
        for (int i = 0; i < n; i++) {
            arr2[i] -= arr1[i];
        }

        // Sort arr2 in descending order
        Arrays.sort(arr2);
        for (int i = 0; i < n / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[n - 1 - i];
            arr2[n - 1 - i] = temp;
        }

        // Initialize sum and ans
        int sum = 0;
        int ans = 0;

        // Calculate the result
        for (int i = 0; i < n; i++) {
            sum += arr2[i];
            if (sum < 0) {
                ans += Math.abs(sum);
                sum = 0;
            }
        }

        // Print the result
        System.out.println(ans);

        scanner.close();
    }
}
