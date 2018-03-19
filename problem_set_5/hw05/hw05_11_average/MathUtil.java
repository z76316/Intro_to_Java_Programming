//hw05_11
//
// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
// Keep a running total and keep track of the number of entries,
// then find and return the average

// Be sure not to divide by 0. Return 0 if no scores are entered

import java.util.Scanner;
public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
        Scanner in = new Scanner(System.in);
        int input = 0;
        int total = 0;
        int num = 0;
        boolean key = true;
        while(key)
        {
            input = in.nextInt();
            if(input > -1)
            {
                total = total + input;
                num++;
                System.out.print("Enter a score. -1 to quit: ");
            }
            else
            {
                key = false;
            }
        }        
        double average = 0;
        if(num != 0)
        {
            average = (double)total / num;
        }        
        return average;
    }
}
