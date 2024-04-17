class SecondLargestElement
{
 public static void main(String args[])
 {
  int array[]={8,1,5,4,15,10};
  int secondLargest=findSecondLargest(array);
  System.out.println("Second Largest Element is :"+secondLargest);
 }
  static int findSecondLargest(int array[])
   {
	  int secondLargest=Integer.MIN_VALUE;
	  int largest=Integer.MIN_VALUE;
	  
	  for(int value : array)
	  {
		  if(value>largest)
		  {
		   largest=secondLargest;
	       secondLargest=value;
		  }
	      else if(value>secondLargest && value!=largest)
		  {
		   secondLargest=value;
		  }
	  }
	  return secondLargest;
   }
 }
 