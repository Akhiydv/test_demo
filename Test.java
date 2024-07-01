class Test
{
	public static void main(String args[])
	{
		   String ss="101";
		   String rev="";
	   
	        for(int i = ss.length()-1; i>=0; i--)
			{
				 rev =rev+ss.charAt(i);
			}
			if(ss.equals(rev))
			{
				 System.out.println("This is palindrome number");
			}
			else
			{
				 System.out.println("this is not palindrome number");
            }
    }  
}