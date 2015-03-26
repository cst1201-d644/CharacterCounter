
import java.util.Scanner;

/**
 *
 * @author GKundu
 */
public class CharacterCounter {

    public static void main(String[] args) {
        System.out.print("Enter a string: ");

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        System.out.println("Your string was: " + inputString);

        System.out.print("Enter a character: ");
        char inputCharacter = scanner.next().charAt(0);

        System.out.println("Your character was: " + inputCharacter);

        int i = 0; //the index of the current character in inputString.
        int characterCount = 0; //the number of characters found.

        //traverse each character in the string.
        while (i < inputString.length()) {
	            //if the current character matches the input character.
            //TODO: Make the character matching case insensitive.
            //For example, "City Tech" and the character 't' should print 2
            //occurrences.
            //For homework, due Wednesday evening.
            if (inputString.toLowerCase().charAt(i) == inputCharacter || inputString.toUpperCase().charAt(i) == inputCharacter) {
                characterCount++; //increment a count.
            }
            //move to the next character.
            i++;
        }
        //output the final count. 
        System.out.println("Found " + characterCount + " "
                + inputCharacter + " character(s) in " + inputString + ".");
    }
}
