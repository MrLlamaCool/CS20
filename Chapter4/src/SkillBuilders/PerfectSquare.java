/*

Program: PerfectSquare.java          Last Date of this Revision: 10/9/2026

Purpose: An application that calculates if the users integer input is a perfect square or not.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/

package SkillBuilders;
import java.util.Scanner;


public class PerfectSquare {

	public static void main(String[] args) {
	
		//Create user input
		Scanner userinput = new Scanner(System.in);
		
		//Enter the integer
		System.out.println("Enter integer: ");
		
		if(isPerfectSquare(userinput.nextInt()))
		{
			System.out.println("This number is a perfect square.");
		}
		else
		{
			System.out.println("This number is not a perfect square.");
		}

	}
	
	public static boolean isPerfectSquare(int num) {
	    if (num < 0) return false;
	    
	    int sqrt = (int) Math.sqrt(num);
	    return (sqrt * sqrt == num);
	}

}


/*  Screen Dump

Enter integer: 
6
This number is not a perfect square.

*/