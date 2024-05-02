class RevNumRecursion1
{
 public static void main(String args[])
 {
  int num=1234, rev=0;
  System.out.println("Reversed Number is : "+getReverse(num,rev));
 }
 static int getReverse(int num, int rev)
 {
 if(num==0)
 return rev;
 
 int rem=num%10;
 rev=rev*10+rem; 
 
 return getReverse(num/10, rev);
 }
}