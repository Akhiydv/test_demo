public class HCFOfTwoNumbers {
    // Function to calculate the Greatest Common Divisor (GCD) using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 34;
        int result = gcd(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + result);
    }
}
