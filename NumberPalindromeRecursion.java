class NumberPalindromeRecursion
{
 public static void main(String args[])
 {
  int num=121, rev=0, rem;
  int temp=num;
  System.out.println("Enter the number to check Palindrome or not...");
  
  static int getReverse(int num, int rev)
  {
	 rem=temp%10;
	 rev=rev*10+rem;
  }
  if(num==rev)
  System.out.println("Palindrome");
  else
  System.out.println("Not Palindrome");
	
 }
}