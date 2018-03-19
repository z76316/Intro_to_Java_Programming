// BlueJ Project: lesson4/book3
// Video: Working with the Book Text

import java.util.Scanner;
import java.io.File;

public class Book
{
    private String bookText;

    public Book(String fileName)
    {
        readBook(fileName);
    }
    
    /**
     * Counts how many times a given word occurs in this book.
     * @param word a word of length >= 1
     * @return the number of occurrences
     */
    public int occurrencesOf(String word)
    {
        // TODO: Complete this method
        int lengthOfWord = word.length();
        int totalWords = bookText.length();
        String withoutTheWord = bookText.replace(word, "");
        int numWithoutTheWord = withoutTheWord.length();
        int numOfTimesTheWordOccurrences = (totalWords - numWithoutTheWord) / lengthOfWord;
        return numOfTimesTheWordOccurrences;
    }
    
    /**
     *  Counts how many times "Alice" occurs in this book.
     *  @return the number of occurrences
     */
    public int occurrencesOfAlice()
    {
        // TODO: Find the number of times the word "Alice" occurs in this book
        int lengthOfAlice = "Alice".length();
        int totalWords = bookText.length();
        String withoutAlice = bookText.replace("Alice", "");
        int numWithoutAlice = withoutAlice.length();
        int numOfTimesAliceOccurrences = (totalWords - numWithoutAlice) / lengthOfAlice;
        return numOfTimesAliceOccurrences;
    }

    /**
     * Gets the first sentence of this book.
     * @return the first sentence (including the period) of this book.
     */
    public String getFirstSentence()
    {
        // TODO: Return the first sentence
        int endPosition = bookText.indexOf(".");
        String firstSentence = bookText.substring(0, endPosition + 1);
        return firstSentence;
    }
    
    public String getSecondSentence()
    {
        // TODO: Get the second sentence
        // Locate the period of the first sentence
        // Return the substring consisting of everything after that period up to
        // the second period
        int endPosition = bookText.indexOf(".");
        int secondEnd = bookText.indexOf(".", endPosition + 1);
        String secondSentence = bookText.substring(endPosition + 1, secondEnd + 1);
        return secondSentence;
    }
    
    /**
     * Calculates the number of characters (as in letters and
     * symbols, not people) in the book.
     * @return the number of letters and symbols in the book.
     */
    public int getNumCharacters()
    {
        return bookText.length();
    }

    /**
     * Finds where the string "Mad Hatter" occurs for the first time in the book.
     * @return the location of the first occurrence of the string
     */
    public int firstOccurrenceOfMadHatter()
    {
        return bookText.indexOf("Mad Hatter");
    }

    /**
     * A method to help read the book out of the file.
     * You don't have to read this unless you want to.
     * The "try" and "catch" are java's way of dealing with
     * runtime errors or "exceptions."  For more info, see
     * https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html
     */
    public void readBook(String fileName)
    {
        bookText = "";
        try
        {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                bookText += line + "\n";
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
