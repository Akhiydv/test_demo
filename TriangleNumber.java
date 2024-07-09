public class TriangleNumber
{
 public static void main(String[] args)
	{
        int rows=5; // Number of rows in the pattern

        // Outer loop for rows
        for(int i=1; i<=rows; i++)
		{
         // Inner loop for spaces
         for(int j=1; j<=rows-i; j++) 
			{
                System.out.print(" ");
            }
         // Inner loop for numbers
         for(int k=1; k<=i*2-1; k++)
			{
                System.out.print(i+" ");
            }
	    // Move to the next line after each row
        System.out.println();
        }
    }
}
