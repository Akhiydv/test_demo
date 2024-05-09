public class PrimeNumberByRecursion {
    // Function to check if a number is prime
    public static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        // Recursive case: increment i and check again
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int number = 17; // Change this number to test for different values
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
