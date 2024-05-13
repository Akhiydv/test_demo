class StringCompareByEqualsMethod
{
 public static void main(String args[])
 {
  String s1=new String("Akhilesh");
  String s2=new String("Kumar");
  String s3=new String("Yadav");
  String s4=new String("Yadav");
  System.out.println("Comparing "+s1+" and "+s2+": "+s1.equals(s2));
  System.out.println("Comparing "+s2+" and "+s3+": "+s2.equals(s3));
  System.out.println("Comparing "+s3+" and "+s4+": "+s3.equals(s4));
  System.out.println("Comparing "+s1+" and "+s3+": "+s1.equals(s3));
  System.out.println("Comparing "+s1+" and "+s4+": "+s1.equals(s4));
 }
}