//
// Complete the method to return the product of
// all the numbers 1 to the parameter n (inclusive)
//

public class MathUtil
{
   public int product(int n)
   {
        //TODO Write the code to return the product of all the numbers 1 to the parameter n (inclusive)
        int product = 1;
        for(int i = 1; i <= n; i++)
        {
            product = product * i;
        }
        return product;
   }
}
