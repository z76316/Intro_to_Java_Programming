// BlueJ project: lesson9/scene2

import java.util.ArrayList;

public class Scene
{
    public static void main(String[] args)
    {
        // TODO: Change to an ArrayList<Drawable>

        ArrayList<Drawable> drawable = new ArrayList<Drawable>();
        drawable.add(new Car(100, 300));
        drawable.add(new Car(250, 300));
        drawable.add(new Car(250, 350));
       
        drawable.add(new House(100, 150, 100, 100));
        drawable.add(new House(250, 100, 150, 150));
        
        drawable.add(new Dog(200, 100, "Fido.jpg"));
        drawable.add(new Dog(100, 400, "Rex.jpg"));
        drawable.add(new Dog(200, 400, "Lucky.jpg"));

        // TODO: Change to a single loop
        for (Drawable d : drawable)
        {
            d.draw();
        }        
    }
}
