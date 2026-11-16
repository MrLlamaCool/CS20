/*

Program: IsoTriangle.java          Last Date of this Revision: 11/16/2026

Purpose: Create an IsoTriangle application that prompts the user for the size of an isosceles triangle and then displays the triangle with that many lines.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/


package Mastery;
import java.util.Scanner;

public class IsoTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        // Loop through each row of the triangle
        for (int row = 1; row <= size; row++) {
            // Print leading spaces to center the triangle
            addSpace(size - row);

            // Print asterisks for the current row (1, 3, 5, etc.)
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }

    // Prints a specified number of space characters on the same line.
    public static void addSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}

/*  Screen Dump

Enter the size: 4
   *
  ***
 *****
*******

*/