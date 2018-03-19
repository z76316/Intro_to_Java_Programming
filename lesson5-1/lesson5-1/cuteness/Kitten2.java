
/**
 * Write a description of class Kitten2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kitten2
{
    // instance variables - replace the example below with your own
    private int months;

    /**
     * Constructor for objects of class Kitten2
     */
    public Kitten2(int ageInMonths)
    {
        // initialise instance variables
        months = ageInMonths;
    }

    /**
     * Returns how cute a kitten is based on age.
     * Kittens can be "cute", "super cute", or "not so cute".
     * @return kittens below 2 months are not so cute. kittens
     *         above 6 months are cute. kittens between 2 and
     *         6 months (inclusive) are super cute.
     */
    public String getCuteness()
    {
        if(months > 6)
        {
            return "cute";
        }
        else if(months < 2)
        {
            return "not so cute";
        }
        else
        {
            return "super cute";
        }
    }
}
