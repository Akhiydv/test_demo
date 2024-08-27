import java.util.Scanner;
public class HalfDiamondStarPattern
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int no=sc.nextInt();
		
		for(int i=1; i<=no;i++)
		{
			for(int j=1;j<=i;j++)
			  {				
			   System.out.print("*");
			  }
			System.out.println();
		}
		for(int i=no-1;i>0;i--) 
		{
			for(int j=1; j<=i; j++)
			   {				
				 System.out.print("*");
			   }
			System.out.println();
		}
	}
}