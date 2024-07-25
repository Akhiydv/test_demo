import java.util.Scanner;
public class StarDamrooUserInput
{
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of n for Size of Drum to Print... ");
		int n=sc.nextInt();
		//int n=10;
        for(int i=0; i<n; i++)
			{
            for(int j=0; j<i; j++)
			{
                System.out.print(" ");
            }
            for(int j=0; j<(n-i)*2-1; j++)
			{
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++)
			{
            for(int j=1; j<n-i+1; j++)
			{
                System.out.print(" ");
            }
            for(int j=0; j<i*2-1; j++)
			{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
