class StringReverseByStringBuilder
{
 public static void main(String args[])
 {
  String input="Akhilesh";
  StringBuilder input1=new StringBuilder();
  input1.append(input);
  input1=input1.reverse();
  System.out.println("The Reverse String is :"+input1);
 }
}