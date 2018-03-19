//
// Complete the method to fill a 2D array of Strings with all X's ("X")
// Use nested loops
//
// Note that the method is static. It does not use the instance variables of
//the class. It gets all the information it needs as a parameter

public class ArrayUtil
{
     /**
     * Fills the given 2D array with X's ("X")
     * @param the array to fill
     */
    public static void fill2D(String[][] matrix)
    {
        // TODO:  Complete the method to fill a 2D array of Strings with all X's ("X")
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = "X";
            }
        }
    }

}
