/*

Program: NumbersSum.java          Last Date of this Revision: 10/27/2026

Purpose: An application that prompts the user for a number and then displays the numbers 1 through the number entered. Below the numbers is the sum.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/

package SkillBuilders;
import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int limit = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= limit; i++) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("Sum: " + sum);
	}

}

/*  Screen Dump

Enter a positive integer: 5
1
2
3
4
5
Sum: 15


*/