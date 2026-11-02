/*

Program: OddSum.java          Last Date of this Revision: 10/29/2026

Purpose: An application that prompts the user for a number and then sums the odd numbers from 1 to the number entered.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/

package SkillBuilders;
import java.util.Scanner;


public class OddSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        
        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int maxNumber = scanner.nextInt();
            
            // Validate that the number is positive
            if (maxNumber < 1) {
                System.out.println("Please enter a number greater than or equal to 1.");
            } else {
                int sum = 0;
                
                // Loop through numbers from 1 to the entered number
                for (int i = 1; i <= maxNumber; i++) {
                    // Check if the number is odd
                    if (i % 2 != 0) {
                        sum += i;
                    }
                }
                
                // Output final result
                System.out.println("The sum of odd numbers from 1 to " + maxNumber + " is: " + sum);
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }
	}

}

/*  Screen Dump

Enter a positive integer: 14
The sum of odd numbers from 1 to 14 is: 49


*/