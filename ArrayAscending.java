import java.util.*;
class ArrayAscending
{
 public static void main(String args[])
 {
  int arr[]={8,1,5,4,15,10};
  Arrays.sort(arr);
  System.out.println("Sorted Array in Ascending order :");
  
  for(int num : arr)
  {
   System.out.print(num+" ");
  }
 }
}