public class StarDamroo1
{
    public static void main(String[] args)
	{
        int n = 5; // Size of the damroo pattern, can be changed as needed

        // Upper triangle (inverted)
        for (int i = 0; i < n; i++) {
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < (n - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower triangle
        for (int i = 1; i <= n; i++) {
            // Printing leading spaces
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
