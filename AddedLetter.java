/**
 * Added Letter class comapres original string and shuffled with extra letter.
 * It identifies the extra added letter by comparing the sum of all 7-bit ASCII Character Codes
 * and converting rest into char.
 * 
 * @author Aleksandr Goidin
 */
public class AddedLetter {

    /**
     * Method iterates through all chars in the String 
     * and returns the sum of all 7-bit ASCII Character Codes
     *  
     * @param string    mix of letters to iterate through
     * @return          the sum of char codes
     */
    public static int charsCodeTotal(String string) {
        int totalOfCharCodes = 0;

        for (Character letter : string.toCharArray()) {
            totalOfCharCodes += letter;
        }

        return totalOfCharCodes;
    }

    /**
     * Compares 2 sums of char codes and reverse rest code into char
     * 
     * @param firstString       original string
     * @param modifiedString    modified string
     * @return                  extra char
     */
    public static char getExtraLetter(String firstString, String modifiedString) {
        return (char)(charsCodeTotal(modifiedString) - charsCodeTotal(firstString)); 
    }

    public static void main(String[] args) {

        try {

            if ((args[0].length() + 1 == args[1].length()) ||
            (args[0].length() >= 0 && args[0].length() <= 1000)) {

            System.out.println(
                "Extra added letter to second string is: " + 
                AddedLetter.getExtraLetter(args[0].toLowerCase(), args[1].toLowerCase()));

        } else System.out.println("Mistake in input");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Please, run the program with 2 arguments." + 
                "\nExample format: java AddedLetter \"ab\" \"cba\"");
        }
        
    }
}
