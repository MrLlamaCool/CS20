/*

Program: DigitsSum.java          Last Date of this Revision: 11/2/2026

Purpose: An application that prompts the user for a non-negative integer and then displays the sum of the digits.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/


package Mastery;
import java.util.Scanner;


public class DigitsSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int number = -1;

        // Prompt the user and check if the input is a non-negative integer
        while (number < 0) {
            System.out.print("Enter a positive integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("The number must be 0 or greater.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        int originalNumber = number;
        int sum = 0;

        // If the number is 0, the sum is 0
        if (number == 0) {
            sum = 0;
        } else {
            // Extract and add each digit
            while (number > 0) {
                sum += number % 10;  // Take the last digit and add it to sum
                number = number / 10; // Remove the last digit from the number
            }
        }

        // Display the result
        System.out.println("The sum of the digits is: " + sum);

        scanner.close();
        
	}

}

/*  Screen Dump

Enter a positive integer: 892
The sum of the digits is: 19

*/