//
// Complete the code below to print each letter in the string name followed by a space.
//
public class StringTester
{
   public static void main(String[] args)
   {
       String name = "Udacity";

       //TODO Complete the code below to print each letter in the string name followed by a space.
       String spaceName ="";
       int length = name.length();
       for(int i = 0; i < length; i++)
       {
           
           spaceName = spaceName + name.substring(i, i + 1) + " ";
       }
       System.out.print(spaceName);
   }
}
