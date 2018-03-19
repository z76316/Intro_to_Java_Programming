// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double sum;
    private double lowest;
    private int currentSize; // The current size of the array of scores
    private static final int MAX_SIZE = 1000;
    
    public HomeworkScores()
    {
        sum = 0;        
        lowest = Integer.MAX_VALUE;
    }

   /**
    *  Adds a score.
    *  @param score the score to add
    */
    public void addScore(double scores)
    {
        if (currentSize == 0 || scores < lowest)
        {
            lowest = scores;
            sum = sum + scores;
            
        }
        else
        {
            sum = sum + scores;
        }
        currentSize++;
    }

   /**
    *  Calculates the sum of all the scores entered, dropping the lowest
    *  score if there is more than one.
    *  @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
        if (currentSize == 0)
        {
            return 0;
        }
        else if (currentSize == 1)
        {
            return sum;
        }
        else
        {            
            return sum - lowest;
        }
    }

   /**
    *  Calculates the lowest score.
    *  @return the lowest score or 0 if there are no scores 
    */
    private double getLowest()
    {
        if (currentSize == 0) 
        {
            return 0;
        }
        return lowest;
    }       
}
