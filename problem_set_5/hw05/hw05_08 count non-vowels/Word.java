//
// Complete the method to return the number of non-vowels in the parameter
// Assume the vowels are  a,e,i,o,u or A, E, I, O, U
//

public class Word
{
    /**
     * Gets the number of non-vowels in the parameter
     * @param word the string to count the non-vowels in
     * @return the number of non-vowels in the word
     */
    public int nonVowelCount(String word)
    {
        //TODO Write the code return the number of non-vowels
        int length = word.length();
        int nonVowel = 0;
        for(int i = 0; i < length; i++)
        {
            String lowWord = word.toLowerCase();
            boolean isVowel = lowWord.substring(i, i + 1).equals("a") || lowWord.substring(i, i + 1).equals("e") ||
                              lowWord.substring(i, i + 1).equals("i") || lowWord.substring(i, i + 1).equals("o") ||
                              lowWord.substring(i, i + 1).equals("u");
            if(!isVowel)
            {
                nonVowel++;
            }
        }
        return nonVowel;
    }
}
