import java.util.Scanner;
class RevNumWhileLoopUserInput
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number to get reverse...");
 int num=sc.nextInt();
 System.out.println("Entered Number is : "+num);
 
 int rev=0, rem;
 
 while(num!=0)
 {
  rem=num%10;
  rev=rev*10+rem;
  num/=10;
 }
 
 System.out.println("Reverse of given number is : "+rev);
 }
}