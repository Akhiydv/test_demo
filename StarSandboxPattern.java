public class StarSandboxPattern
{
    public static void main(String args[]) 
	{
        int n = 5; // Size of the square

        for(int i = 0; i < n; i++)
		{
            for (int j = 0; j < n; j++)
			{
                // Print star for borders
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
				{
                    System.out.print("* ");
                } 
				else
				{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
