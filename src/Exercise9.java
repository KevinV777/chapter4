/**
 * @class: Exercise9
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: March 12, 2023
 * description: This program is supposed to calculate the last occurrence of a character in the string the user enters.
 * I was unable to complete what feels like the final step. What I have prints all the occurrences of the character in the string
 * and not the final one. I could not figure out how to make the value for index in the for loop exist outside of the for loop.
 */
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = input.nextLine();
        System.out.print("Enter a character: ");
        String str2 = input.nextLine();
        int index = -1;
        char character = str2.charAt(0);
        for (int i = 0; i <= str1.length(); i++){
            index = i;
            if (str1.charAt(i) == character) {
                System.out.print("The last occurrence of " + '"' + str2 + '"' + " in " + '"' + str1 + '"' + " is at index " + index);
            }

        }

    }
}