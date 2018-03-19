//A landscape designer needs a program to make calculations in meters about a front yard 
//given its width and length in feet.  Write a class YardCalculator with a constructor that 
//takes the width and length in feet as arguments:
//public YardCalculator(double length, double width)

//Provide methods:
//  public double perimeter() which returns the perimeter in meters
//  public double area() which returns the area in square meters
//  public double diagonal() which returns the diagonal in meters

//For reference:
//  1 foot = 0.3048 meters.

//Define and use a constant for the conversion factor. Define it in the class itself, 
//outside any method, so all methods in any class can see it, e.g.
//  public static final double METERS_PER_FOOT = 0.3048;

//HINT: diagonal = square root of (width^2 plus height^2)

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 1" for some tips on 
// how to begin.


public class YardCalculator
{
   public static final double METERS_PER_FOOT = 0.3048;
   private double lengthInMeter;
   private double widthInMeter;
   
   public YardCalculator(double length, double width)
   {
       lengthInMeter = length * METERS_PER_FOOT;
       widthInMeter = width * METERS_PER_FOOT;
   }
   
   public double perimeter()
   {
       return (lengthInMeter + widthInMeter) * 2;
   }
   
   public double area()
   {
       return lengthInMeter * widthInMeter;
   }
   
   public double diagonal()
   {
       return Math.sqrt((Math.pow(lengthInMeter, 2) + Math.pow(widthInMeter, 2)));
   }
}