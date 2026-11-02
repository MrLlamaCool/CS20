/*

Program: DigitsDisplay.java          Last Date of this Revision: 11/2/2026

Purpose: An application that prompts the user for a non-negative integer and then displays each digit on a separate line.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;
import java.util.Scanner;

public class DigitsDisplay {

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

        // Convert the number to a string to easily separate each character
        String numberStr = Integer.toString(number);

        // Loop through each character of the string and print it on a new line
        for (int i = 0; i < numberStr.length(); i++) {
            System.out.println(numberStr.charAt(i));
        }

	}

}


/*  Screen Dump

Enter a positive integer: 542
5
4
2

*/