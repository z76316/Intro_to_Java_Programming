// lesson6/chevalier_de_mere

import java.util.Random;

public class DiceGame
{
    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {
        // YOUR CODE HERE
        // Use the instance variable generator to simulate 
        // 4 die rolls. 
        // Return true if the chevalier wins (at least one is a 6).
        int times1 = 4;
        int sixCounter1 = 0;
        for(int i = 1; i <= times1; i++)
        {
            int diceNum1 = generator.nextInt(6) + 1;
            if(diceNum1 == 6)
            {
                sixCounter1++;
            }
        }
        if(sixCounter1 > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
        // YOUR CODE HERE 
        // Use the instance variable generator to simulate 
        // 24 rolls of a pair of dice.
        // Return true if at least one pair is both 6s.
        int times2 = 24;
        int sixCounter2 = 0;
        for(int i = 1; i <= times2; i++)
        {
            int diceNum2 = generator.nextInt(6) + 1;
            int diceNum3 = generator.nextInt(6) + 1;
            if(diceNum2 == 6 && diceNum3 == 6)
            {
                sixCounter2++;
            }
        }
        if(sixCounter2 > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
