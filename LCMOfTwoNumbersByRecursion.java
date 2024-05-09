public class LCMOfTwoNumbersByRecursion {
    // Function to calculate the Greatest Common Divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to calculate the Least Common Multiple (LCM) using recursion
    public static int lcm(int a, int b) {
        // LCM of two numbers = (a * b) / GCD of two numbers
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 16; // Change this value to test with different numbers
        int num2 = 34; // Change this value to test with different numbers
        int result = lcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + result);
    }
}
