// Write the code to draw a tower of blocks that looks like the one in the link below:
// http://i.imgur.com/PvIGJkL.png
    
// Name the class BlockTower. Each block has a width of 40 and a height of 30. 
// There are three rows. The upper left-hand corner of the bottom row is at (20, 70)

// Create a custom color for the topmost color where red = 125, green=125, blue = 255. 
// For all the other colors, use predefined colors. 
// The colors from top to bottom are: custom, RED, PINK, BLUE, MAGENTA, CYAN


// HINT:
// The bottom left rectangle should have the attributes:
// x: 20
// y: 70
// width: 40
// height: 30
//
// You should set the color of the rectangle to blue by using the method:
// setColor(Color.somecolor); on the rectangle object that you created
//
// Don't forget to draw the rectangle by calling the fill() function




public class BlockTower
{
    public static void main(String[] args)
    {
        Rectangle block1 = new Rectangle(20, 70, 40, 30);
        Rectangle block2 = new Rectangle(60, 70, 40, 30);
        Rectangle block3 = new Rectangle(100, 70, 40, 30);
        Rectangle block4 = new Rectangle(40, 40, 40, 30);
        Rectangle block5 = new Rectangle(80, 40, 40, 30);
        Rectangle block6 = new Rectangle(60, 10, 40, 30);
        block1.fill();
        block2.fill();
        block3.fill();
        block4.fill();
        block5.fill();
        block6.fill();
        
        Color color6 = new Color(125, 125, 255);
        
        block1.setColor(Color.BLUE);
        block2.setColor(Color.MAGENTA);
        block3.setColor(Color.CYAN);
        block4.setColor(Color.RED);
        block5.setColor(Color.PINK);
        block6.setColor(color6);
        //TODO finish the draft to display the six blocks
    }
}