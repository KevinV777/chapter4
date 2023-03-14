/**
 * @class: Exercise5
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: March 12, 2023
 * description: This program takes a positive integer from the user and calculates the factorial of the number.
 * if the integer entered is 0 then it just prints 1, otherwise it goes through the loop to calculate the factorial
 * by multiplying the value by i and storing the number in sum.
 */
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int integer = input.nextInt();
        int sum = 0;
        int value = 1;
        if(integer == 0) {
            System.out.println(1);
        }else
        {for (int i = 1; i <= integer; i++) {
                value *= i;
                sum = value;
        }System.out.println(sum);
        }

    }
}