public class StarTriangles 
{
    public static void main(String args[]) 
	{
        int n = 5; // Size of the triangles

        // Upper Star Triangle
        System.out.println("Upper Star Triangle:");
        for(int i = 1; i <= n; i++)
		{
            for(int j = 1; j <= i; j++)
			{
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Lower Star Triangle
        System.out.println("Lower Star Triangle:");
        for (int i = n; i >= 1; i--) 
		{
            for(int j = 1; j <= i; j++)
			{
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
