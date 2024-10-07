public class StarPatternAkhilesh
{
 public static void main(String args[])
 {
    String[] akhileshPattern = new String[7];

    // 'A' pattern
    akhileshPattern[0] = "  *   *   *    *   *   *  *       ****** ******  *    *";
    akhileshPattern[1] = " * *  *  *     *   *   *  *       *      *       *    *";
    akhileshPattern[2] = "*   * * *      *   *   *  *       *      *       *    *";
    akhileshPattern[3] = "***** **       *****   *  *       ****** ******  ******";
    akhileshPattern[4] = "*   * * *      *   *   *  *       *           *  *    *";
    akhileshPattern[5] = "*   * *  *     *   *   *  *       *           *  *    *";
    akhileshPattern[6] = "*   * *   *    *   *   *  ******  ****** ******  *    *";

    // Printing the pattern for "Akhilesh"
    for (int i = 0; i < akhileshPattern.length; i++)
	{
      System.out.println(akhileshPattern[i]);
    }
 }
}
