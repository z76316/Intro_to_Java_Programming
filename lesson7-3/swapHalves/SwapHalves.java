// BlueJ project: lesson7/swapHalves

/**

Reminder: Here is how you swap two elements

int saved = elements[i];
elements[i] = elements[j];
elements[j] = saved;

*/

import java.util.Arrays;

public class SwapHalves
{
    public static void main(String[] args)
    {
        int[] elements = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };

        // TODO: Swap the first and second half
        int saved = 0;
        for(int i = 0; i < elements.length / 2; i++)
        {
            saved = elements[i];
            elements[i] = elements[i + elements.length / 2];
            elements[i + elements.length / 2] = saved; 
        }

        // Print all elements
        System.out.println(Arrays.toString(elements));
    }
}
