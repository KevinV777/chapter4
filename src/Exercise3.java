/**
 * @class: Exercise3
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: March 12, 2023
 * description: this program takes grades from the user then computes whether it is the highest or lowest value.
 * It prints whichever they are respectively.
 */
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter as many scores you like when you are done enter any character:");
        int max = input.nextInt();
        int min = max;
        while(input.hasNextInt()){
            int number = input.nextInt();
            if(number >= max){
                max = number;
            }
            if(number <= min){
                min = number;
            }
        }
        System.out.println("Highest grade is: " + max);
        System.out.println("Lowest grade is: " + min);
    }
}
//line added