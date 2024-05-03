class RevNumRecursion2
{
 public static void main(String args[])
 { 
  int num=1234;
  getReverse(num);
 }
 static int getReverse(int num)
 {
 if(num==0)
 return 0;

 int rem=num%10;
 System.out.print(rem);
 getReverse(num/10);
 //int rev=rev*10+rem;
 }
}