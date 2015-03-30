package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aleksandra Madalinska
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
System.out.print("Enter a string: ");
Scanner scanner = new Scanner(System.in);
String inputString = scanner.nextLine().toLowerCase();
System.out.println("Your string was: " + inputString);
System.out.print("Enter a character: ");
char inputCharacter = scanner.next().toLowerCase().charAt(0);
System.out.println("Your character was: " + inputCharacter);
int i = 0; //the index of the current character in inputString.
int characterCount = 0; //the number of characters found.
//traverse each character in the string.
while (i < inputString.length()) {
//if the current character matches the input character.
if (inputString.charAt(i) == inputCharacter) {
characterCount++;
}
i++;
}

System.out.println("Found " + characterCount + " "
+ inputCharacter + " character(s) in " + inputString + ".");
}
    }