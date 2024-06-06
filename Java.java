class Java extends Thread
{
  public void  run()
  {
   System.out.println("Welcome");
  }
  public static void main(String args[])
  {
   Java j=new Java();
   j.start();
  }
}
