// BlueJ project: lesson7/gallery6

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("guigou1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("seurat1.jpg"));

        // Your code here
        Picture tallest = new Picture();
        int height = 0;
        int tallestHeight = 0;
        for(Picture pic : gallery)
        {
            height = pic.getHeight();
            if(height > tallestHeight)
            {
                tallest = pic;
                tallestHeight = height;
            }
        }

        System.out.println("Tallest height: "
                           + tallest.getHeight());
        tallest.draw();
    }
}
