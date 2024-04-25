public class LCM
{
  public static void main(String args[])
  {
    int n1=12, n2=36, lcm=0;
	int max=(num1 > num2) ? n1 : n2;

    for(int i=max; i<=n1*n2; i++)
      {
     if(i%n1==0 && i%n2==0)
        {
         lcm=i;
         break;
        }
      }
    System.out.println ("The LCM: " + lcm);
  }
}