import java.util.Scanner;
class PositiveOrNegativeNumber
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number...");  
  int num=sc.nextInt();
  //int num=5;
  if(num>0)
  System.out.println("Positive Number");
  else if(num<0)
  System.out.println("Negative Number");
  else
  System.out.println("Zero");
 }
}