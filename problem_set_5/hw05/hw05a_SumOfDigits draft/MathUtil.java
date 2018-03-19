//Complete the given code to compute the sum of all odd digits of a integer.
//The integer may be positive or negative. (For example, if the input is 32677,
//the sum would be 3 + 7 + 7 = 17.)

//HINT: Use a method of the Math class to get the absolute value of the parameter

//For the draft, print out the digits all on one line, separated by a space.
//Print a zero as the last number and return 0. If the input is 32677, the output will be

//3 2 6 7 7 0

public class MathUtil
{
   /**
    * Gets the sum of all the odd digits in the parameter
    * @param n the number to use
    * @return the sum of the odd digits.
    */

   public int sumOfOdd(int n)
   {
      //TODO calculate and return the sum of the odd digits
      int input = Math.abs(n);
      boolean over = false;
      int digit = 0;
      int sum = 0;      
      while(!over)
      {
          if(input != 0)
          {
          digit = input % 10;
            if(digit % 2 == 1)
            {
              sum = sum + digit;
            }
          input = input / 10;
          }
          else
          {
              over = true;
          }
      }
      return sum;
   }
}
