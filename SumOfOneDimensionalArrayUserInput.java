import java.util.Scanner;
class SumOfOneDimensionalArrayUserInput
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the size of the array...");
 int size=sc.nextInt();
 int arr[]=new int[size];
 System.out.println("Enter the Elements of the array...");
 for(int i=0;i<size;i++)
  {
   arr[i]=sc.nextInt();
  }
  int sum=0;
  for(int i=0;i<arr.length;i++)
  {
	  sum+=arr[i];
  }
  System.out.println("Sum of the Elements of an Array :"+sum);
 }
}