
package cst1201;

import java.util.Scanner;

/**
 *
 * @author niaz morshed
 */
public class CharacterCounter {

    public static void main(String[] args) {
        System.out.print("Enter a string: ");

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        System.out.println("Your string was: " + inputString);
        
        //converting inputString to lowercase
        inputString = inputString.toLowerCase();

        System.out.print("Enter a character: ");
        
        //converting inputCharacter to lowercase
        char inputCharacter = scanner.nextLine().toLowerCase().charAt(0);

        System.out.println("Your character was: " + inputCharacter);

        int i = 0; //the index of the current character in inputString.
        int characterCount = 0; //the number of characters found.

        //traverse each character in the string.
        while (i < inputString.length()) {
            //if the current character matches the input character.
            if (inputString.charAt(i) == inputCharacter){
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
