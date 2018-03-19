// BlueJ project: lesson7/gallery3

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        int start = 0;
        for (Picture pic : gallery)
        {
            // TODO: Move the first picture to offset 10,
            // the second picture ten pixels to the right of the first one,
            // and so on
            pic.translate(start +10, 0);
            start = pic.getMaxX();
        }

        for (Picture pic : gallery)
        {
            pic.draw();
        }
    }
}
