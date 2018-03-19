
//
// Complete the method in this class. It gets a string with the elements of the array
// in reverse order separated by a space. If the array looks like this [1, 2 ,3 ,4], your
// output will look like this 4 3 2 1
//
public class ArrayUtil
{
  /**
   * Gets a string with the elements of the array in reverse order separated by a space
   * @param values the array to reverse
   * @return the string containing the elements in reverse order
   */
  public String inReverse(int[] values)
  {
      String message ="";
      message = message + values[values.length - 1];
      for (int i = values.length - 2; i >= 0 ; i--) //finish the loop header
      {
          // TODO: concatenate the elements to message in reverse order
          message = message + " " + values[i];
      }
      return message;
  }
}
