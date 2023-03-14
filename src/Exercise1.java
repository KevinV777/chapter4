/**
 * @class: Exercise1
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: February 27, 2023
 * description: this program asks the user to enter a positive number to find out if it is a prime number or not
 * the program uses a while loop to evaluate the integer and a boolean value for the if else statement to print
 * the integer and whether it is prime or not. the while loops executes until the count is higher than the integer
 * being divided by 2 to make sure no other value will leave the remainder of 0
 */
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 2;
        boolean no = false;
        while (count <= number / 2) {
            if (number % count == 0) {
                no = true;
            }
            count++;
        }
        if(no == false){
            System.out.println(number + " is a prime number");
        } else{
            System.out.println(number + " is not a prime number");
        }
    }
}
// line added