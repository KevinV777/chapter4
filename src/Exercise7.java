/**
 * @class: Exercise7
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: March 12, 2023
 * description: This program calculates the length of the strings entered in and print which one of the two is longer.
 * It is also supposed to rank in lexicographic order and print the strings as one. However, I could not figure those parts out.
 */
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        if (str1.length() < str2.length()){
            System.out.println("String " + '"' + str2 + '"' + " is longer than string " + '"' + str1 + '"');
        }else{
            System.out.println("String " + '"' + str1 + '"' + " is longer than string " + '"' + str2 + '"');
        }
    }
}
