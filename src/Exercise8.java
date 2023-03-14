/**
 * @class: Exercise8
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: March 12, 2023
 * description: This program takes a string from the user and reverses the string. This is done by taking the characters
 * at the given i value and storing them as character and then adding them on to the reversed variable until the
 * length of the string entered is reached.
 */
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str1 = input.nextLine();
        String reversed = "";
        char character;
        for( int i = 0; i < str1.length(); i++){
            character = str1.charAt(i);
            reversed = character + reversed;
        }
        System.out.println("The reverse of the string you entered is : " + '"' + reversed + '"');
    }
}