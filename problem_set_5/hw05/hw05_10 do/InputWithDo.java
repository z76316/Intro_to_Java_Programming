
//
// Complete the method below. The method asks the user to input an integer between 1 and 10 (inclusive)
// It keeps asking until the number is in the correct range and then returns it.
// use a do loop
//
import java.util.Scanner;
public class InputWithDo
{
    /*
     * Gets a number betwwen 1 and 10 (inclusive) from the user
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
        // TODO Write code to get a number ion the range of 1 to 10
        // HINT: You will need to import the Scanner class and create a Scanner object to use to get input from the user
        // System.out.print("Enter an integer >=1 and <=10: "); //use this for the prompt
        Scanner in = new Scanner(System.in);
        int input = 0;
        do
        {
            System.out.print("Enter an integer >=1 and <=10: ");
            input = in.nextInt();
        }
        while(input < 1 || input > 10);
        return input;
    }
}
