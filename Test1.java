import java.util.Scanner;
class Test1
{
	public static void main(String args[])
	{
		   Scanner sc=new Scanner(System.in);
           System.out.println("Enter the String to check Palindrome or not");		   
		   String ss=sc.nextLine();
		   //String ss="Akhilesh";
		   String rev="";
	   
	        for(int i = ss.length()-1; i>=0; i--)
			{
				 rev = rev+ss.charAt(i);
			}
			if(ss.equals(rev))
			{
				 System.out.println("This is palindrome");
			}
			else
			{
				 System.out.println("This is not palindrome");
            }
    }  
}