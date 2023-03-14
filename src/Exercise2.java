/**
 * @class: Exercise2
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: February 27, 2023
 * description: this program allows the user to enter as many scores as they want. once they have entered
 * as many scores as they want they type in an integer which causes the hasNextInt method to be false
 * thus stopping the while loop from running. it prints the average afterwards
 */
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        System.out.print("Enter as many scores you like when you are done enter any character:");
        while(input.hasNextInt()){
            System.out.print("Enter as many scores you like when you are done enter any character:");
            int grade = input.nextInt();
            sum += grade;
            count++;
            }System.out.println((sum / count) + " is your average");
        }
    }
    // line added

