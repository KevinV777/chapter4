/**
 * @class: Exercise6
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: February 27, 2023
 * description: this program asks the user for an integer. it calculates the sum of the digits by using
 * the while loop. it adds every last digit in the integer by using the remainder function and removes that
 * digit by dividing the integer by 10. once there are no more digits to evaluate it prints the sum of the digits
 */
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter an integer: ");
        int value = input.nextInt();
        while(value != 0){
            sum += value % 10;
            value /= 10;
        }
        System.out.println("The sum of the integers is " + sum);
    }
}
