public class SumOf2DArray 
{
    public static void main(String[] args)
	{
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = findSum(arr);
        System.out.println("Sum of the 2D array: " + sum);
    }

    public static int findSum(int[][] arr)
	{
        int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
            for (int j = 0; j < arr[i].length; j++)
			{
                sum += arr[i][j]; 
            }
        }
        return sum;
    }
}
