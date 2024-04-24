import java.util.Scanner;
public class NumberRightTriangle1
{
 public static void main(String[] args)
     {
         int i,j;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the row");
         int n = sc.nextInt();
         //int n=5;
		 for(i=n;i>=0;i--)
			 //opposite loop
		 //for(i=1;i<=n;i++)
	    {
          for(j=1;j<=i;j++)
		  
            System.out.print(j+" ");
            System.out.println();
		}
     }
}