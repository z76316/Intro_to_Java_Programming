// BlueJ project: lesson9/quiz2
import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
    // TODO: Add an ArrayList<String> instance variable to hold the choices
    ArrayList<String> choicesList;
    /**
       Constructs a choice question with no choices.
    */
    public ChoiceQuestion()
    {
        // TODO: Initialize the list of choices
        choicesList = new ArrayList<String>();
    }

    /**
       Adds an answer choice to this question.
       @param choice the choice to add
       @param correct true if this is the correct choice, false otherwise
    */
    public void addChoice(String choice, boolean correct)
    {
        // TODO: Add choice to choices.
        // Ignore the "correct" parameter for now
        choicesList.add(choice);
    }

    public void display()
    {
        // For now, just print the choices
        System.out.println(choicesList);
    }
}

