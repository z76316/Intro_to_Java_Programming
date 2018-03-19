//Write a class Month.

//A Month has a constructor that takes the month number as a parameter (1 for January, 2 for February and so forth)
//   public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1

//And 2 methods
//   public String getMonthName() Use if / else if /else if ...
//   public int getNumberOfDays() Do NOT use a separate if / else branch for each month. Use Boolean operators (&&, ||, !).
//       You will have an if then else if then else.
//       For February return 28
//
//These are implemented for you as stubs

//Now write a class MonthPrinter which will instantiate a Month object, ask the user for a month number
//and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this
//June 30

//If the user enters an invalid month number print this error message: "Number must be 1 through 12"

//If the user enters a non-integer, give this error message: "Not an integer. Terminating"

//To be considered correct, you must enter the message exactly as specified.

//For the draft:
//In Month, provide the constructor and the instance variable.

//In MonthTester, ask the usr for a number 1 to 12 and create a date object with that number

public class Month
{
    //instance variables
    private int monthNum;

    /**
     * Contructs a Month
     * @param the month number. Must be 1 to 12. For any other number, the month number is set to 1
     */
    public Month(int theMonthNumber)
    {
        if(theMonthNumber >= 1 && theMonthNumber <= 12)
        {
            monthNum = theMonthNumber;
        }
        else
        {
            monthNum = 1;
        }
    }

    /**
     * Gets the name of this month
     * @return the name of this month
     */
    public String getMonthName()
    {
        if(monthNum == 1)
        {
            return "January";
        }
        else if(monthNum == 2)
        {
            return "February";
        }
        else if(monthNum == 3)
        {
            return "March";
        }
        else if(monthNum == 4)
        {
            return "April";
        }
        else if(monthNum == 5)
        {
            return "May";
        }
        else if(monthNum == 6)
        {
            return "June";
        }
        else if(monthNum == 7)
        {
            return "July";
        }
        else if(monthNum == 8)
        {
            return "August";
        }
        else if(monthNum == 9)
        {
            return "September";
        }
        else if(monthNum == 10)
        {
            return "October";
        }
        else if(monthNum == 11)
        {
            return "November";
        }
        else if(monthNum == 12)
        {
            return "December";
        }
        else
        {
        return null;
        }
    }

    /**
     * Gets the number of days in this month
     * @return the number of days in this month in a non-leap year
     */
    public int getNumberOfDays()
    {
        if(monthNum == 2)
        {
            return 28;
        }
        else if(monthNum % 2 == 1 && monthNum < 8 || monthNum % 2 == 0 && monthNum >= 8)
        {
            return 31;
        }
        else
        {
            return 30;
        }        
    }
}