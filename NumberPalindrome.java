import java.util.Scanner;
class NumberPalindrome
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number to check Palindrome or not...");
  int num=sc.nextInt();
  //int num=121; 
  int rev=0, rem;
  int temp=num;
  while(temp!=0)
  {
   rem=temp%10;
   rev=rev*10+rem;
   temp/=10;
  }
  if(num==rev)
  System.out.println(num+" is Palindrome");
  else
  System.out.println(num+" is Not Palindrome");
 }
}
