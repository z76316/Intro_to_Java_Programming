
/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{

   public int largestPowerOf2(int n)
   {
       int powOf2 = 0;
       for(int i = 0; Math.pow(2, i) < n; i++)
       {
           powOf2 = (int)Math.pow(2, i);
       }
       return powOf2;
   }
}
