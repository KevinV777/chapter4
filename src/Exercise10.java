/**
 * @class: Exercise10
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: March 12, 2023
 * description: This program makes an upside-down stairs pattern with stars. It is a for loop inside of a for loop
 * that makes columns and rows while printing out a certain amount of stars by subtracting the number of columns by rows
 * as the number of columns and rows go up.
 */
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int row = 0; row <= 5; row++){
            for(int column = 1; column <= 6 - row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}