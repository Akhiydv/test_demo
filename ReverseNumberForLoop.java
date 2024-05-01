class ReverseNumberForLoop
{
 public static void main(String args[])
 {
  int num=1234, rev=0, rem;
  
  for(; num!=0; num/=10)
  {
  rem=num%10;
  rev=rev*10+rem;
  }
  System.out.println("Reversed number is : "+rev);
 }
}