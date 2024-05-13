import java.util.Scanner;
class StringSimpleUserInput
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the String by method1 to print... ");
  String str=sc.nextLine();
  //String str="Akhilesh";
  System.out.println("Enter the String method2 to print... ");
  String str1=sc.nextLine();  
  //String str1=new String("Yadav");
  System.out.println("1st method of String literal :"+str);
  System.out.println("2nd method of new keyword :"+str1); 
 }
}