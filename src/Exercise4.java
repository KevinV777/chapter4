/**
 * @class: Exercise4
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: March 12, 2023
 * description: This program prints the first 30 values in the Fibonacci series. The old sum and new sum are added together
 *  to make a temp value. The new sum becomes the old sum and then the old sum becomes the temp value, and it loops until
 *  i gets to the value of 31 so that it prints all the way up to 30.
 */
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        int oldSum = 1;
        int newSum = 0;
        for( int i = 0; i <= 30; i++){
            System.out.println(newSum);
            int temp = newSum + oldSum;
            newSum = oldSum;
            oldSum = temp;
        }
    }
}