//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing a class almost from scratch
//
//For the draft, finish the constructor.
//Have the perimeter method return 0 and have the draw mwthod draw a
//line from point 0, 0 to point 30, 40
//

import java.util.ArrayList;
import java.awt.Point;
public class Polygon
{
    // TODO: provide the required constructor, instance variable, and methods
    ArrayList<Point> points;
    
    public Polygon()
    {
        points = new ArrayList<Point>();
    }
    
    public void add(Point newPoint)
    {
        points.add(newPoint);
    }
    
    public double perimeter()
    {
        double length = 0;  
        double a = 0;  
        double b = 0;
        for(int i = 0; i < points.size(); i++)
        {
            if((i == points.size() - 1))
            {
                a = points.get(0).getX() - points.get(i).getX();
                b = points.get(0).getY() - points.get(i).getY();
                length = length + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            }
            else
            {
                a = points.get(i + 1).getX() - points.get(i).getX();
                b = points.get(i + 1).getY() - points.get(i).getY();
                length = length + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            }
        }
        return length;
    }
    
    public void draw()
    {
        Line line; 
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        for(int i = 0; i < points.size(); i++)
        {
            if((i == points.size() - 1))
            {
                x1 = points.get(0).getX();
                x2 = points.get(i).getX();
                y1 = points.get(0).getY();
                y2 = points.get(i).getY();
                line = new Line(x1, y1, x2, y2);
                line.draw();
            }
            else
            {
                x1 = points.get(i).getX();
                x2 = points.get(i + 1).getX();
                y1 = points.get(i).getY();
                y2 = points.get(i + 1).getY();
                line = new Line(x1, y1, x2, y2);
                line.draw();
            }
        }
    }
    
}
