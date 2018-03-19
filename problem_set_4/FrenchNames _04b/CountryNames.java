//Country names in French are feminine when they end with the letter e,
//masculine otherwise, except for the following which are masculine
//even though they end with e:

//le Belize
//le Cambodge
//le Mexique
//le Mozambique
//le Zaire
//le Zimbabwe


//Complete the method getCompleteName in the class CountryNames.
//getCompleteName takes the French name of a country as a parameter
//and adds the article: le for masculine or la for feminine,
//such as le Canada or la Belgique. However, if the country name starts
//with a vowel, use l'; for example, l'Afghanistan.

//For the following plural country names, use les:
//les Etats-Unis
//les Pays-Bas

//Here is a URL that gives English and French names for countries:
//http://www.btb.gc.ca/btb.php?lang=eng&cont=690

//Use helper methods to simplify your code and make it easier to read.

//For the draft: handle the case where the French name starts with a vowel .
//(If the name starts with a vowel, add l'). Leave all other names unchanged.

public class CountryNames
{
    /**
     * Gets the name with the proper article
     * @param name the country name
     * @return the name prepended with the proper article
     */
       
    public String getCompleteName(String name)
    {
        String completeName = "";
        String nameLow = name.toLowerCase();
        int i = name.length();
        
        boolean isFirstVowel = nameLow.substring(0, 1).equals("a") ||
                               nameLow.substring(0, 1).equals("e") ||
                               nameLow.substring(0, 1).equals("i") ||
                               nameLow.substring(0, 1).equals("o") ||
                               nameLow.substring(0, 1).equals("u");
                               
        boolean isLastE = nameLow.substring(i - 1).equals("e");
        
        boolean isSpecial = nameLow.equals("belize") ||
                            nameLow.equals("cambodge") ||
                            nameLow.equals("mexique") ||
                            nameLow.equals("mozambique") ||
                            nameLow.equals("zaire") ||
                            nameLow.equals("zimbabwe");
                            
        if(nameLow.equals("etats-unis") || nameLow.equals("pays-bas"))
        {
            completeName = "les " + name;
        }
        else if(isSpecial)
        {
            completeName = "le " + name;
        }
        else if(isFirstVowel)
        {
            completeName = "l'" + name;
        }
        else if(isLastE)
        {
            completeName = "la " + name;
        }
        else
        {
            completeName = "le " + name;
        }

        return completeName;
        //your code goes here
    }

}
