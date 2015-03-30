package charactercount;

import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();
        System.out.println("Your string was: " + inputString);
        System.out.print("Enter a character: ");
        char inputCharacter = scanner.next().toLowerCase().charAt(0);
        System.out.println("Your character was: " + inputCharacter);
        int i = 0;
        int characterCount = 0;

        while (i < inputString.length()) {

            if (inputString.charAt(i) == inputCharacter) {
                characterCount++;
            }
            i++;
        }
        System.out.println("Found " + characterCount + " "
                + inputCharacter + " character(s) in " + inputString + ".");
    }
}
