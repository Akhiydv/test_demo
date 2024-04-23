import java.util.Scanner;
class NumberPyramid1
{
 public static void main(String args[])
 {
        int i,j,k=0,s,count=0,count1=0;
         //scanner class declaratiom
         Scanner sc = new Scanner(System.in);
         //input from user
         System.out.println("Enter the row");
         int row = sc.nextInt();
         //this loop work for the every new row
         for(i=1;i<=row;i++)
         {
             //this loop is for spaces
             for(s=1;s<=row-i;s++)
             {
                System.out.print("  ");
                count++;
             }
             //while loop for print the number in the row
             while(k!=2*i-1)
             {
                 if(count<=row-1)
                 {
                     System.out.print((k+i)+" ");
                     count++;
                 }
                 else
                 {
                     count1++;
                     System.out.print((i+k-2*count1)+" ");
                 }
                 k++;
             }

             count1=count=k=0;
             System.out.println(); 
       } 
  }
}