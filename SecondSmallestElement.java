class SecondSmallestElement
{
 public static void main(String args[])
 {
  int array[]={8,1,5,4,15,10};
  int secondSmallest=findSecondSmallest(array);
  System.out.println("Second Smallest Element is :"+secondSmallest);
 }
  static int findSecondSmallest(int array[])
   {
	  int secondSmallest=Integer.MAX_VALUE;
	  int smallest=Integer.MAX_VALUE;
	  
	  for(int value : array)
	  {
		  if(value<smallest)
		  {
		   smallest=secondSmallest;
	       secondSmallest=value;
		  }
	      else if(value<secondSmallest && value!=smallest)
		  {
		   secondSmallest=value;
		  }
	  }
	  return secondSmallest;
   }
 }
 
