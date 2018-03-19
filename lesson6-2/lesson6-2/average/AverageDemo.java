// Bluej project: lesson6/average

import java.util.Scanner;
// Write a program that helps a user compute their average time
// for sprinting 100 meters.
public class AverageDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double value;
        int count = 0;
        double sum = 0;
        boolean done = false;
        // TODO: Collect values from the user until they enter a 0.
        // Track the sum of all the inputs so you can calculate the
        // average at the end
        while(!done)
        {
            System.out.print("Enter a value, 0 to quit: ");
            value = in.nextDouble();
            if(value != 0)
            {
                count++;
                sum = sum + value;
            }
            else
            {
                done = true;
            }            
        }
        
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}
