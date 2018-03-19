
/**
 * Complete the method to find sum of all the even numbers less than or equal to the given
 * number. Use a loop
 */
public class Sum
{
   /**
    * Gets the sum of all the even numbers less than or equal to the given number
    * @param n the given number, th ceiling
    * @return the sum of all the even numbers less that the ceiling
    */

   public int sum(int n)
   {
       int evenKing = 0;
       for(int i = 2; i <= n; i = i + 2)
       {
           evenKing = evenKing + i;
       }
       return evenKing;
   }
}
