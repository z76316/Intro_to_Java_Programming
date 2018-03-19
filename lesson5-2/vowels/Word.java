// BlueJ project: lesson5/vowels

public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        // TODO: Complete this method
        // A little piece of code to get you started
        boolean isA = letters.substring(i, i + 1).equals("a");
        boolean isE = letters.substring(i, i + 1).equals("e");
        boolean isI = letters.substring(i, i + 1).equals("i");
        boolean isO = letters.substring(i, i + 1).equals("o");
        boolean isU = letters.substring(i, i + 1).equals("u");
        return isA || isE || isI || isO || isU;
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        // TODO: Complete this method
        return !isVowel(i);
    }
}

