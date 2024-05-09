public class LCMByArray {
    // Function to find the GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to find the LCM (Least Common Multiple)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Function to find the LCM of an array of numbers
    public static int findLcm(int[] arr) {
        int lcmValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcmValue = lcm(lcmValue, arr[i]);
        }
        return lcmValue;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 6, 8, 10};
        int result = findLcm(numbers);
        System.out.println("The least common multiple is: " + result);
    }
}
