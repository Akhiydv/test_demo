import java.util.Scanner;
class PositiveNegativeNestedIfElse
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number...");
  int num=sc.nextInt();
  
  if(num>=0)
  {
   if(num==0){
   System.out.println("Zero");}
   else{
   System.out.println("Positive Number");}
  }
   else{
   System.out.println("Negative Number");}
 }
}