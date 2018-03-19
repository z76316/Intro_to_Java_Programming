// BlueJ project: lesson4/sunsetInput
// Video: Color Your Own Sunset Effect

// TODO: Add import statement
import java.util.Scanner;

public class Sunset
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("queen-mary.png");

        Scanner in = new Scanner(System.in);
        System.out.print("Added redness: ");
        // TODO: Read added redness from scanner
        int ADDED_RED = in.nextInt();

        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(ADDED_RED); // TODO: Pass added redness to method
            pic.setColorAt(i, c);
        }
    }
}
