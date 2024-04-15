import java.util.Scanner;
public class LargestElementOfArray
{
 public static void main(String args[])
 {
    int arr[] = {8,1,5,4,15,10};
    int max = arr[0];
    
	for(int i=0; i<arr.length; i++)
     { 
      if(max < arr[i])
        {
          max = arr[i];
        }
	 }
    System.out.print(max); 
 }
}