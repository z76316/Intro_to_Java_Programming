//We want to get the average temperature in Anchorage, Alaska, in
//January and February, 1955. But to get a better idea of the normal temperature,
//we will discard the highest and lowest temeratures. The tester will
//get the temperatures from the website
//http://academic.udayton.edu/kissock/http/Weather/gsod95-current/AKANCHOR.txt
//It will put them into a double[]array that is passed to the constructor of
//your class. You will complete the TemperatureNormalizer class below.

//The TemperatureNormalizer class has a constructor that takes an array of
//doubles as a parameter
//public TemperatureNormalizer(double[] list)

//It also has methods:
//public double getAdjustedAverage() - gets the average minus the max and min
//public double getMax()
//public double getMin()
//public double getSum()
//
//For the draft, implement the getSum method. The other methods are implemented
//as stubs
//
//Note: the tester uses code we have not covered to get the values from
//the website. You can just ignore it and think of it as the plumbing that
//gets you a double[]

public class TemperatureNormalizer
{
   private double[] data;

   /**
   /* Constructs a TemperatureNormalizer with the given array
   /* @param the array to process
   */
   public TemperatureNormalizer(double[] list)
   {
       data = list;
   }

   /**
    * Gets the adjusted average of the values in this array. The adjusted average
    * is calculated by removing the highest and lowest values and calculating
    * the average of the values that are left
    * @return the adjusted average
    */
   public double getAdjustedAverage()
   {
       // TODO: find the adusted average as described in the javadoc.
       double theSum = getSum() - getMax() - getMin();
       double average = theSum / (data.length - 2);
       return average;
   }

   /**
    * Gets the maximum value in the array of doubles
    * @return the maximum value
    */
    public double getMax()
    {
        // TODO: find the maximum value
        double maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < data.length; i++)
        {
            if(data[i] > maxNum)
            {
                maxNum = data[i];
            }
        }
        return maxNum;
    }

   /**
    * Gets the minimum value in the array of doubles
    * @return the minimum value
    */
    public double getMin()
    {
        // TODO: find the minimum value
        double minNum = Integer.MAX_VALUE;
        for(int i = 0; i < data.length; i++)
        {
            if(data[i] < minNum)
            {
                minNum = data[i];
            }
        }
        return minNum;
    }

    /**
     * Gets the sum of the values in the array
     * @return the sum of the values in the array
     */
    public double getSum()
    {


        // TODO find the sum
        double sum = 0;
        for(double num : data)
        {
            sum = sum + num;
        }

        return sum;
    }


}
