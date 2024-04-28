import java.util.Scanner;
class PositiveNegativeNumberTernary
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number...");
  int num=sc.nextInt();
  //int result=0;
  int result=num>0 ? "Positive" : "Negative";
  System.out.println(result);
  if(num==0)
  System.out.println("Zero");
  else
  System.out.println("----------");
 }
}
